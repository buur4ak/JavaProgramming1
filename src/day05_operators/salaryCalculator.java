package day05_operators;

public class salaryCalculator {

    public static void main(String[] args) {

        /*

        hourly rate, weekly rate, state Tax Rate, federal Tax Rate


         */

        double hourlyRate = 55;
        double weeklyHours = 46;
        double stateTaxRate = 7;
        double federalTaxRate = 24.5;

        System.out.println("---------------------------------------------------------------");

        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Total Tax is:" + totalTax);
        System.out.println("Net Income is: $" + salaryAfterTax);







    }

        }
