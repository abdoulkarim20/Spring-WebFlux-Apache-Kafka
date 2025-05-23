package cours.apprentissage.productmanagement.elasticsearch.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import cours.apprentissage.productmanagement.elasticsearch.mission.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MissionTransporteurDTO {
    private String identifiant;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateDebut;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateFin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime heureMission;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime hourOutTunk;
    private Status status;
    private ChauffeurTransporteurDTO chauffeur;
    private CamionTransporteurDTO camion;
    private OperateurTransporteurDTO operateur;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public LocalDateTime getHeureMission() {
        return heureMission;
    }

    public void setHeureMission(LocalDateTime heureMission) {
        this.heureMission = heureMission;
    }

    public LocalDateTime getHourOutTunk() {
        return hourOutTunk;
    }

    public void setHourOutTunk(LocalDateTime hourOutTunk) {
        this.hourOutTunk = hourOutTunk;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ChauffeurTransporteurDTO getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(ChauffeurTransporteurDTO chauffeur) {
        this.chauffeur = chauffeur;
    }

    public CamionTransporteurDTO getCamion() {
        return camion;
    }

    public void setCamion(CamionTransporteurDTO camion) {
        this.camion = camion;
    }

    public OperateurTransporteurDTO getOperateur() {
        return operateur;
    }

    public void setOperateur(OperateurTransporteurDTO operateur) {
        this.operateur = operateur;
    }
}
