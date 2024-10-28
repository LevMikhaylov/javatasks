package org.example;
public class Main {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 1900;
        int year3 = 2000;
        int year4 = 2024;

        System.out.println(year1 + " является високосным? " + isLeapYear(year1));
        System.out.println(year2 + " является високосным? " + isLeapYear(year2));
        System.out.println(year3 + " является високосным? " + isLeapYear(year3));
        System.out.println(year4 + " является високосным? " + isLeapYear(year4));
    }
}
