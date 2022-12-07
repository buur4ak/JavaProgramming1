package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //------- Implicit Castings-------


         byte a = 15;

         short b = a;

        System.out.println(b);

        int c = a;

        long d = 3000L;

        float f = d;

        //-----------------------------

        int x = 100;

        byte y = (byte)x;


        float z = 20.8f;

        short q = (short)z;     // z 20.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2);


        System.out.println("---------------------------------");

        int num= 500;

        byte result = (byte) num; // explicit castings

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);







    }
}
