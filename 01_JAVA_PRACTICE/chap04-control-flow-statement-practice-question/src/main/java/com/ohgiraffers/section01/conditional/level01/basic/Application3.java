package com.ohgiraffers.section01.conditional.level01.basic;
import java.util.Scanner;
public class Application3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요 : ");
        String id = sc.nextLine();
        if (id.length() == 14) {
            if (id.charAt(7) == '1' || id.charAt(7) == '3') {
                System.out.println("남자 입니다.");
            } else if (id.charAt(7) == '2' || id.charAt(7) == '4') {
                System.out.println("여자 입니다.");
            }
        } else {
            System.out.println("형식에 맞게 입력해주세요.");
        }
    }
}
