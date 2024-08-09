package cours.apprentissage.productmanagement.business.stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {
    private final IWikimediaStream iWikimediaStream;

    public WikimediaController(IWikimediaStream iWikimediaStream) {
        this.iWikimediaStream = iWikimediaStream;
    }
    @GetMapping("")
    public void startPublishing(){
        iWikimediaStream.consumeStreamAndPublish();
    }
}
