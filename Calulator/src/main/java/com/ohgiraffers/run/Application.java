package com.ohgiraffers.run;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Application Calculator = new Application();
        Scanner sc = new Scanner(System.in);
        System.out.print("계산하고싶은 첫 번째 정수를 입력해주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("계산하고싶은 두 번째 정수를 입력해주세요 : ");
        int secondNum = sc.nextInt();

//        Calculator.plusFunction(firstNum, secondNum);
//        Calculator.minusFunction(firstNum, secondNum);
        Calculator.multipleFunction(firstNum, secondNum);
//        Calculator.divideFunction(firstNum, secondNum);
//        Calculator.modFunction(firstNum, secondNum);



    }

    // 곱하기 기능 만들기
    public int multipleFunction(int a, int b){

        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);

        return result;
    }

}
