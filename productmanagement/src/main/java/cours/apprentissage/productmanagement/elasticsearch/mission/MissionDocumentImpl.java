package cours.apprentissage.productmanagement.elasticsearch.mission;

import com.fasterxml.jackson.core.JsonProcessingException;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionTransporteurDTO;
import cours.apprentissage.productmanagement.elasticsearch.dtos.MissionWrapperDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@Transactional
@Slf4j
public class MissionDocumentImpl implements IMissionDocument {
    private final MissionDocumentRepository missionDocumentRepository;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MissionDocumentImpl(MissionDocumentRepository missionDocumentRepository, KafkaTemplate<String, String> kafkaTemplate) {
        this.missionDocumentRepository = missionDocumentRepository;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void saveMissionAsDocument(MissionTransporteurDTO missionDocument) {
        Message<MissionTransporteurDTO> message= MessageBuilder
                .withPayload(missionDocument)
                .setHeader(KafkaHeaders.TOPIC,"create-09")
                .build();
        log.info("mission event {}", message);
        log.info("mission document: {}", missionDocument);
        kafkaTemplate.send(message);
        log.info("The message sending is : {}", message);
        //missionDocumentRepository.save(missionDocument);
    }

    @Override
    public List<MissionDocument> getMissionDocuments() {
        Iterable<MissionDocument> missionDocuments = missionDocumentRepository.findAll();
        return StreamSupport.stream(missionDocuments.spliterator(), false).toList();
    }

    @Override
    public void sendMissionToPortApplication(MissionWrapperDTO o) {
        Message<MissionWrapperDTO> message= MessageBuilder
                .withPayload(o)
                .setHeader(KafkaHeaders.TOPIC,"create-mission")
                .build();
        log.info("mission event {}", message);
        kafkaTemplate.send(message);
        log.info("The message sending is : {}", message);
        //missionDocumentRepository.save(o);
    }
}
