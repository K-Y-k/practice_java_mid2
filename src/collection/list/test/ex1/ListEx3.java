package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        /**
         * 사용자에게 n개의 정수를 입력받아서 List에 보관하고
         * 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하라.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            }

            numList.add(inputNum);
        }

        int sum = 0;
        for (Integer number : numList) {
            sum += number;
        }

        double avg = (double) sum / numList.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
