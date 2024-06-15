package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private final Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasksSize() {
        return tasks.size();
    }

    public void processNextTask() {
        Task processTask = tasks.poll();

        if (processTask != null) {
            processTask.execute();
        }
    }
}
