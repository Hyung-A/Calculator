package com.ohgiraffers.run;

public class Mod {

    public int modFunction(int a, int b){
        int result = 0;


//        round는 반올림
        try{
            result = a%b;
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            throw new ArithmeticException();
        }
        return result;
    }

}
