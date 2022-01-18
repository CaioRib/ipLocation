package com.caiorib.spring.course.services.impl;

import com.caiorib.spring.course.domain.CategoryEntity;
import com.caiorib.spring.course.repositories.CategoryRepository;
import com.caiorib.spring.course.services.CategoryService;
import com.caiorib.spring.course.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryEntity findOne(Long id) {
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id));
    }

}
