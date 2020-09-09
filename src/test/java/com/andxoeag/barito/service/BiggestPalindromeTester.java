package com.andxoeag.barito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BiggestPalindromeTester {

    @Autowired
    private BiggestPalindromeService service;

    @Test
    public void biggestPalindrome() {
        assertEquals(9, service.biggestPalindrome(1));
        assertEquals(9009, service.biggestPalindrome(2));
        assertEquals(906609, service.biggestPalindrome(3));
    }

}
