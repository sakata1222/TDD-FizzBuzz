package jp.gr.java_conf.saka.todo.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void prepareForEachTest() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void convert_returns_1_as_string_when_1_is_specified() {
    // execution and verification
    assertThat(fizzBuzz.convert(1)).isEqualTo("1");
  }

  @Test
  void convert_returns_2_as_string_when_2_is_specified() {
    // execution and verification
    assertThat(fizzBuzz.convert(2)).isEqualTo("2");
  }

  @Test
  void convert_returns_Fizz_when_3_is_specified() {
    // execution and verification
    assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
  }
}
