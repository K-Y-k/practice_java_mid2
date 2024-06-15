package collection.deque.test.queue;

/**
 * 사용하지 않는 자원을 정리하는 작업
 */
public class CleanTask implements Task{
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
