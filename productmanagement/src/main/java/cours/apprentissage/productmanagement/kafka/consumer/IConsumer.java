package cours.apprentissage.productmanagement.kafka.consumer;

import cours.apprentissage.productmanagement.business.stream.dtos.MessageRequestDTO;

public interface IConsumer {
    void readKafkaJsonObject(MessageRequestDTO payload);
    void readWikimediaMessageStreaming(String message);
}
