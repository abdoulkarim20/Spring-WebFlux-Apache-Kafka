package cours.apprentissage.productmanagement.elasticsearch.mission;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Document(indexName = "missions")
@Data
public class MissionDocument {
    @Id
    private String id;
    @Field(type = FieldType.Keyword)
    private String identifiant;

    @Field(type = FieldType.Date, name = "date_debut", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateDebut;

    @Field(type = FieldType.Date, name = "date_fin", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateFin;

    @Field(type = FieldType.Date, name = "heure_mission", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime heureMission;

    @Field(type = FieldType.Date, name = "hour_out_truck", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime hourOutTruck;

    @Field(type = FieldType.Keyword)
    private Status status;

    // Chauffeur
    @Field(type = FieldType.Text, name = "chauffeur_nom_complet")
    private String chauffeurNomComplet;

    @Field(type = FieldType.Keyword, name = "chauffeur_telephone")
    private String chauffeurTelephone;

    @Field(type = FieldType.Keyword, name = "chauffeur_identity")
    private String numeroIdentificationChauffeur;

    // Camion
    @Field(type = FieldType.Keyword, name = "camion_numero_plaque")
    private String camionNumeroPlaque;

    @Field(type = FieldType.Keyword, name = "camion_entreprise_libelle")
    private String camionEntrepriseLibelle;

    @Field(type = FieldType.Text, name = "marque_camion")
    private String marqueCamion;

    @Field(type = FieldType.Keyword, name = "camion_entreprise_identity")
    private String camionEntrepriseNumIdentite;

    // Opérateur
    @Field(type = FieldType.Keyword, name = "operateur_libelle")
    private String operateurLibelle;

    @Field(type = FieldType.Keyword, name = "operateur_identity")
    private String operateurIdentite;

    // Port
    @Field(type = FieldType.Keyword, name = "port_libelle")
    private String portLibelle;

    @Field(type = FieldType.Keyword, name = "port_identity")
    private String portIdentite;
    @Field(type = FieldType.Date, name = "created_at", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;
    @Field(type = FieldType.Date, name = "updated_at", format = {}, pattern = "uuuu-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;
}
