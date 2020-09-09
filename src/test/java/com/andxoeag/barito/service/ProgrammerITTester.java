package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProgrammerITTester {

    @Autowired
    private ProgrammerITService service;

    private String[] dictionary = {"pro", "gram", "merit", "program", "it", "programmer"};

    @Test
    public void programmerIT() {
        String[][] result1 = new String[][]{
                new String[]{"pro", "gram"},
                new String[]{"program"}};
        assertArrayEquals(result1, service.programmerIT(dictionary, "program"));

        String[][] result2 = new String[][]{
                new String[]{"pro", "gram", "it"},
                new String[]{"program", "it"}};
        assertArrayEquals(result2, service.programmerIT(dictionary, "programit"));

        String[][] result3 = new String[][]{
                new String[]{"pro", "gram", "merit"},
                new String[]{"program", "merit"},
                new String[]{"programmer", "it"}};
        assertArrayEquals(result3, service.programmerIT(dictionary, "programmerit"));

        assertNull(service.programmerIT(dictionary, "programlala"));
        assertNull(service.programmerIT(dictionary, "proletarian"));
    }

}
