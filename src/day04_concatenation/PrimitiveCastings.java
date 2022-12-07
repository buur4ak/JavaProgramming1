package week02_revivew;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // byte < short < int < long < float < double

        // implicit: smaller to larger

        byte a = 50;

        long b = a;

        double c = 100;

        // explicit: larger to smaller

        double x = 10.5;

        int y = (int) x;

        long z = 1000;

        short q = (short) z;

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2);

        int num = 500;

        byte result = (byte) num;

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        System.out.println("-----------------------------------");

        double u = 3000.5;
        int p = (int) u;

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1);






    }




}
