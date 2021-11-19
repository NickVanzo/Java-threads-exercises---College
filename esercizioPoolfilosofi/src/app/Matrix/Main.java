package app.Matrix;
import java.util.concurrent.*;

public class Main {
        public static void main(String[] args) {
            Matrix matrix = new Matrix(100, 100);
            ThreadMantainer tm = new ThreadMantainer(matrix.getMatrix(), matrix.getRows());
        }
}
