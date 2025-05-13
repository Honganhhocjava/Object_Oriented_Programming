package hus.oop.lab1;
import java.util.Scanner;
public class PensionContributionCalculator {
    public static double getEmployeeContributionRate(int age) {
        final int SALARY_CELLING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        if (age <= 55) {
            return EMPLOYEE_RATE_55_AND_BELOW;
        }
        if ((55 < age) && (age <= 60)){
            return EMPLOYEE_RATE_55_TO_60;
        }
        if ((60 < age) && (age <= 65)){
            return EMPLOYEE_RATE_60_TO_65;
        }
        else {
            return EMPLOYEE_RATE_65_ABOVE;
        }
    }
    public static double getEmployerContributionRate(int age) {
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        if (age <= 55) {
            return EMPLOYER_RATE_55_AND_BELOW;
        }
        if ((55 < age) && (age <= 60)){
            return EMPLOYEE_RATE_55_TO_60;
        }
        if ((60 < age) && (age <= 65)){
            return EMPLOYER_RATE_60_TO_65;
        }
        else {
            return EMPLOYER_RATE_65_ABOVE;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        double salary = in.nextDouble();
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        double employeeContribution = salary * getEmployeeContributionRate(age);
        double employerContribution = salary * getEmployerContributionRate(age);
        double totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }

}
