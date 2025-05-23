package cours.apprentissage.productmanagement.elasticsearch.dtos;

import lombok.Data;

@Data
public class OperateurTransporteurDTO {
    private String code;
    private String operateurLibelle;
    private PortTransporteurDTO port;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperateurLibelle() {
        return operateurLibelle;
    }

    public void setOperateurLibelle(String operateurLibelle) {
        this.operateurLibelle = operateurLibelle;
    }

    public PortTransporteurDTO getPort() {
        return port;
    }

    public void setPort(PortTransporteurDTO port) {
        this.port = port;
    }
}
