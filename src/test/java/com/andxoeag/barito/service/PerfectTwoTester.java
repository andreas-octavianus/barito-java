package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PerfectTwoTester {

    @Autowired
    private PerfectTwoService service;

    private int[] list = new int[] {2, 7, 11, 15};

    @Test
    public void hasPerfectTwo() {
        assertArrayEquals(new int[] {0, 1}, service.perfectTwo(list, 9));
        assertArrayEquals(new int[] {1, 3}, service.perfectTwo(list, 22));
        assertArrayEquals(new int[] {0, 2}, service.perfectTwo(list, 13));
        assertNull(service.perfectTwo(list, 11));
        assertNull(service.perfectTwo(list, 19));
    }

}
