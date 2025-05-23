package cours.apprentissage.productmanagement.elasticsearch.mission;

import com.fasterxml.jackson.core.JsonProcessingException;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionTransporteurDTO;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionWrapperDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/mission-documents")
public class MissionDocumentController {
    private final IMissionDocument iMissionDocument;

    public MissionDocumentController(IMissionDocument iMissionDocument) {
        this.iMissionDocument = iMissionDocument;
    }

    @GetMapping(value = "/liste",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MissionDocument> listeProduit() {
        return iMissionDocument.getMissionDocuments();
    }
    @PostMapping("/mission-transporteur")
    public void changeTransportMission(@RequestBody MissionWrapperDTO missionTransporteurDTO) throws JsonProcessingException {
        log.info("Les donnees sont : {}",missionTransporteurDTO);
        iMissionDocument.sendMissionToPortApplication(missionTransporteurDTO);
        //return null;
    }
}
