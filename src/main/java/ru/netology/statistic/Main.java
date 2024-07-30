package ru.netology.statistic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {};
        long currentMax = service.findMax(incomesInBillions);
        System.out.println(currentMax);
        }
    }