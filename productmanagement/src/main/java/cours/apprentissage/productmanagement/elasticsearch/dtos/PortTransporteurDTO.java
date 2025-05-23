package cours.apprentissage.productmanagement.elasticsearch.dtos;

import lombok.Data;

@Data
public class PortTransporteurDTO {
    private String code;
    private String portLibelle;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPortLibelle() {
        return portLibelle;
    }

    public void setPortLibelle(String portLibelle) {
        this.portLibelle = portLibelle;
    }
}
