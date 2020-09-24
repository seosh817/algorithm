package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제1098설탕과자뽑기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] size = br.readLine().split(" ");
            int width = Integer.parseInt(size[0]);
            int height = Integer.parseInt(size[1]);

            int[][] arr = new int[width][height];


            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split(" ");
                int l = Integer.parseInt(temp[0]);
                int d = Integer.parseInt(temp[1]);
                int x = Integer.parseInt(temp[2]);
                int y = Integer.parseInt(temp[3]);

                for (int j = 0; j < l; j++) {
                   if(d==0) {
                       arr[x-1][y-1+j] = 1;
                   } else {
                       arr[x-1+j][y-1] = 1;
                   }
                }
            }

            for(int i=0; i<width; i++) {
                for(int j=0; j<height; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
