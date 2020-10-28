package codeup.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제4040펜션 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] dayRoom = br.readLine().split(" ");
            int day = Integer.parseInt(dayRoom[0]);
            int roomNum = Integer.parseInt(dayRoom[1]);
            int changeCount = 0;

            for (int i = 0; i < day; i++) {
                String rooms = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
