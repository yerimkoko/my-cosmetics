package com.example.mycosmetics.domain.board;

import com.example.mycosmetics.domain.BaseTimeEntity;
import com.example.mycosmetics.domain.category.Category;
import com.example.mycosmetics.domain.category.CategoryRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Entity
@Getter
public class Board extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate effectiveDate;

    @Column
    private String memo;

    @Column
    private Long memberId;

    @Column
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private Long categoryId;

    @Builder
    public Board(Long memberId, String name, LocalDate effectiveDate, String memo, Long categoryId) {
        this.name = name;
        this.effectiveDate = effectiveDate;
        this.memo = memo;
        this.memberId = memberId;
        this.isDeleted = false;
        this.categoryId = categoryId;

    }

}
