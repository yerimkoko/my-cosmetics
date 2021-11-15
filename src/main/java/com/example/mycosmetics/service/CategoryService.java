package com.example.mycosmetics.service;

import com.example.mycosmetics.domain.category.Category;
import com.example.mycosmetics.domain.category.CategoryRepository;
import com.example.mycosmetics.dto.CategoryRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public Category categoryCreate (CategoryRequestDto dto) {
         Category category = categoryRepository.save(dto.toEntity());
         return category;

    }


}
