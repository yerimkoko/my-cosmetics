package com.example.mycosmetics.dto;

import com.example.mycosmetics.domain.Calculator;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CalculatorRequestDto {

    private String validty;

    @Builder
    public CalculatorRequestDto(String validity) {
        this.validty = validity;
    }



}
