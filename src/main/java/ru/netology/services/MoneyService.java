package ru.netology.services;

public class MoneyService {

    public int calculate(int threshold, int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // уменьшаем накопления на обязательные траты и траты на отдых
            } else {
                money = (money + income) - expenses; // уменьшаем накопления на обязательные траты
            }
        }
        return count;
    }
}
