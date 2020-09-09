package com.andxoeag.barito.service;

import org.springframework.stereotype.Service;

@Service
public class JualBeliSahamService {

    public int profitTertinggi(int[] list) {
        int profit = -1;
        for (int i = 0; i < list.length; i++) {
            int hargaBeli = list[i];
            for (int j = i + 1; j < list.length; j++) {
                int hargaJual = list[j];
                int temp = hargaJual - hargaBeli;
                if (profit < temp) {
                    profit = temp;
                }
            }
        }
        return profit;
    }

}
