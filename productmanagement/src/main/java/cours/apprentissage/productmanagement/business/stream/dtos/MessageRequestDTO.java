package cours.apprentissage.productmanagement.business.stream.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MessageRequestDTO {
    private String topicName;
    private String message;
}
