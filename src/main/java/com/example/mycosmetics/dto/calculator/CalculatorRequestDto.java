package com.example.mycosmetics.dto.calculator;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CalculatorRequestDto {

    private String validity;

    @Builder
    public CalculatorRequestDto(String validity) {
        this.validity = validity;
    }

}
