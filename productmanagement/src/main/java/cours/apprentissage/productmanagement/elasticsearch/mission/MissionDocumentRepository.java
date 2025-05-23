package cours.apprentissage.productmanagement.elasticsearch.mission;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionDocumentRepository extends ElasticsearchRepository<MissionDocument, Long> {
}