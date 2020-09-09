package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class KaprekarsTester {

    @Autowired
    private KaprekarsService service;

    @Test
    public void kaprekarsKonstanta() {
        assertEquals(3, service.kaprekarsKonstanta(3124));
        assertEquals(1, service.kaprekarsKonstanta(1764));
    }

}
