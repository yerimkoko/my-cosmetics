package com.example.mycosmetics.service;

import com.example.mycosmetics.domain.calculator.Calculator;
import com.example.mycosmetics.dto.calculator.CalculatorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CalculatorService {

    @Transactional
    public CalculatorResponseDto calculatorService(String validity) {
        Calculator calculator = new Calculator(validity);
        return new CalculatorResponseDto(calculator.getMonth(), calculator.getYear());
    }

}
