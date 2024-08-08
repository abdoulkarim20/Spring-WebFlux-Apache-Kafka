package cours.apprentissage.productmanagement.business.category;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryRequestDTO;
import cours.apprentissage.productmanagement.kafka.producer.KafkaJsonProducer;
import cours.apprentissage.productmanagement.kafka.producer.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    public CategoryController(KafkaProducer kafkaProducer, KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaProducer = kafkaProducer;
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody CategoryRequestDTO categoryRequestDTO) {
        kafkaProducer.send(categoryRequestDTO.getTopicName(), categoryRequestDTO.getMessage());
    }
    @PostMapping("/json-message")
    public void sendJsonMessage(@RequestBody CategoryRequestDTO categoryRequestDTO) {
        kafkaJsonProducer.send(categoryRequestDTO);
    }
}
