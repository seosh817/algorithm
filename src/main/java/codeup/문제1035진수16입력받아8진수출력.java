package codeup;

import java.util.Scanner;

public class 문제1035진수16입력받아8진수출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //16진법 -> 8진법
        int hexadecimal = Integer.parseInt(string, 16);
        System.out.println(String.format("%o", hexadecimal));

    }
}
