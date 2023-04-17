package com.string_calculator;

import java.util.Scanner;

import static com.string_calculator.Counter.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(count(s));
    }

    private static String count(String str) {
        String result = "";

        if (str.contains(" + ")) {
            String[] stringArr = str.split(" \\+ ");
            String s1 = stringArr[0];
            String s2 = stringArr[1];
            result = addition(s1, s2);
        } else if (str.contains(" - ")) {
            String[] stringArr = str.split(" - ");
            String s1 = stringArr[0];
            String s2 = stringArr[1];
            result = subtraction(s1, s2);
        } else if (str.contains(" * ")) {
            String[] stringArr = str.split(" \\* ");
            String s1 = stringArr[0];
            String s2 = stringArr[1];
            result = multiplication(s1, s2);
        } else if (str.contains(" / ")) {
            String[] stringArr = str.split(" / ");
            String s1 = stringArr[0];
            String s2 = stringArr[1];
            result = division(s1, s2);
        } else {
            throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
        }
        result = modifyLongString(result);
        result = addQuotes(result);
        return result;

    }

    private static String addQuotes(String result) {
        result = "\"" + result + "\"";
        return result;
    }

    private static String modifyLongString(String result) {
        if (result.length() > 40) {
            result = result.substring(0, 39) + "...";
        }
        return result;
    }


}