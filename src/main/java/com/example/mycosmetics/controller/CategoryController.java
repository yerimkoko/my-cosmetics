package com.example.mycosmetics.controller;

import com.example.mycosmetics.dto.CategoryRequestDto;
import com.example.mycosmetics.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService service;

    @PostMapping("/api/v1/category")
    public Long saveCategory(@RequestBody CategoryRequestDto dto) {

        return service.categoryCreate(dto).getId();

    }

}

