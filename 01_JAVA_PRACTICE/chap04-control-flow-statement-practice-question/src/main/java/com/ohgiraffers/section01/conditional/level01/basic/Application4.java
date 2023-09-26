package com.ohgiraffers.section01.conditional.level01.basic;
import java.util.Scanner;
public class Application4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        if (age>13) {
            if (age>19) {
                System.out.println("성인");
            } else {
                System.out.println("청소년");
            }
        } else {
            System.out.println("어린이");
        }
    }
}
