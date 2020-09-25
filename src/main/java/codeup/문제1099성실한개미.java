package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제1099성실한개미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[][] arr = new int[10][10];

            for (int i = 0; i < 10; i++) {
                String[] temp = br.readLine().split(" ");

                for (int j = 0; j < 10; j++) {
                    arr[i][j] = Integer.parseInt(temp[j]);
                }
            }

            int end = 0;
            int store = 1;

            for (int i = 1; i < arr.length; i++) {
                if (end != 1) {
                    for (int j = store; j < arr[i].length; j++) {
                        if (arr[i][j] == 0) {
                            arr[i][j] = 9;
                        } else if (arr[i][j] == 2) {
                            arr[i][j] = 9;
                            end = 1;
                            break;
                        } else {
                            store = j-1;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }


            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
