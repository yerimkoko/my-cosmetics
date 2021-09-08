package com.example.mycosmetics.service;

import com.example.mycosmetics.domain.board.BoardRepository;
import com.example.mycosmetics.dto.board.BoardRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardServiceTest {

    @Autowired
    private BoardService service;

    @Autowired
    private BoardRepository repository;

    @AfterEach
    void cleanUp() {
        repository.deleteAll();
    }

    @Test
    void 글을_저장한다() {
        // given
        String name = "루비우";
        String memo = "매우 매트해요..";
        Long memberId = 1L;
        Long categoryId = 1L;
        LocalDate effectiveTime = LocalDate.of(2023,5,20);

        BoardRequestDto dto = BoardRequestDto.builder()
                .name(name)
                .categoryId(categoryId)
                .memo(memo)
                .memberId(memberId)
                .effectiveTime(effectiveTime)
                .build();

        // when
        service.save(dto);

        // then
        assertThat(dto.getMemo()).isEqualTo(memo);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getMemberId()).isEqualTo(memberId);
        assertThat(dto.getEffectiveTime()).isEqualTo(effectiveTime);
        assertThat(dto.getCategoryId()).isEqualTo(categoryId);

    }

}
