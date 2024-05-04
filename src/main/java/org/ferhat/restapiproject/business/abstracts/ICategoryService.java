package org.ferhat.restapiproject.business.abstracts;

import org.ferhat.restapiproject.entity.Category;

import java.util.List;

public interface ICategoryService {

    Category save(Category category);
    Category get(int id);
}
