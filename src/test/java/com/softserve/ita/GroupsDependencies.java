package com.softserve.ita;

import org.testng.annotations.Test;

public class GroupsDependencies {

    @Test(dependsOnMethods = "testCase2", groups = {"FirstGroup"})
    public void testCase1(){
        System.out.println("Test Case First-1");
    }

    @Test(groups = {"FirstGroup"})
    public void testCase2(){
        System.out.println("Test Case First-2");
    }

    @Test(groups = {"SecondGroup"})
    public void testCase3(){
        System.out.println("Test Case Second-1");
    }

    @Test(groups = {"SecondGroup"})
    public void testCase4(){
        System.out.println("Test Case Second-2");
    }

    @Test(groups = {"FirstGroup", "SecondGroup"})
    public void testCase5(){
        System.out.println("Test Case First, Second");
    }
}
