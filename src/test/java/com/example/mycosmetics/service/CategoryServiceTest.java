package com.example.mycosmetics.service;

import com.example.mycosmetics.dto.CategoryRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CategoryServiceTest {
    @Autowired
    private CategoryService service;

    @Test
    void 카테고리를_저장한다() {
        // given
        String name = "색조";
        CategoryRequestDto dto = new CategoryRequestDto(name);

        // when
        service.categoryCreate(dto);

        // then
        assertThat(dto.getName()).isEqualTo(name);
    }

}
