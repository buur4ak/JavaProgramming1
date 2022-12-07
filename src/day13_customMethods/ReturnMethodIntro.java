package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        addition(10,20);

        System.out.println(square(10));

        System.out.println(cube(5));

        int r = cube(8);

        System.out.println(r);




    }

    public static int addition(int n1, int n2) {
        int result = n1 + n2;
        return result;


    }

    public static int square(int num){

        int square = num*num;
        return square;

    }

    public static int cube(int num){

        int cube = square(num) * num;
        return cube;

    }



}
