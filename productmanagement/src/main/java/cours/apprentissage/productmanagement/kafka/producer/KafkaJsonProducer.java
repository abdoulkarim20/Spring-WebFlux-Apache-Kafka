package cours.apprentissage.productmanagement.kafka.producer;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonProducer {
    private final KafkaTemplate<String, CategoryRequestDTO> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, CategoryRequestDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(CategoryRequestDTO categoryRequestDTO) {
        Message<CategoryRequestDTO>message= MessageBuilder
                .withPayload(categoryRequestDTO)
                .setHeader(KafkaHeaders.TOPIC,"product-json")
                .build();
        kafkaTemplate.send(message);
    }
}
