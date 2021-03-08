package com.knoldus;

import java.util.Scanner;

public class getProductionvalue {
    public long Range(long LeftBorder, long RightBorder) {

        Production Numbers = ((Lb, Rb) -> {
            long result = Lb;
            for (long i = Lb+ 1; i <= Rb; i++) {
                result *= i;
            }
            return result;
        });
        return Numbers.Range(LeftBorder, RightBorder);
    }
}
