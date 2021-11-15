package com.example.mycosmetics.controller;

import com.example.mycosmetics.dto.calculator.CalculatorRequestDto;
import com.example.mycosmetics.dto.calculator.CalculatorResponseDto;
import com.example.mycosmetics.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CalculatorController {

    private final CalculatorService service;

    @GetMapping("/api/v1/mac-calculator")
    public CalculatorResponseDto calculator(@RequestBody CalculatorRequestDto dto) {
        return service.calculatorService(dto.getValidity());
    }

}
