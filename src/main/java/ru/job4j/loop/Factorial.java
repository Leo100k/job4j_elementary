package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        //  if (n != 0) {
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(i);
            System.out.println(result);
        }
        //  }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(0));
    }

}
