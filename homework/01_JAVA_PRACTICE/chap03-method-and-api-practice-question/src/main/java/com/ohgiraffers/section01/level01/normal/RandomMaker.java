package com.ohgiraffers.section01.level01.normal;
import java.util.Random;
public class RandomMaker {

    public static String rockPaperScissors() {
        Random rd = new Random();
        int a = rd.nextInt(99);
        if (a<33) {
            return "가위";
        } else if (a>66) {
            return "바위";
        } else {
             return "보";
        }
    }
    public static String tossCoin() {
        Random rd = new Random();
        int a = rd.nextInt(100);
        if (a<50) {
            return "앞면";
        } else {
            return "뒷면";
        }
    }
}
