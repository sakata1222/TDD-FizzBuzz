package jp.gr.java_conf.saka.todo.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("FizzBuzz class defines a convert rule of FizzBuzz problem")
class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void prepareForEachTest() {
    fizzBuzz = new FizzBuzz();
  }

  @Nested
  class Convert_returns_a_string_when_a_number_is_specified {

    @Nested
    class Convert_returns_a_string_directly_if_the_number_is_not_divisible_3_or_5 {

      @Test
      void convert_returns_1_as_string_when_1_is_specified() {
        // execution and verification
        assertThat(fizzBuzz.convert(1)).isEqualTo("1");
      }
    }

    @Nested
    class Convert_returns_Fizz_when_a_number_is_divisible_by_3 {

      @Test
      void convert_returns_Fizz_when_3_is_specified() {
        // execution and verification
        assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
      }
    }

    @Nested
    class Convert_returns_Buzz_when_a_number_is_divisible_by_5 {

      @Test
      void convert_returns_Buzz_when_5_is_specified() {
        // execution and verification
        assertThat(fizzBuzz.convert(5)).isEqualTo("Buzz");
      }
    }

    @Nested
    class Convert_returns_FizzBuzz_when_a_number_is_divisible_by_3_and_5 {

      @Test
      void convert_returns_FizzBuzz_when_15_is_specified() {
        // execution and verification
        assertThat(fizzBuzz.convert(15)).isEqualTo("FizzBuzz");
      }
    }
  }
}
