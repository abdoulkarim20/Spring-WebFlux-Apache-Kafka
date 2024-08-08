package cours.apprentissage.productmanagement.business.consumer;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryRequestDTO;

public interface IConsumer {
    void readKafkaJsonObject(CategoryRequestDTO payload);
}
