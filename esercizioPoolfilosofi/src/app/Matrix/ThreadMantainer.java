package app.Matrix;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ThreadMantainer {
    int[][] matrix;
    int rows;
    int max;
    ArrayList<FutureTask> tasks;

    public ThreadMantainer(int[][] matrix, int rows) {
        this.matrix = matrix;
        this.rows = rows;
        this.tasks = new ArrayList<>();
        this.createThreadExecutor();
    }

    private void createThreadExecutor() {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0; i < this.rows; i++) {
            try {
                FutureTask task = new FutureTask(new Task(this.matrix, i));
                tasks.add(task);
                exec.execute(task);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(FutureTask t: this.tasks) {
            try {
                if((int) t.get() > this.max) {
                    this.max = (int) t.get();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        exec.shutdown();

        try {
            exec.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Max in matrix: " + max);
    }
}
