package cours.apprentissage.productmanagement.business.category;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICategory {
    Mono<CategoryDTO> saveCategroy(CategoryDTO categoryDTO);
    Mono<CategoryDTO> updateCategory(CategoryDTO categoryDTO);
    Mono<CategoryDTO> getCategoryById(Long id);
    Mono<Void>deleteCategoryById(Long id);
    Flux<CategoryDTO> getAllCategories();
}
