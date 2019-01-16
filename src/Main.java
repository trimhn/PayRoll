import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        double empNo;
        double payRate;
        int workHours;
        double weeklyPayOut;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Employee no:");
        empNo = keyboard.nextDouble();

        System.out.println("Input your pay rate:");
        payRate = keyboard.nextDouble();

        System.out.println("Total no of working hours:");
        workHours = keyboard.nextInt();

        if (payRate > 25 || workHours > 60) {
            System.out.println("Employee pay will not be calculated.");
        } else if (payRate <= 25 && workHours <= 60 && workHours > 35) {
            weeklyPayOut = (35 * payRate) + ((workHours - 35) * payRate * 1.5);
            System.out.println("Your pay out for this week: " + weeklyPayOut);
        } else if (payRate <= 25 && workHours <= 60) {
            weeklyPayOut = workHours * payRate;
            System.out.println("Your pay out for this week: " + weeklyPayOut);


        }

    }}