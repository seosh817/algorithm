package codeup;

import java.util.Scanner;

public class 문제1076문자1개입력받아알파벳출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);

        char startWord = 'a';

        while(startWord <= word) {
            System.out.print(startWord + " ");
            startWord++;
        }
    }
}
