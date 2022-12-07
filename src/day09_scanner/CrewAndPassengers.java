package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 50;

        String result1 = (number == 50 || number == 75 || number == 100)?
                (number == 50)? "20 crew, 30 passenger":
                        (number == 75)? "25 crew, 50 passenger": "30 crew, 70 passenger" : "Invalid";


        System.out.println(result1);
        System.out.println("-----------------------------------------------------------------------------");

        String result2 = "";

        switch (number){
            case 50 :
                    result2 = "20 crew, 30 passenger";
                    break;

            case 75 :
                result2 = "25 crew, 50 passenger";
                break;

            case 100 :
                result2 = "30 crew, 70 passenger";
                break;

            default:
                result2 = "Invalid";
                break;


        }

        System.out.println(result2);













    }
}
