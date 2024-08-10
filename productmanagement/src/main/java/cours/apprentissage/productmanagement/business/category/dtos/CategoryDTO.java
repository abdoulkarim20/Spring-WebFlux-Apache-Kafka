package cours.apprentissage.productmanagement.business.category.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CategoryDTO {
    private Long id;
    private String libelle;
    private String description;
}
