/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rk.samples;

/**
 *
 * @author rajes
 */
public class SwitchDemo {

    public static void main(String[] args) {
        System.out.println(newSwitch(1));
        System.out.println(newSwitch(2));
        System.out.println(newSwitch("Hello"));
        System.out.println("-----------");
        System.out.println(oldSwitch(1));
        System.out.println(oldSwitch(2));
        System.out.println("-----------");
        System.out.println(demoInstanceOf(1));
        System.out.println(demoInstanceOf(2));
        System.out.println(demoInstanceOf("Hello"));
    }

    public static String newSwitch(Object message) {

        return (switch (message) {
            case Integer i ->
                "Got " + i;
            case String str ->
                "Got string of length : " + str.length();
            default ->
                "default statement";
        });
    }

    public static String demoInstanceOf(Object message) {

        if (message instanceof Integer i) {
            return "Got Integer : " + message;
        }

        if (message instanceof String str) {
            return "Got String with length : " + str.length();
        }
        return "default value from instanceOf";
    }

    public static String oldSwitch(int seqNo) {
        String day;
        switch (seqNo) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        return day;
    }

}
