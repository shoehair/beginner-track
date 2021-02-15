package tester;
import static org.junit.Assert.*;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import student.StudentArrayDeque;

public class TestArrayDequeEC {
    @Test
    public void test() {

        int n = 10000;
        String message = "";
        StudentArrayDeque<Integer> buggy = new StudentArrayDeque<Integer>();
        ArrayDequeSolution<Integer> solution = new ArrayDequeSolution<Integer>();
        for (int i = 0; i < n; i+= 1) {
            int functionToTest = StdRandom.uniform(0,7);
            int num = StdRandom.uniform(0, 100);
            if (functionToTest == 0) {
                buggy.addFirst(num);
                solution.addFirst(num);
                message += "addFirst(" + num + ") \n";
            }
            if (functionToTest == 1) {
                buggy.addLast(num);
                solution.addLast(num);
                message += "addLast(" + num + ") \n";
            }
            if (functionToTest == 2) {
                if (buggy.size() > 0 && solution.size() > 0) {
                    message += "removeFirst() \n";
                    assertEquals(message, solution.removeFirst(), buggy.removeFirst());
                }

            }
            if (functionToTest == 3) {
                if (buggy.size() > 0 && solution.size() > 0) {
                    message += "removeLast() \n";
                    assertEquals(message, solution.removeLast(), buggy.removeLast());
                }
            }
            if (functionToTest == 4) {
                assertEquals(message, solution.isEmpty(), buggy.isEmpty());

            }
            if (functionToTest == 5) {
                assertEquals(message + "size()", solution.size(), buggy.size());
            }
            if (functionToTest == 6) {
                if (buggy.size() > 0) {
                    int getNumber = StdRandom.uniform(0, buggy.size());
                    assertEquals(message + "get(" + getNumber+")", solution.get(getNumber), buggy.get(getNumber));

                }
            }
        }
    }
}
