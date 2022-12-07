package day05_06_07_Tasks;

public class GradeLevel3 {

    public static void main(String[] args) {

        int gradeLevel = 0;

        String result = "";

        if( gradeLevel <= 5 ){

            result = "Elementary School";

        }else if (gradeLevel <= 8 ){
            result = "Middle School";
        }else if (gradeLevel <= 12 ) {
            result = "High School";
        }else if (gradeLevel <= 16 ) {
            result = "College";
        }else{
            result = "Grad School";

        }

        System.out.println(result);

    }
}
