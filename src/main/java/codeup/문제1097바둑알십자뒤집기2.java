package codeup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 문제1097바둑알십자뒤집기2 {

    // int 버전
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        int n = sc.nextInt();

        sc.nextLine(); // nextInt()는 마지막 개행문자를 제거하지 않으므로 제거해줘야함
                        // nextInt()후 nextLine() 사용할때는 무조건 제거해주어야함
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            list.add(line);
        }

        for (int i = 0; i < list.size(); i++) {

            String[] point = list.get(i).split(" ");
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);
            //list에 [1 1, 19 19] 저장

            for (int j = 0; j < arr.length; j++) { //가로줄 바꾸기
                if (arr[j][y - 1] == 0) {
                    arr[j][y - 1] = 1;
                } else {
                    arr[j][y - 1] = 0;
                }
            }


            for (int k = 0; k < arr.length; k++) { //세로줄 바꾸기
                if (arr[x - 1][k] == 0) {
                    arr[x - 1][k] = 1;
                } else {
                    arr[x - 1][k] = 0;
                }
            }


        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
