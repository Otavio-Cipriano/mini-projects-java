package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.print("Which unit of temperature you want to Convert?\n" +
                ">1 - Celsius\n" +
                ">2 - Fahrenheit\n" +
                ">3 - Kelvin\n" + ">");
        Scanner input = new Scanner(System.in);
        int unitTobConverted = Integer.parseInt(input.nextLine());
        if(unitTobConverted < 1 || unitTobConverted > 3) {
            System.out.println("Error: invalid entry");
            System.exit(0);
        };
        System.out.print("To which temperature unit?\n" +
                ">1 - Celsius\n" +
                ">2 - Fahrenheit\n" +
                ">3 - Kelvin\n" + ">");
        int unitToConvert = Integer.parseInt(input.nextLine());
        if(unitToConvert < 1 || unitToConvert > 3) {
            System.out.println("Error: invalid entry");
            System.exit(0);
        };
        double temperature = Double.parseDouble(input.nextLine());
        switch (unitTobConverted) {
            case 1:
                System.out.println(celsius(unitToConvert, temperature));
                break;
            case 2:
                System.out.println(fahrenheit(unitToConvert, temperature));
                break;
            case 3:
                System.out.println(kelvin(unitToConvert, temperature));
                break;
            default:
                break;
        };


    }

    //Convert temperatures in Celsius to another
    static double celsius(int unit, double value){
        return switch (unit) {
            case 1 -> value;
            case 2 -> (((double) 9 / 5) * value + 32);
            case 3 -> value + 273.15;
            default -> 0;
        };
    }

    //Convert temperatures in Fahrenheit to another
    static double fahrenheit(int unit, double value){
        return switch (unit) {
            case 1 -> (value - 32) * (double) (5 / 9);
            case 2 -> value;
            case 3 -> (value - 32) * (double) (5 / 9) + 273.15;
            default -> 0;
        };
    }

    //Convert temperatures in Kelvin to another
    static double kelvin(int unit, double value){
        return switch (unit) {
            case 1 -> value - 273.15;
            case 2 -> (value - 273.15) * (double) (5 / 9) + 32;
            case 3 -> value;
            default -> 0;
        };
    }
}
