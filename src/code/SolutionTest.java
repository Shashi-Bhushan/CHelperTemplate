package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class SolutionTest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int index = 1;

        while(!in.isExhausted()) {
            out.println(index + " " + in.readLine());
            index++;
        }
    }
}
