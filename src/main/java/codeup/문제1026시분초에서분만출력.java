package codeup;

import java.util.Scanner;

//https://codeup.kr/problem.php?id=1026
public class 문제1026시분초에서분만출력 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        String[] arr = string.split("\\:");

        System.out.println(Integer.parseInt(arr[1]));


        // System.out.println(arr[1]); 이건 오답임 이유!!
        // arr이 스트링 배열로 %s로 출력하게 되면 6:00:00분을 입력받았을 때
        //분을 출력하면 00이 나오지만 정수형으로 바꾸게 되면 정수는 00이 없기 때문에 0이 출력됨.


    }
}
