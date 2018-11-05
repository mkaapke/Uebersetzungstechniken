package Aufgabe3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Aufgabe3JUnit {
    public static TestRig3 testRig3;

    @Test
    public void test() {
        String input = testRig3.test("10 * 2 / 2 + 4");
        assertTrue("(expr (expr (expr (expr 10) * (expr 2)) / (expr 2)) + (expr 4))".equals(input));
    }
}
