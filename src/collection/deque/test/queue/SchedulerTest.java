package collection.deque.test.queue;

/**
 * 서비스를 운영중인데,
 * 낮 시간에는 사용자가 많아서 서버에서 무거운 작업을 하기 부담스럽다.
 * 무거운 작업을 예약해두고 사용자가 없는 새벽에 실행하도록 개발해보자.
 *
 * 1.다양한 무거운 작업을 새벽에 실행한다고 가정하자.
 * 2.작업은 자유롭게 구현하고 자유롭게 예약할 수 있어야 한다.
 * 3.다음 예제 코드와 실행 결가를 참고해서 TaskScheduler 클래스를 완성하자.
 */

public class SchedulerTest {
    public static void main(String[] args) {
        // 낮에 새벽에 실행할 작업들을 저장
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        // 새벽 시간에 실행
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTasksSize() > 0) {
            scheduler.processNextTask();
        }
    }
}
