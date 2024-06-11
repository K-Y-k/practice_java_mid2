package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        /**
         * 고유한 문자를 숫자로 변환
         * 모든 문자는 고유한 숫자로 표현할 수 있다.
         * 컴퓨터는 문자를 직접 이해하지는 못하여 고유한 숫자(ASCII 코드)를 할당해서 인식한다.
         *
         * -> 해시 함수를 통해
         *    숫자로 변환한 해시 코드를 활용하여
         *    해시 인덱스를 구해주면 된다.
         */
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("char 'A' = " + (int)charA); // 65
        System.out.println("char 'B' = " + (int)charB); // 66
        System.out.println();
        
        // 해시 코드로 변환
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));
        System.out.println();

        // 해시 인덱스 구하기
        int hashCodeA = hashCode("A");        // 입력한 문자를 숫자형인 해시 코드로 받고
        int hashIndex = hashIndex(hashCodeA); // 해시 코드를 해시 인덱스로 받아온다.
        System.out.println("hashIndex(hashCode('A')) = " + hashIndex);

        System.out.println("hashIndex('A') = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex('B') = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex('AB') = " + hashIndex(hashCode("AB")));
    }


    // 문자열을 숫자로 변환 메서드
    static int hashCode(String str) {
        // 받아온 문자열을 char 배열로 받고
        char[] charArray = str.toCharArray();
        
        // 받아온 각 문자를 합산한 값을 반환
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
