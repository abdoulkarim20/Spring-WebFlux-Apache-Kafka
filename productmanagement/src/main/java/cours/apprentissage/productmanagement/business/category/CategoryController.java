package cours.apprentissage.productmanagement.business.category;

import cours.apprentissage.productmanagement.business.category.dtos.CategoryDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final ICategory iCategory;

    public CategoryController(ICategory iCategory) {
        this.iCategory = iCategory;
    }

    @PostMapping("/save")
    public Mono<CategoryDTO> save(@RequestBody CategoryDTO categoryDTO) {
        return iCategory.saveCategroy(categoryDTO);
    }

    @PutMapping("/update/{id}")
    public Mono<CategoryDTO> update(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO) {
        categoryDTO.setId(id);
        return iCategory.updateCategory(categoryDTO);
    }

    @GetMapping("/detail/{id}")
    public Mono<CategoryDTO> detail(@PathVariable Long id) {
        return iCategory.getCategoryById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return iCategory.deleteCategoryById(id);
    }

    @GetMapping("/liste")
    public Flux<CategoryDTO> getAllCategories() {
        return iCategory.getAllCategories();
    }
}
