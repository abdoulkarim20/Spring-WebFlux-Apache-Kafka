package cours.apprentissage.productmanagement.elasticsearch.dtos;

import lombok.Data;

@Data
public class CamionTransporteurDTO {
    private String marque;
    private String numeroPlaque;
    private String nationalite;
    private EntrepriseTransporteurDTO entreprise;
}
