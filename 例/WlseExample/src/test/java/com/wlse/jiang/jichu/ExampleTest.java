package com.wlse.jiang.jichu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    private final Example cal = new Example();

    @Test
    void jia() {
        assertEquals(2, cal.jia(1, 1));
    }

    @Test
    void jian() {
        assertEquals(2, cal.jian(3, 1));
    }

    @Test
    void cheng() {
        assertEquals(2, cal.cheng(2, 1));
    }

    @Test
    void chu() {
        assertEquals(2, cal.chu(4, 2));
    }

}