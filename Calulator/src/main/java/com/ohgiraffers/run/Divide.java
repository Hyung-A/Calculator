package com.ohgiraffers.run;

public class Divide {

    public int divideFunction(int a, int b){
        int result = 0;

        try {
            result = a/b;
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            throw new ArithmeticException();
        }

        return result;
    }
}
