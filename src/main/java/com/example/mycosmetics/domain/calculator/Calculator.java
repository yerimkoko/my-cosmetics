package com.example.mycosmetics.domain.calculator;

import com.example.mycosmetics.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Calculator extends BaseTimeEntity {

    private static final int STATIC_MAKE_ASCII_MINUS = 64;
    private static final int STATIC_MAKE_ASCII_MULTIPLE = 10;
    private static final int STATIC_YEAR = 2000;

    private int year;
    private int month;

    public Calculator(String validity) {

        String[] date = validity.split("");

        int tens = (date[0].charAt(0) - STATIC_MAKE_ASCII_MINUS) * STATIC_MAKE_ASCII_MULTIPLE;

        this.year = tens + Integer.parseInt(date[2], 16) + STATIC_YEAR;
        this.month = Integer.parseInt(date[1], 16);

    }

}
