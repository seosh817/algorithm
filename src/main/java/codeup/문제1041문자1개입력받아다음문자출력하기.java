package codeup;

import java.util.Scanner;

public class 문제1041문자1개입력받아다음문자출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char ascii = string.charAt(0);
        int nextValue = (int) ascii + 1;
        char nextAscii = (char) nextValue;
        System.out.println(nextAscii);
    }
}
