package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        /**
         * 타입만 다르고 나머지 중복되는 내용으로 코드 재사용성 X, 타입 안전성 O
         */
        // 개 병원, 고양이 병원 생성
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        // 개, 고양이 생성
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 50);

        // 개 병원에 등록
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원에 등록
        catHospital.set(cat);
        catHospital.checkup();


        /**
         * 장점 : 개 병원에 다른 타입인 고양이 등록시 컴파일 오류가 발생하여 타입 안전성이 보장된다.
         */
        //dogHospital.set(cat);

        /**
         * 장점 : 개 타입만 받으므로 캐스팅 예외가 발생할 수 없다.
         */
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog); // 더 큰 멍멍이2가 나온다.
    }
}
