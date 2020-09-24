package codeup;

import java.util.Scanner;

public class 문제1093이상한출석번호부르기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[23];
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            arr[a - 1] += 1;
        }

        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
