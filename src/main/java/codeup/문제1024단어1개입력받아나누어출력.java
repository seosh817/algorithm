package codeup;

import java.util.Scanner;


//https://codeup.kr/problem.php?id=1024
public class 문제1024단어1개입력받아나누어출력 {


    //문자열은 length() 컬렉션은 legnth
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] arr = string.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("'" + arr[i] + "'");
        }
    }
}