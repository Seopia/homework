package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        Calculator calc =  new Calculator();
        calc.checkMethod();
        System.out.println("10과 20의 합은 "+calc.sumTwoNumber(10,20)+"입니다.");
        System.out.println("10과 20의 곱은 "+calc.multiTwoNumber(10,20)+"입니다.");
        System.out.println("10과 20의 곱은 "+calc.multiTwoNumber2(10,20)+"입니다.");
    }
}
