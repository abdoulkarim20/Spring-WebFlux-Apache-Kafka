package cours.apprentissage.productmanagement.elasticsearch.mission;

import com.fasterxml.jackson.core.JsonProcessingException;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionTransporteurDTO;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionWrapperDTO;

import java.util.List;

public interface IMissionDocument {
    void saveMissionAsDocument(MissionTransporteurDTO missionDocument);

    List<MissionDocument> getMissionDocuments();
    void sendMissionToPortApplication(MissionWrapperDTO o) throws JsonProcessingException;
}
