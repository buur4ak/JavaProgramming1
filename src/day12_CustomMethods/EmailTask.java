package day12_CustomMethods;

import java.util.Scanner;

public class EmailTask {

    public static void main(String[] args) {

        String email = "alakas_burak@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        System.out.println("firstName = " + firstName);
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        System.out.println("lastName = " + lastName);
        String domainName = email.substring(email.indexOf("@"));
        System.out.println("domainName = " + domainName);


        email = lastName + "_" + firstName + domainName;

        System.out.println("email = " + email);




    }
}
