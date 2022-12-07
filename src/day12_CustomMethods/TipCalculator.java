package day12_CustomMethods;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split(Yes or No):");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int  numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();

        System.out.println("How is the Service Quality (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next().toLowerCase();

        double totalTip = (serviceQuality.equals("excellent"))? amount*0.25
                : (serviceQuality.equals("great"))? amount*0.20
                : (serviceQuality.equals("good"))? amount*0.15
                : (serviceQuality.equals("fair"))? amount*0.1
                : amount*0.05;

        double totalToPay = amount + totalTip;
        System.out.println("numberOfPeople: " + numberOfPeople);
        System.out.println("Total To Pay: " + totalToPay);
        System.out.println("Total Tip: "+totalTip);

        if(yesNo.equals("yes")){
            System.out.println("Total per person: "+(totalToPay/numberOfPeople));
            System.out.println("Tip per person: "+(totalTip/numberOfPeople));
        }




















    }
}
