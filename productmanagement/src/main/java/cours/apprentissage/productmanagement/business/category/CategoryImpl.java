package cours.apprentissage.productmanagement.business.category;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryDTO;
import cours.apprentissage.productmanagement.business.category.mappers.CategorySaveRequestMapper;
import cours.apprentissage.productmanagement.business.stream.dtos.MessageRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static java.lang.String.format;

@Service
@Transactional
@Slf4j
public class CategoryImpl implements ICategory {
    private final CategoryRepository categoryRepository;
    private final CategorySaveRequestMapper categorySaveRequestMapper;
    private final KafkaTemplate<String, CategoryDTO> kafkaTemplate;

    public CategoryImpl(CategoryRepository categoryRepository, CategorySaveRequestMapper categorySaveRequestMapper, KafkaTemplate<String, CategoryDTO> kafkaTemplate) {
        this.categoryRepository = categoryRepository;
        this.categorySaveRequestMapper = categorySaveRequestMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Mono<CategoryDTO> saveCategroy(CategoryDTO categoryDTO) {
        Category category = categorySaveRequestMapper.toEntity(categoryDTO);
        Mono<Category> categoryMono = categoryRepository.save(category);
        return categoryMono.map(categorySaveRequestMapper::toDto);
    }

    @Override
    public Mono<CategoryDTO> updateCategory(CategoryDTO categoryDTO) {
        Category category = categorySaveRequestMapper.toEntity(categoryDTO);
        Mono<Category> categoryMono = categoryRepository.save(category);
        return categoryMono.map(categorySaveRequestMapper::toDto);
    }

    @Override
    public Mono<CategoryDTO> getCategoryById(Long id) {
        Mono<Category> categoryMono = categoryRepository.findById(id);
        return categoryMono.map(categorySaveRequestMapper::toDto);
    }

    @Override
    public Mono<Void> deleteCategoryById(Long id) {
        return categoryRepository.deleteById(id);
    }

    @Override
    public Flux<CategoryDTO> getAllCategories() {
        Flux<Category> categoryFlux = categoryRepository.findAll();
        categoryFlux.doOnNext(item -> {
            Message<Category> message= MessageBuilder
                    .withPayload(item)
                    .setHeader(KafkaHeaders.TOPIC,"category-json")
                    .build();
            kafkaTemplate.send(message);
        }).subscribe();
        return categoryFlux.map(categorySaveRequestMapper::toDto);
    }
}
