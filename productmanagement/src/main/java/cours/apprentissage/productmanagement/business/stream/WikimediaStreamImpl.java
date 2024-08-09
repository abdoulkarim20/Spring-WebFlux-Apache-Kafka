package cours.apprentissage.productmanagement.business.stream;

import cours.apprentissage.productmanagement.kafka.producer.WikimediaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class WikimediaStreamImpl implements IWikimediaStream {
    private final WebClient webClient;
    private final WikimediaProducer wikimediaProducer;

    public WikimediaStreamImpl(WebClient.Builder webClientBuilder, WikimediaProducer wikimediaProducer) {
        this.webClient = webClientBuilder.baseUrl("https://stream.wikimedia.org/v2").build();
        this.wikimediaProducer = wikimediaProducer;
    }
    @Override
    public void consumeStreamAndPublish(){
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(wikimediaProducer::send);
    }
}
