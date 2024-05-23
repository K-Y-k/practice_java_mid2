package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        /**
         * 제네릭 활용으로 코드 재사용성과 타입 안전성 2가지를 모두 잡기
         */
        // 개 병원, 고양이 병원 생성
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        /**
         * 문제 : 전혀 관련 없는 타입까지 넣을 수 있음
         *        Animal과 자식들만 들어오도록 제한할 수 있는 것이 필요함
         */
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();


        // 개, 고양이 생성
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 50);

        // 개를 병원에 등록
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이를 병원에 등록
        catHospital.set(cat);
        catHospital.checkup();


        /**
         * 장점 : 개 병원에 다른 타입인 고양이 등록시 컴파일 오류가 발생하여 타입 안전성이 보장된다.
         */
        //dogHospital.set(cat);

        /**
         * 장점 : 해당 타입만 받으므로 캐스팅 예외가 발생할 수 없다.
         */
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 더 큰 멍멍이2가 나온다.
    }
}
