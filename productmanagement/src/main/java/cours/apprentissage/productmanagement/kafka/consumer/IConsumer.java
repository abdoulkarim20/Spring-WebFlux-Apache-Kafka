package cours.apprentissage.productmanagement.kafka.consumer;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryRequestDTO;

public interface IConsumer {
    void readKafkaJsonObject(CategoryRequestDTO payload);
    void readWikimediaMessageStreaming(String message);
}
