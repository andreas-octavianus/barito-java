package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JualBeliSahamTester {

    @Autowired
    private JualBeliSahamService service;

    @Test
    public void profitTertinggi() {
        assertEquals(19, service.profitTertinggi(new int[] {5, 6, 15, 3, 10, 22, 15}));
        assertEquals(7, service.profitTertinggi(new int[] {10, 15, 8, 7, 14}));
        assertEquals(-1, service.profitTertinggi(new int[] {100, 90, 80, 75, 65}));
    }

}
