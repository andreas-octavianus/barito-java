package com.andxoeag.barito.service;

import com.andxoeag.barito.model.Dimension;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OrigamiTester {

    @Autowired
    private OrigamiService service;

    @Test
    public void dimension() {
        assertEquals(new Dimension(10, 20).toString(), service.fold(1).toString());
        assertEquals(new Dimension(10, 10).toString(), service.fold(2).toString());
        assertEquals(new Dimension(5, 10).toString(), service.fold(3).toString());
    }

}
