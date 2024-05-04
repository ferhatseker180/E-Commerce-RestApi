package org.ferhat.restapiproject.api;

import jakarta.validation.Valid;
import org.ferhat.restapiproject.business.abstracts.ICategoryService;
import org.ferhat.restapiproject.core.config.modelMapper.IModelMapperService;
import org.ferhat.restapiproject.core.result.Result;
import org.ferhat.restapiproject.core.result.ResultData;
import org.ferhat.restapiproject.core.utils.ResultHelper;
import org.ferhat.restapiproject.dto.request.category.CategorySaveRequest;
import org.ferhat.restapiproject.dto.response.category.CategoryResponse;
import org.ferhat.restapiproject.entity.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    private final ICategoryService categoryService;
    private final IModelMapperService modelMapperService;

    public CategoryController(ICategoryService categoryService, IModelMapperService modelMapperService) {
        this.categoryService = categoryService;
        this.modelMapperService = modelMapperService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<CategoryResponse> save(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {
        Category saveCategory = this.modelMapperService.forRequest().map(categorySaveRequest, Category.class);
        this.categoryService.save(saveCategory);
        return ResultHelper.created(this.modelMapperService.forResponse().map(saveCategory, CategoryResponse.class));
    }
}
