package com.ohgiraffers.section01.conditional.level01.basic;
import java.util.Scanner;
public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("짝수다");
        } else {
            System.out.println("홀수다.");
        }
    }
}
