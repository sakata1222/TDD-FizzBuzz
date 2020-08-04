package jp.gr.java_conf.saka.todo.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void convert_1_to_1_as_string() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    var actual = fizzBuzz.convert(1);
    assertThat(actual).isEqualTo("1");
  }
}
