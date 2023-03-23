package com.diane;

public class Exercise {

    public static void printNumbers() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10; i++) {
            if(i == 9) {
                continue;
            }
            sb.append(i + ", ");
        }
        String numbers = sb.toString();
        System.out.println(numbers.substring(0, numbers.length() - 2));
    }

    public static double triangleArea(double base, double height) {
        return (height * base) / 2;
    }
}
