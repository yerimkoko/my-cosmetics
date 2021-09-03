package com.example.mycosmetics.dto;


import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CalculatorResponseDto {
    private int year;
    private int month;

    @Builder
    public CalculatorResponseDto(int month, int year){
        this.month = month;
        this.year = year;
    }
}
