package org.example.springboot.dto;

import org.example.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_func_test() {
        // given test data
        String name = "test";
        int amount = 1000;

        // when this happens
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // expected result
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
