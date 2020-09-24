package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class 문제1097바둑알십자뒤집기 {

    //String으로 풀었으니까 equals로 !! 조심
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[19][19];

        try {
            for (int i = 0; i < arr.length; i++) {
                String[] temp = br.readLine().split(" ");
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = temp[j];
                }
            }

            int n = Integer.parseInt(br.readLine());

            ArrayList<String> list = new ArrayList();

            for (int i = 0; i < n; i++) {
                list.add(br.readLine());
            }

            for (int i = 0; i < list.size(); i++) {

                String[] point = list.get(i).split(" ");
                int x = Integer.parseInt(point[0]);
                int y = Integer.parseInt(point[1]);
                //list에 [1 1, 19 19] 저장

                for (int j = 0; j < arr.length; j++) { //가로줄 바꾸기
                    if (arr[j][y - 1].equals("0")) {
                        arr[j][y - 1] = "1";
                    } else {
                        arr[j][y - 1] = "0";
                    }
                }


                for (int k = 0; k < arr.length; k++) { //세로줄 바꾸기
                    if (arr[x - 1][k].equals("0")) {
                        arr[x - 1][k] = "1";
                    } else {
                        arr[x - 1][k] = "0";
                    }
                }


/*                for (int l = 0; l < arr.length; l++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[l][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();*/
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }
}