package com.example.mycosmetics.domain;

import com.example.mycosmetics.domain.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 단위 테스트
 * 다른 의존성을 끊고 테스트를 수행.
 */
class CalculatorTest {

    @Test
    void 요청_코드를_통해_유효기간_정보를_가져온다() {
        // given
        String validity = "BA9";

        // when
        Calculator calculator = new Calculator(validity);

        // then
        assertThat(calculator.getYear()).isEqualTo(2029);
        assertThat(calculator.getMonth()).isEqualTo(10);
    }
    // testCase: 1) 요청코드가 오류일 때, 2) 요청 코드가 미래 코드 일 때. 3)

    @Test
    void 요청코드가_오류일때() {
        // given
        String validity = "2025";

        // when
        Calculator calculator = new Calculator(validity);

        // then
    }

}