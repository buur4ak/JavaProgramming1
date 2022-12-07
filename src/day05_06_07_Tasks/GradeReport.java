package day05_06_07_Tasks;

public class GradeReport {

    public static void main(String[] args) {

        int score = 65;

        String result = "Your grade is ";

        if(score >= 90 ){
            result += "A";
        }else if(score < 90 && score >= 80){
            result += "B";
        }else if (score < 80 && score  >= 70){
            result += "C";
        }else if(score < 70 && score >=60 ){
            result += "D";
        }else{
            result +="F";
        }

        System.out.println(result);
    }
}
