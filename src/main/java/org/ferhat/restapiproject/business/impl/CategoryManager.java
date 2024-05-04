package org.ferhat.restapiproject.business.impl;

import org.ferhat.restapiproject.business.abstracts.ICategoryService;
import org.ferhat.restapiproject.dao.CategoryRepo;
import org.ferhat.restapiproject.entity.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager implements ICategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryManager(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category save(Category category) {
        return this.categoryRepo.save(category);
    }
}
