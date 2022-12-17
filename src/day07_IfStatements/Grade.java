package day07_IfStatements;

import org.w3c.dom.ls.LSOutput;

public class Grade {

    public static void main(String[] args) {


        System.out.println();

        char grade = 'B';

        String result = "";

        if(grade == 'A'){
            result = "Excellent";
        }
        if(grade == 'B'){
            result = "Great Job";
        }
        if(grade == 'C'){
            result = "Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);


    }


}
