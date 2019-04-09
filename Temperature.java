package com.company;

public class Temperature {

    public static void main(String[] args) {
        int firstarray[][] = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};

        System.out.println("Temperature Calculator");
        System.out.println();
        System.out.println("The data provided are: ");
        display(firstarray);
        System.out.println();

        System.out.println("Based on that data, the following are the average temperatures for the week.");
        System.out.println();
        int sumdays = 0;
        for(int column = 0; column < firstarray[0].length; column++) { //firstarray[first row?].length
            String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thur: ", "Fri: ", "Sat: "};
            System.out.print(days[column]);
            sumdays = 0;
            for(int row = 0; row < firstarray.length; row++) {
                sumdays += firstarray[row][column];
            }
            int average = sumdays/firstarray.length;
            System.out.println(average);
        }
        System.out.println();

        int sumtimes = 0;
        for(int row = 0; row < firstarray.length; row++) {
            String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            System.out.print(times[row]);
            sumtimes = 0;
            for(int column = 0; column < firstarray[row].length; column++) {
                sumtimes = sumtimes + firstarray[row][column];
            }
            int average = sumtimes/firstarray[row].length;
            System.out.println(average);
        }
        System.out.println();
        System.out.println("The final average temperature for the week was: ");
        System.out.println();

        int sum = 0;
        for(int column = 0; column < firstarray.length; column++) {
            for(int row = 0; row < firstarray[column].length; row++) {
                sum+= firstarray[column][row];
            }
        }
        int average = sum / 28;
        System.out.println("Overall: " + average);

        //averagedays(firstarray);

        //averagetimes(firstarray);


    }

    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            System.out.print(times[row] + " ");

            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "  ");
            }
            System.out.println();
        }
    }

    public static float averagedays(int[][]x) {
        String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thur: ", "Fri: ", "Sat: "};
        int counter = 0;
        float daysum = 0;
        //for (int row = 0; row < 7; row++) {
        {
            for (counter = 0; counter < x.length; counter++)
                daysum += x[counter][0];

            //String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thur: ", "Fri: ", "Sat: "};
            //System.out.println(days[column] + sum);
            System.out.println(daysum);
            return daysum;
        }

    }
    public static float averagetimes(int[][]x) {
        int counter = 0;
        float timesum = 0;
        {
            for (counter = 0; counter<x.length; counter++)
                timesum += x[0][counter];
            System.out.println(timesum);
            return timesum;
        }
    }
}
