package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

@Service
public class BiggestPalindromeService {

    public int biggestPalindrome(int digit) {
        int i = biggestNumber(digit);
        int largest = 1;
        while (i >= limit(digit)) {
            int j = i;
            while (j >= limit(digit)) {
                int mult = i * j;
                if (isPalindrome(mult) && largest < mult) {
                    largest = mult;
                }
                j--;
            }
            i--;
        }
        return largest;
    }

    private boolean isPalindrome(long val) {
        boolean isPalindrome = true;
        String str = Long.toString(val);
        int len = str.length();
        int i = 0;
        while (isPalindrome && i <= (len-1)/2){
            isPalindrome = str.charAt(i) == str.charAt(len-1-i);
            i++;
        }
        return isPalindrome;
    }

    private int biggestNumber(int digit) {
        int number = 9;
        for (int i = 1; i < digit; i++) {
            number = number * 10 + 9;
        }
        return number;
    }

    private int limit (int digit) {
        if (digit > 2) {
            return 9 * (int) Math.pow(10, 2) + 1;
        } else {
            return 1;
        }
    }

}
