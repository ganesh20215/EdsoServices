package demo.priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test()
    public void testCaseA() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"testCaseA"}, alwaysRun = true)
    public void testCasem() {
        System.out.println("test case m");
    }

    @Test(description = "verify the test cases")
    public void testCaseX() {
        System.out.println("test case X");
    }

    @Test(enabled = false)
    public void testCaseg() {
        System.out.println("test case g");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void testCased() {

        System.out.println(10 / 0);


        System.out.println("Hiii");
    }
}
