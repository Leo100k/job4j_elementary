package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int chan = money - price;
        int j = 0;
        for (int i = 0; i < coins.length; i++) {
            while (chan >= coins[i]) {
                chan -= coins[i];
                rsl[j] = coins[i];
                j++;
                size = j;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

