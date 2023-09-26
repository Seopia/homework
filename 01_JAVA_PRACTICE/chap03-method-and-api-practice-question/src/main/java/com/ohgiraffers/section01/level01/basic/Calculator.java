package com.ohgiraffers.section01.level01.basic;

public class Calculator {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public String sumTwoNumber(int a, int b){
        return String.valueOf(a+b);
    }

    public String multiTwoNumber(int a,int b) {
        return String.valueOf(a*b);
    }

    public int multiTwoNumber2(int a,int b) {
        return a*b;
    }
}
