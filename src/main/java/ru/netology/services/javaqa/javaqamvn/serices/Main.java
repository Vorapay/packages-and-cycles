package ru.netology.services.javaqa.javaqamvn.serices;

public class Main {
    public static void main(String[] args) {


        MonthVacation service = new MonthVacation();

        System.out.println("Отпуск в году составил = " + service.calcMonthVacation(100_000, 150_000, 60_000) + " месяца/ев");


    }
}
