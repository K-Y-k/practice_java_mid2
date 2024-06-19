package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        /**
         * 불변 컬렉션 또는 가변 컬렉션으로 전환하는법
         */
        List<Integer> list = List.of(1, 2, 3);


        /**
         * - 불변 컬렉션 -> 가변 컬렉션 전환
         * 가변 컬렉션을 생성할 때 안에 불변 컬렉션을 넣으면 된다.
         */
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());
        System.out.println();


        /**
         * - 가변 컬렉션 -> 불변 컬렉션 전환
         * Collections.unmodifiableCollection() 안에 가변 컬렉션을 넣으면 된다.
         */
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection(mutableList);
        System.out.println("unmodifiableList = " + unmodifiableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
    }
}
