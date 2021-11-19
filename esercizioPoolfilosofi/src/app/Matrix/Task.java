package app.Matrix;

import java.util.concurrent.Callable;

public class Task implements Callable {
    private int[][] matrix;
    private int row;
    private int maxInARow;

    public Task(int[][] matrix, int row) {
        this.matrix = matrix;
        this.row = row;
        this.maxInARow = matrix[0][0];
    }

    @Override
    public Object call() throws Exception {
        System.out.println("Thread started on row: " + this.row);
        for(int j = 0; j < matrix[row].length; j++) {
            int element = matrix[row][j];

            if(element > this.maxInARow) {
                this.maxInARow = element;
            }
        }

        Thread.sleep(100);

        if(this.maxInARow > Matrix.max) {
            Matrix.max = this.maxInARow;
        }
        System.out.println("FINE");
        return this.maxInARow;
    }
}
