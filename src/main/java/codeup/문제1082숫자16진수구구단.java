package codeup;

import java.util.Scanner;

public class 문제1082숫자16진수구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int num = Integer.parseInt(string, 16);

        for(int i=1; i<16; i++) {
            System.out.println(String.format("%X*%X=%X", num, i, num*i));
        }
    }
}
