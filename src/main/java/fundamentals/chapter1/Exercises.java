package fundamentals.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Exercises {
    private boolean inRange(double val, int start, int end) {
        return val >= start && val <= end;
    }

    private void exercise113(int... args) {
        System.out.println(args[0] == args[1] && args[1] == args[2]);
    }

    private void exercise115(double x, double y) {
        System.out.println(inRange(x, 0, 1) && inRange(y, 0, 1));
    }

    private void exercise1113(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("The transposed matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    private void exercise1114(int n) {
        int log2base = 0;
        while (n > 1) {
            n = n / 2;
            log2base++;
        }
        System.out.println(log2base);
    }

    public static void main(String[] args) {
        Exercises exercises = new Exercises();

    }
}
