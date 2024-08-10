package cours.apprentissage.productmanagement.kafka.producer;

import cours.apprentissage.productmanagement.business.stream.dtos.MessageRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonProducer {
    private final KafkaTemplate<String, MessageRequestDTO> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, MessageRequestDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(MessageRequestDTO messageRequestDTO) {
        Message<MessageRequestDTO>message= MessageBuilder
                .withPayload(messageRequestDTO)
                .setHeader(KafkaHeaders.TOPIC,"product-json")
                .build();
        kafkaTemplate.send(message);
    }
}
