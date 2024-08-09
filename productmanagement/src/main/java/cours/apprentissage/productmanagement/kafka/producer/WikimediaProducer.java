package cours.apprentissage.productmanagement.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public WikimediaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String payload) {
        Message<String> message = MessageBuilder.withPayload(payload).setHeader(KafkaHeaders.TOPIC, "wikimedia-stream").build();
        kafkaTemplate.send(message);
    }
}
