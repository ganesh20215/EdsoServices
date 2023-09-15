package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AnnotationExample2 {

    @BeforeTest
    public void beforeTestExample(){
        System.out.println("Before Test Example");
        System.out.println("This is software");
    }

    @AfterTest
    public void afterTestExample(){
        System.out.println("After Test Example");
    }
}
