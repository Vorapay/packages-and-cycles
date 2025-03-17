package ru.netology.services.javaqa.javaqamvn.serices;

public class MonthVacation {
    public int calcMonthVacation(int income, int threshold, int expense) {

        int summaryMonthVacation = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {


            if (money < threshold) {
                System.out.println("Месяц " + month + ", " + "Денег " + money + " Придется работать. " + "Заработал +" + income + ", " + "потратил -" + expense + ".");
                money = money + income - expense;
            } else {
                System.out.println("Месяц " + month + ", " + "Денег " + money + " Буду отдыхать. " + "Потратил -" + expense + ", " + "затем еще -" + ((money - expense) / 3) * 2 + ".");
                money = (money - expense) / 3;
                summaryMonthVacation++;
            }
        }
        return summaryMonthVacation;
    }
}
