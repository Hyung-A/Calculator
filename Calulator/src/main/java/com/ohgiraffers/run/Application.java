package com.ohgiraffers.run;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("계산하고싶은 첫 번째 정수를 입력해주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("계산하고싶은 두 번째 정수를 입력해주세요 : ");
        int secondNum = sc.nextInt();
        sc.nextLine();
        System.out.print("계산하고 싶은 연산자를 입력해주세요 (+, -, *, /, %) : ");
        String cal = sc.nextLine();

        int result = 0;
        switch (cal){
//            case "+" : Plus calculator = new Plus();
//                       result = calculation.plusFunction(firstNum, secondNum); break;
//            case "-" : Minus calculator = new Minus();
//                       result = calculation.minusFunction(firstNum, secondNum); break;
            case "*" : Multiple calculator = new Multiple();
                       result = calculator.multipleFunction(firstNum, secondNum);
//            case "/" : Divide calculator  = new Divide();
//                       result = calculator.divideFunction(firstNum, secondNum); break;
//            case "%" : Mod calculator = new Mod();
//                       result = calculator.modFunction(firstNum, secondNum); break;
        }

        System.out.println(firstNum + cal + secondNum + " = " + result);
    }
}
