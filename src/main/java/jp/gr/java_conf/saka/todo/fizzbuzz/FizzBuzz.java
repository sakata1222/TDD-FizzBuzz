package jp.gr.java_conf.saka.todo.fizzbuzz;

public class FizzBuzz {

  public String convert(int number) {
    var converted = new StringBuilder();
    if (number % 3 == 0) {
      converted.append("Fizz");
    }
    if (number % 5 == 0) {
      converted.append("Buzz");
    }
    if (converted.length() != 0) {
      return converted.toString();
    } else {
      return Integer.toString(number);
    }
  }
}
