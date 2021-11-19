package app.Matrix;
import java.lang.Math;

public class Matrix {
    int rows;
    int columns;
    int[][] matrix;
    public static int max = 0;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[this.rows][this.columns];
        this.populateMatrix();
    }

    private void populateMatrix() {
        int min = 1;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 1000) + min;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void printMatrix() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
