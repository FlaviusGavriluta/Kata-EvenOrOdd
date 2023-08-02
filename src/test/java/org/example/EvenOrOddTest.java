package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", EvenOrOdd.evenOrOdd(6));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(7));
        assertEquals("Even", EvenOrOdd.evenOrOdd(0));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-1));
    }
}