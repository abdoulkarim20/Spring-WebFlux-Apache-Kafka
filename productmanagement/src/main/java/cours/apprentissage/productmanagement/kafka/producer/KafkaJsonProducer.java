package cours.apprentissage.productmanagement.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonProducer {
    /*private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(MessageRequestDTO messageRequestDTO) {
        Message<MessageRequestDTO>message= MessageBuilder
                .withPayload(messageRequestDTO)
                .setHeader(KafkaHeaders.TOPIC,"product-json")
                .build();
        kafkaTemplate.send(message);
    }*/
}
