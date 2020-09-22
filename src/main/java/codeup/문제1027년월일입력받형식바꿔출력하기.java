package codeup;


import java.util.Scanner;

//https://codeup.kr/problem.php?id=1027
public class 문제1027년월일입력받형식바꿔출력하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String[] arr = string.split("\\."); //  .은 정규표현식 전부를 의미하므로

        System.out.println(arr[2] + "-" + arr[1] + "-" + arr[0]);
    }
}
