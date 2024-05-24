package generic;

/**
 * 타입 이레이저
 * - 제네릭 타입은 컴파일 시점에만 존재하고
 *   런타임 시에는 제네릭 정보가 지워지는 것을 타입 이레이저라고 한다.
 *
 * - 즉, 런타임 시에는 결정했던 타입이 지워지므로
 *   런타임 일때의 코드 작성은 불가능하다.
 */
public class EraserBox<T> {
    /**
     * 불가능한 예시
     */
    // 1.소속 인스턴스 확인하는 경우
    public boolean instanceCheck(Object param) {
        //return param instanceof T; 컴파일 오류
        return false;
    }

    // 2.타입 생성
    public void create() {
        //return new T(); 컴파일 오류
    }
}
