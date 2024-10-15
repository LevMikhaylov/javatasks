package ru.ithub.javatrainj;

public class lol {
    public static String getSeasonName(Season season) {
        switch (season) {
            case WINTER:
                return "Зима";
            case SPRING:
                return "Весна";
            case SUMMER:
                return "Лето";
            case AUTUMN:
                return "Осень";
            default:
                throw new IllegalArgumentException("Неизвестный сезон: " + season);
        }
    }
    public static void main(String[] args) {
        Season season = Season.WINTER;
        String seasonName = getSeasonName(season);
        System.out.println("Название сезона: " + seasonName);
    }
    }
