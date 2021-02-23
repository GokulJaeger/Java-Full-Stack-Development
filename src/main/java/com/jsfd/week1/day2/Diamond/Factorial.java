package com.jsfd.week1.day2.Diamond;

public interface Factorial extends Swapping{
    default long factorial(int x) {
        if (x == 0)
            return 1;

        return x * factorial(x - 1);
    }
}
