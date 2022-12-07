package day22_arrayList;


public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a = 10;

        Integer a2 = 10;

        System.out.println("----------------------------------------------------------------");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1; // Auto boxing

        // Long b3 = (long)b1;
        // Double b4 = b1;

        char ch = 'A';

        Character ch2 = ch; // Auto boxing

        double d1 = 5.5;
        Double d2 = d1; // Auto boxing

        System.out.println("----------------------------------------------------------------");

        Integer n1 = 20;

        int n2 = n1;

        /*
        long n3 = n1;
        double n4 = n1;
        float n5 = n1;
        */

        Character e1 = 'Z';

        char e2 = e1; //unboxing
















    }


}
