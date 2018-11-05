package Aufgabe2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Aufgabe2JUnit {
    public static TestRig2 testRig2;

    @Test
    public void test() {
        String input = testRig2.test("10 * 2 / 2 + 4");
        assertTrue("(prog (stat (expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4)))))".equals(input));
    }
}
