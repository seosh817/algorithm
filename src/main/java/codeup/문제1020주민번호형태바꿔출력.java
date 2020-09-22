package codeup;

import java.util.Scanner;


//https://codeup.kr/problem.php?id=1020
public class 문제1020주민번호형태바꿔출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] arr = date.split("\\-");
        System.out.println(arr[0] + arr[1]);
    }
}
