package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class SolutionTest {

    private static final Map<Character, Integer> alphabets = new HashMap<>();

    static {
        alphabets.put('A', 52);
        alphabets.put('B', 51);
        alphabets.put('C', 50);
        alphabets.put('D', 49);
        alphabets.put('E', 48);
        alphabets.put('F', 47);
        alphabets.put('G', 46);
        alphabets.put('H', 45);
        alphabets.put('I', 44);
        alphabets.put('J', 43);
        alphabets.put('K', 42);
        alphabets.put('L', 41);
        alphabets.put('M', 40);
        alphabets.put('N', 39);
        alphabets.put('O', 38);
        alphabets.put('P', 37);
        alphabets.put('Q', 36);
        alphabets.put('R', 35);
        alphabets.put('S', 34);
        alphabets.put('T', 33);
        alphabets.put('U', 32);
        alphabets.put('V', 31);
        alphabets.put('W', 30);
        alphabets.put('X', 29);
        alphabets.put('Y', 28);
        alphabets.put('Z', 27);
        alphabets.put('a', 26);
        alphabets.put('b', 25);
        alphabets.put('c', 24);
        alphabets.put('d', 23);
        alphabets.put('e', 22);
        alphabets.put('f', 21);
        alphabets.put('g', 20);
        alphabets.put('h', 19);
        alphabets.put('i', 18);
        alphabets.put('j', 17);
        alphabets.put('k', 16);
        alphabets.put('l', 15);
        alphabets.put('m', 14);
        alphabets.put('n', 13);
        alphabets.put('o', 12);
        alphabets.put('p', 11);
        alphabets.put('q', 10);
        alphabets.put('r', 9);
        alphabets.put('s', 8);
        alphabets.put('t', 7);
        alphabets.put('u', 6);
        alphabets.put('v', 5);
        alphabets.put('w', 4);
        alphabets.put('x', 3);
        alphabets.put('y', 2);
        alphabets.put('z', 1);
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.next();
        int k = in.nextInt();

        String smallest = "";
        String largest = "";

        int smallestNum = -1;
        int largestNum = -1;

        for(int index = 0; index < s.length() - k; index++) {

            int localSum = 0;
            StringBuffer buff = new StringBuffer();

            for(int zindex = 0; zindex < k; zindex++) {
                char c = s.charAt(index + zindex);
                buff.append(c);

                localSum += alphabets.get(c);

            }

            if(largestNum < localSum) {
                largestNum = localSum;
                smallest = buff.toString();
            }
            if(localSum < smallestNum) {
                smallestNum = localSum;
                largest = buff.toString();
            }
        }

        out.println(smallest);
        out.println(largest);

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

//            return smallest + '\n' + largest;
    }
}
