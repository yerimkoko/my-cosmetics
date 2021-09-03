package com.example.mycosmetics.domain;

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
        String validity = "AA9";

        // when
        Calculator calculator = new Calculator(validity);

        // then
        assertThat(calculator.getYear()).isEqualTo(2019);
        assertThat(calculator.getMonth()).isEqualTo(10);
    }

}