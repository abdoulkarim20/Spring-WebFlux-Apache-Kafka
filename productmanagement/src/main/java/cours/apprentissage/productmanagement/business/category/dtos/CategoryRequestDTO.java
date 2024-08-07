package cours.apprentissage.productmanagement.business.category.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CategoryRequestDTO {
    private String topicName;
    private String message;
}
