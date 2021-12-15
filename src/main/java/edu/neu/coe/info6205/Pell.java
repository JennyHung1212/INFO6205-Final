package edu.neu.coe.info6205;

import java.util.ArrayList;
import java.util.List;

public class Pell {
    private List<Long> list;
    public Pell() {
        list = new ArrayList<>();
        list.add(0L);
        list.add(1L);
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if (n == 0) return 0L;
        if (n == 1) return 1L;
        for(int i = list.size(); i <= n; i++) {
            list.add(2 * list.get(i-1) + list.get(i-2));
        }
        return list.get(n);
    }
}

//P0 = 0
//P1 = 1
//Pn = 2 Pn-1 + Pn-2
