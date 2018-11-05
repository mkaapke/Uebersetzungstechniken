package Aufgabe1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Aufgabe1JUnit {
    public static TestRig1 testRig1;

    @Test
    public void test() {
        String input = testRig1.test("10 * 2 / 2 + 4");
        assertTrue("(expr (expr (term (term (term (fact 10)) * (fact 2)) / (fact 2))) + (term (fact 4)))".equals(input));
    }
}
