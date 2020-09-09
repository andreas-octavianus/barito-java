package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class HotDogTester {

    @Autowired
    private HotDogService service;

    private String[] dictionary = {"hot", "dot", "dog", "lot", "log"};

    @Test
    public void hotDog() {
        assertArrayEquals(new String[] {"hot", "dot", "dog"},
                service.transform(dictionary, "hot", "dog").toArray());
        assertArrayEquals(new String[] {"hit", "hot", "dot", "dog"},
                service.transform(dictionary, "hit", "dog").toArray());
        assertArrayEquals(new String[] {"hit", "hot", "dot", "dog", "dig"},
                service.transform(dictionary, "hit", "dig").toArray());
        assertNull(service.transform(dictionary, "dot", "red"));
    }

}
