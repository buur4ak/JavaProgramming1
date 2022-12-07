package day12_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(20,5);

        System.out.println("----------------------");

        maxNum(1000,500);

        System.out.println("----------------------");

        initial("Burak", "Alakas");

        initial("Kaan","Alakas");




    }

    // create a method that can print the maximum number between numbers, if both are equal then it prints "Equal" (num1 num2)

    public static void maxNum(double num1, double num2){

        if(num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num1 < num2){
            System.out.println(num2 + " is maximum number");
        }else{
            System.out.println("Equal");
        }

    }

    // Create a method tha can display the initials of a person (firstname, lastname)

    public static void initial (String firstName, String lastName){

        String initial = firstName.charAt(0) +"."+lastName.charAt(0);

        System.out.println("initial is: " + initial);





    }



}



