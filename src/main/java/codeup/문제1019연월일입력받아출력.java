package codeup;

import java.util.Scanner;

//연월일 입력받아 그대로 출력하기
//https://codeup.kr/submitpage.php?id=1019
public class 문제1019연월일입력받아출력 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] arr = date.split("\\."); // 특수문자는 \\ 붙여야함
        System.out.println(String.format("%04d.%02d.%02d\n", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));  //4자릿수가 아니면 0 붙이고 2자릿수 아니면 0 붙이고
    }
}
