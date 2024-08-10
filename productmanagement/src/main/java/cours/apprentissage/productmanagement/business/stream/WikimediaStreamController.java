package cours.apprentissage.productmanagement.business.stream;

import cours.apprentissage.productmanagement.business.stream.dtos.MessageRequestDTO;
import cours.apprentissage.productmanagement.kafka.producer.KafkaJsonProducer;
import cours.apprentissage.productmanagement.kafka.producer.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaStreamController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    public WikimediaStreamController(KafkaProducer kafkaProducer, KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaProducer = kafkaProducer;
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody MessageRequestDTO messageRequestDTO) {
        kafkaProducer.send(messageRequestDTO.getTopicName(), messageRequestDTO.getMessage());
    }
    @PostMapping("/json-message")
    public void sendJsonMessage(@RequestBody MessageRequestDTO messageRequestDTO) {
        kafkaJsonProducer.send(messageRequestDTO);
    }
}
