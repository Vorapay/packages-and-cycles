package ru.netology.services.javaqa.javaqamvn.serices;

public class Main {
    public static void main(String[] args) {


        monthVacation servise = new monthVacation();

        System.out.println("Отпуск в году составил = " + servise.calcMonthVacation(0, 100_000, 150_000, 60_000) + " месяца/ев");


    }
}
