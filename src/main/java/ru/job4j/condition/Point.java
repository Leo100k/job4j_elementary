package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        int x = x2 - x1;
        int y = y2 - y1;
        double rs = Math.pow(x, 2) + Math.pow(y, 2);
        double rsl = Math.sqrt(rs);
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 2;
        int y1 = 5;
        int y2 = 2;

        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (x1, y1) to (x2, y2) " + result);
    }
}
