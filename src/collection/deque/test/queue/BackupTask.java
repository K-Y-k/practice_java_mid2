package collection.deque.test.queue;

/**
 * 백업하는 작업
 */
public class BackupTask implements Task{
    @Override
    public void execute() {
        System.out.println("자료 백업...");
    }
}
