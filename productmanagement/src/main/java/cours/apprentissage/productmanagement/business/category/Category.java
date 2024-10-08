package cours.apprentissage.productmanagement.business.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table("td_categories")
public class Category {
    @Id
    private Long id;
    private String libelle;
    private String description;
}
