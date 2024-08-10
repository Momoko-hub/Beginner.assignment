package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //問題１

    Scanner scanner = new Scanner(System.in);
    //1番目の数字を入力してください:
    System.out.println("1番目の数字を入力してください：");
    int firstNumber = scanner.nextInt();

    //演算子を入力してください (+, -, *, /): +
    System.out.println("演算子を入力してください (+, -, *, /):");
    char operator = scanner.next().charAt(0);

    //2番目の数字を入力してください:
    System.out.println("2番目の数字を入力してください：");
    int secondNumber = scanner.nextInt();

    int result;
    int remainder;

    switch (operator) {
      case '+' -> {
        result = firstNumber + secondNumber;
        System.out.println(
            "計算結果：" + firstNumber + operator + secondNumber + "=" + result);
      }

      case '-' -> {
        result = firstNumber - secondNumber;
        System.out.println(
            "計算結果：" + firstNumber + operator + secondNumber + "=" + result);
      }

      case '*' -> {
        result = firstNumber * secondNumber;
        System.out.println(
            "計算結果：" + firstNumber + operator + secondNumber + "=" + result);
      }

      case '/' -> {
        result = firstNumber / secondNumber;
        remainder = firstNumber % secondNumber;
        System.out.println(
            "計算結果：" + firstNumber + operator + secondNumber + "=" + result + "あまり"
                + remainder);
      }

      default -> System.out.println("入力内容に誤りがあります");
    }

    scanner.close();

  }
}