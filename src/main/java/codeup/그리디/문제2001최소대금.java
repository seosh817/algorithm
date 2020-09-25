package codeup.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제2001최소대금 {

    static int getMinNum(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) min = a[i];
        }

        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] pasta = new int[3];
        int[] juice = new int[2];

        for (int i = 0; i < 3; i++) {
            pasta[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < 2; i++) {
            juice[i] = Integer.parseInt(br.readLine());
        }

        int minPasta = getMinNum(pasta);
        int minJuice = getMinNum(juice);

        System.out.printf("%.1f", (minPasta + minJuice) * 1.1);


    }
}
