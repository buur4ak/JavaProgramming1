package day10_string;
import java.util.Scanner;
public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();

        input.nextLine();
        System.out.println("Enter your Street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();



        System.out.println("full_name = " + full_name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);

        System.out.println("\tYour shipping address is:");
        System.out.println("\t\t"+full_name);
        System.out.println("\t\t"+buildingNumber+" "+streetName);
        System.out.println("\t\t"+cityName+", "+stateName+" "+zipCode);

        input.close();















    }
}
