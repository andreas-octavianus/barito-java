package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PrimeNumberTester {

    @Autowired
    private PrimeNumberService service;

    @Test
    public void primeNumber() {
        assertEquals(4, service.build(10).size());
        assertEquals(25, service.build(100).size());
        assertEquals(168, service.build(1000).size());
        assertEquals(1229, service.build(10000).size());
    }

}
