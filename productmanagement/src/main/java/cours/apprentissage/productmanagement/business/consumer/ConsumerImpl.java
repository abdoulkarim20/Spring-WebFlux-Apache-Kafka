package cours.apprentissage.productmanagement.business.consumer;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class ConsumerImpl implements IConsumer{
    @Override
    @KafkaListener(topics = "product-json",groupId = "myGroup")
    public void readKafkaJsonObject(CategoryRequestDTO payload) {
        log.info(format("Les donnees venant du topic product-json sont : %s",payload.toString()));
    }
}
