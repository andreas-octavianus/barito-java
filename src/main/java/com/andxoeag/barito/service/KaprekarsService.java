package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class KaprekarsService {

    public int kaprekarsKonstanta(int input) {
        if (input == 6174)
            return 0;

        Integer[] digits = toDigits(input);
        Arrays.sort(digits);
        int minimum = toInt(digits);
        Arrays.sort(digits, Collections.reverseOrder());
        int maximum = toInt(digits);
        int result = maximum - minimum;
        return 1 + kaprekarsKonstanta(result);
    }

    public Integer[] toDigits(int input) {
        Integer[] digits = new Integer[4];
        int i = 0;
        while (i < 4) {
            digits[i] = input % 10;
            input /= 10;
            i++;
        }
        return digits;
    }

    public int toInt(Integer[] digits) {
        int number = 0;
        for (int digit : digits) {
            number *= 10;
            number += digit;
        }
        return number;
    }

}
