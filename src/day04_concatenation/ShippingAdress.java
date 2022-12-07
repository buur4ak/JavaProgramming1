package day04_concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        /*
        1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circlex
Fairfax, VA 22030
         */

        String name = "Aaron Kissinger";
        String buildingNumber = "13621A";
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030 ;

        System.out.println("Your shipping address is: \n" + name + "\n" + buildingNumber + " " + streetName + "\n" + city
        +"," + state + " " + zipCode);

    }
}
