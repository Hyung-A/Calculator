package com.ohgiraffers.run;

public class Divide {

    public static void main(String[] args) {
        Divide dv = new Divide();

        int result = dv.divideFunction(10,0);
        System.out.println("result = " + result);


    }


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
