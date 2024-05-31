package collection.list.test.ex1;

public class ArrayEx1 {
    public static void main(String[] args) {
        /**
         * 배열을 사용한 코드 예제
         */
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double avg = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
