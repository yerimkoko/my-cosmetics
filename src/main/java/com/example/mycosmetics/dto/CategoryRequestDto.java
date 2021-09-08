package com.example.mycosmetics.dto;

import com.example.mycosmetics.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CategoryRequestDto {
    private String name;

    public CategoryRequestDto(String name) {
        this.name = name;
    }

    public Category toEntity() {
        Category category = new Category(name);

        return category;

    }

}
