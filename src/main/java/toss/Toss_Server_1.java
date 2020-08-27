package toss;

import java.io.*;
import java.util.Arrays;

class Toss_Server_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String splitArray[] = input.split("");

        boolean isOne = false;
        boolean isCheckAll = true;
        for (String s : splitArray) {
            if(!(s.contains("1") || s.contains("2"))) {
                isCheckAll = false;
                break;
            }
            if(isOne && !s.equals("2")) {
                isCheckAll = false;
                break;
            }
            if (s.equals("1")) {
                isOne = true;
            } else if(s.equals("2")){
                isOne = false;
            }

        }

        System.out.println(isCheckAll);
    }
}