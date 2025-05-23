package cours.apprentissage.productmanagement.elasticsearch.dtos;

import lombok.Data;

@Data
public class EntrepriseTransporteurDTO {
    private String numeroIdentification;
    private String libelle;

    public String getNumeroIdentification() {
        return numeroIdentification;
    }

    public void setNumeroIdentification(String numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
