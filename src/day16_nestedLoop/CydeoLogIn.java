package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = input.next();
        System.out.println("Enter your password");
        String password = input.next();


        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 3; i++) {
                if( i != 2){
                    System.err.println("Incorrect username and password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }


                System.err.println("Incorrect username and password, please re-enter");
                System.out.println("Enter your username:");
                userName = input.next();
                System.out.println("Enter your password");
                password = input.next();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("You are now logged in");
                    break;
                }

            }
            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account now is locked, please contact with support team");

            }


        }
        input.close();

    }

    public static void CydeoLogIn(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{

        }
    }




}
