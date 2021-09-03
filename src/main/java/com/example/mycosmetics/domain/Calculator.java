package com.example.mycosmetics.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Calculator {

    private static final int STATIC_YEAR = 2000;

    private int year;
    private int month;

    public Calculator(String validity) {

        String[] date = validity.split("");


        this.year = Integer.parseInt(date[0], 16) + Integer.parseInt(date[2], 16) + STATIC_YEAR;
        this.month = Integer.parseInt(date[1], 16);
    }

}
