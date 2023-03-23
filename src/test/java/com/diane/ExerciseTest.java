package com.diane;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void printNumbers() throws Exception {
        String actual = tapSystemOut (Exercise::printNumbers);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 10", actual.trim());
    }

    @Test
    void triangleArea() {
        double actual = Exercise.triangleArea(5, 8);
        assertEquals(20, actual);
    }
}