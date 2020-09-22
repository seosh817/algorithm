package codeup;

import java.util.Scanner;

public class 문제1034진수8입력받아10진수출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //8진법 -> 10진법
        System.out.println(Integer.parseInt(string, 8));

    }
}
