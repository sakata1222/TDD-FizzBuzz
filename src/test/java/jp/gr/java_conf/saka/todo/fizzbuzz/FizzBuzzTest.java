package jp.gr.java_conf.saka.todo.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void convert_1_to_1_as_string() {
    // prepare
    var fizzBuzz = new FizzBuzz();
    // execution and verification
    assertThat(fizzBuzz.convert(1)).isEqualTo("1");
  }

  @Test
  void convert_2_to_2_as_string() {
    // prepare
    var fizzBuzz = new FizzBuzz();
    // execution and verification
    assertThat(fizzBuzz.convert(2)).isEqualTo("2");
  }
}
