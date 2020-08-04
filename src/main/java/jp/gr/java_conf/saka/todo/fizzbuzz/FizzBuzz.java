package jp.gr.java_conf.saka.todo.fizzbuzz;

public class FizzBuzz {

  public String convert(int number) {
    if (number == 3) {
      return "Fizz";
    }
    return Integer.toString(number);
  }
}
