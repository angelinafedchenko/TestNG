package com.softserve.ita;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArticleTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Before: Article Test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After: Article Test");
        System.out.println("================================");
    }

    @Test
    public void firstTest() {
        System.out.println("Hello!");
    }

    @Test
    public void secondTest() {
        System.out.println("Bye!");
    }
}
