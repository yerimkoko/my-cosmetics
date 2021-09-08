package com.example.mycosmetics.dto.board;
import com.example.mycosmetics.domain.board.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class BoardRequestDto {

    private Long memberId;

    private String name;

    private String memo;

    private LocalDate effectiveTime;

    private Long categoryId;

    @Builder
    public BoardRequestDto (Long memberId, String name, String memo, LocalDate effectiveTime, Long categoryId) {

        this.memberId = memberId;
        this.name = name;
        this.memo = memo;
        this.effectiveTime = effectiveTime;
        this.categoryId = categoryId;

    }

    public Board toEntity() {

        return Board.builder()
                .memberId(memberId)
                .name(name)
                .memo(memo)
                .categoryId(categoryId)
                .effectiveDate(effectiveTime)
                .build();

    }

}
