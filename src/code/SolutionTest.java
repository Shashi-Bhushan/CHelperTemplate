package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class SolutionTest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            print(a, b, n, out);
        }
    }

    private static void print(int a, int b, int n, OutputWriter out) {
        for (int index = 0; index < n; index++) {
            out.print(printInternal(a, b, index) + " ");
        }

        out.println();
    }

    private static int printInternal(int a, int b, int index) {
        int sum = a;

        while (index >= 0) {
            sum += (Math.pow(2, index) * b);

            index--;
        }

        return sum;
    }
}
