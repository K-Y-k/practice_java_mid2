package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        /**
         * 다형성을 활용하여 모든 동물을 하나의 클래스로 담아 코드 재사용성 O, 타입 안전성 X
         */
        // 개 병원, 고양이 병원 생성
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

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
         * 문제1 : 개 병원에 다른 타입인 고양이 등록시 컴파일 오류가 나지 않아
         *        타입 안전성이 보장되지 않는다.
         */
        dogHospital.set(cat);

        /**
         * 문제2 : Animal로 받으므로 자식 객체로 받으려면 다운 캐스팅을 해야함
         *        다른 타입인 고양이로 넣으면 여기서 캐스팅 예외 발생하여 타입 안전성이 보장되지 않는다.
         */
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 더 큰 멍멍이2가 나온다.
    }
}
