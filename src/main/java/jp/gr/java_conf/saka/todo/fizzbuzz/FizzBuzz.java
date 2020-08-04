package jp.gr.java_conf.saka.todo.fizzbuzz;

public class FizzBuzz {

  public String convert(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(number);
  }
}
