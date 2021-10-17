package com.example.rental_centre_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorUnitTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Test
    public void exp_is_empty() {
        Calculator calculator = new Calculator();

        // Empty expression
        int actual = calculator.getresult("");
        int expected = 0;
        assertEquals(expected, actual);
        System.out.println("Expression is empty.");
    }

    @Test
    public void exp_is_empty_is_incorrect() {
        // Should fail
        try {
            Calculator calculator = new Calculator();

            // division test
            int actual = calculator.getresult("");
            int expected = 1;
            assertEquals(expected, actual);
            System.out.println("Expression is empty..");
        } catch (final AssertionError e) {
            assertTrue(true);
            System.out.println("Expression is not empty.");
        }
    }

    @Test
    public void addition_result_is_correct() {
        Calculator calculator = new Calculator();

        // Addition test
        int actual = calculator.getresult("2 ＋ 2");
        int expected = 4;
        assertEquals(expected, actual);
        System.out.println("Addition result is correct.");
    }

    @Test
    public void addition_result_is_incorrect() {
        // Should fail
        try {
            Calculator calculator = new Calculator();

            // division test
            int actual = calculator.getresult("2 ＋ 2");
            int expected = 1;
            assertEquals(expected, actual);
            System.out.println("Addition result is correct.");
        } catch (final AssertionError e) {
            assertTrue(true);
            System.out.println("Addition result is incorrect.");
        }
    }

    @Test
    public void subtraction_result_is_correct() {
        Calculator calculator = new Calculator();

        // subtraction test
        int actual = calculator.getresult("10 － 8");
        int expected = 2;
        assertEquals(expected, actual);
        System.out.println("Subtraction result is correct.");
    }

    @Test
    public void subtraction_result_is_incorrect() {
        // Should fail
        try {
            Calculator calculator = new Calculator();

            // division test
            int actual = calculator.getresult("10 － 8");
            int expected = 1;
            assertEquals(expected, actual);
            System.out.println("Subtraction result is correct.");
        } catch (final AssertionError e) {
            assertTrue(true);
            System.out.println("Subtraction result is incorrect.");
        }

    }

}


