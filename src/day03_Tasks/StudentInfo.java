package day03_Tasks;

public class StudentInfo {

    public static void main(String[] args) {

        //DataType variableName = Data;

        /*
    1. Create a class named StudentInfo.java
    2. Declare the following variables with appropriate data types:
1. students_name
2. age
3. gender
4. school_name
5. student_id
6. grade_level
7. gpa
8. isFullTime


         */

        String student_name = " Azra Alakas",
                school_name = "Abbey Lane School",
                grade_level = "Mid Level JD";

        int age = 19;
        char gender = 'F';
        String student_id = "DAA16";
        double gpa = 3.6;
        boolean isFullTime= true;

        System.out.println("isFullTime = " + isFullTime);
        System.out.println("gpa = " + gpa);
        System.out.println("student_id = " + student_id);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("student_name = " + student_name);
        System.out.println("school_name = " + school_name);
        System.out.println("grade_level = " + grade_level);


        System.out.println("------------------------------");

    }
}
