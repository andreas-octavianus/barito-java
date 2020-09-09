package com.andxoeag.barito.service;

import com.andxoeag.barito.model.Dimension;
import org.springframework.stereotype.Service;

@Service
public class OrigamiService {

    public Dimension fold(int n) {
        Dimension dimension = new Dimension(20, 20);
        int even = (int) (n / 2);
        int odd = even;
        if (n % 2 > 0)
            odd++;
        dimension.setLength(odd);
        dimension.setWidth(even);
        return dimension;
    }

}
