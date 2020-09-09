package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

@Service
public class PerfectTwoService {

    public int[] perfectTwo(int[] list, int sum) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] + list[j] == sum) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

}
