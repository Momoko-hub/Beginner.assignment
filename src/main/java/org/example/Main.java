package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //問題１

    Scanner scanner = new Scanner(System.in);

    try {
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
          if (secondNumber == 0) {
            System.out.println("0で割ることはできません");
          } else {
            result = firstNumber / secondNumber;
            remainder = firstNumber % secondNumber;
            System.out.println(
                "計算結果：" + firstNumber + operator + secondNumber + "=" + result + "あまり"
                    + remainder);
          }
        }

        default -> System.out.println("入力内容に誤りがあります。");
      }

    }catch (InputMismatchException e){
      System.out.println("無効な入力です。数値を入力してください。");
    }finally {
      scanner.close();
    }
  }
}