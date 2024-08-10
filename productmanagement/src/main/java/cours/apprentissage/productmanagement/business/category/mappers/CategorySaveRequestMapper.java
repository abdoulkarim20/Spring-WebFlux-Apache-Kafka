package cours.apprentissage.productmanagement.business.category.mappers;

import cours.apprentissage.productmanagement.business.category.Category;
import cours.apprentissage.productmanagement.business.category.dtos.CategoryDTO;
import cours.apprentissage.productmanagement.utils.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorySaveRequestMapper extends EntityMapper<CategoryDTO, Category> {
}
