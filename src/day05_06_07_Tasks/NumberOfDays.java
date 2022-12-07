package day05_06_07_Tasks;

public class NumberOfDays {

    public static void main(String[] args) {

        int n = 10;

        boolean has28Days = n == 2;
        boolean has30Days = n == 4 || n == 6 || n == 8 || n == 11;
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){

            System.out.println("28 Days");
        }
        if(has30Days){
            System.out.println("30 Days");
        }
        if(has31Days){
            System.out.println("31 Days");
        }


    }


}
