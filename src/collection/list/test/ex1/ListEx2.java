package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        /**
         * 사용자에게 n개의 정수를 입력받아서 List에 저장하고 입력 순서대로 출력하라.
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            }

            numList.add(inputNum);
        }

        System.out.println("출력");
        // 내가 푼 방식
        // for (int i = 0; i < numList.size(); i++) {
        //     if (i == 0) {
        //         System.out.print(numList.get(i));
        //     }
        //     else {
        //         System.out.print(", " + numList.get(i));
        //     }
        // }

        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));

            if (i < numList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
