package nijat.fundamentals.chapter1;

import java.util.HashMap;

public class Exercises {
    private boolean inRange(double val, int start, int end) {
        return val >= start && val <= end;
    }

    private int lnBase2(int n) {
        if (n == 1) return 0;
        return 1 + lnBase2(n / 2);
    }

    private int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
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

    private void exercise1115(int[] a, int m) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int i : a) {
            if (occurrences.containsKey(i)) {
                occurrences.put(i, occurrences.get(i) + 1);
            } else {
                occurrences.put(i, 1);
            }
        }

        for (int i : occurrences.keySet()) {
            if (occurrences.containsKey(m - i)) {
                System.out.println("The pair is: " + i + " " + (m - i));
                return;
            }
        }
    }

    private void exercise1120(int n) {
        var factorial = factorial(n);
        System.out.println(lnBase2(factorial));
    }

    private void exercise1124(int a, int b) {
        if (a == b) {
            System.out.println("The greatest common divisor is: " + a);
        } else {
            var min = Math.min(a, b);
            var max = Math.max(a, b);
            exercise1124(max - min, min);
        }
    }

    public static void main(String[] args) {
        Exercises exercises = new Exercises();

    }
}
