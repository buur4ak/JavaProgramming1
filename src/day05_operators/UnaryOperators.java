package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int x = 10;

        System.out.println(++x);
        System.out.println(x);

        int y = 100;

        System.out.println(--y);
        System.out.println(y);

        int a = 50;

        System.out.println(a--);
        System.out.println(a);

        System.out.println("-------------------------------------------------------");

        int n = 30;

        int m = n++;

        System.out.println("m = " + m);

        int z = 60;

        int q = z--;

        System.out.println("z = " + z);

        System.out.println("q = " + q);






    }


}
