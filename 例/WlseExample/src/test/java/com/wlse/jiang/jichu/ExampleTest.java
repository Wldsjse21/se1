package com.wlse.jiang.jichu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wlse.jiang.jichu.Example;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    private final Example calculator = new Example();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

}