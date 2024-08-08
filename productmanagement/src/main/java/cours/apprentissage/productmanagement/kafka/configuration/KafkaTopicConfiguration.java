package cours.apprentissage.productmanagement.kafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic productTopic() {
        return TopicBuilder.name("product-management").build();
    }
    @Bean
    public NewTopic productTopicJson() {
        return TopicBuilder.name("product-json").build();
    }
}
