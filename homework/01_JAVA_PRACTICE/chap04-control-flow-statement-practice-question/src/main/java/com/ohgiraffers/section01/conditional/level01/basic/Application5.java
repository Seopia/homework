package com.ohgiraffers.section01.conditional.level01.basic;
import java.util.Scanner;
public class Application5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수를 입력하세요 : ");
        int people = sc.nextInt();
        System.out.print("사탕 개수를 입력하세요 : ");
        int candy = sc.nextInt();
        System.out.println("1인당 사탕 개수 : "+candy/people);
        System.out.println("남는 사탕 개수 : " +candy%people);


    }
}
