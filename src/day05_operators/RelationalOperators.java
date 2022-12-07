package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        System.out.println(a > b);

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        int score = 60;

        boolean passed = score >= 60;

        System.out.println(passed);

        System.out.println("-------------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);


        System.out.println("-------------------------------");

        score = 48;

        boolean failed = score < 60;

        System.out.println(failed);

        System.out.println("-------------------------------");

        System.out.println('a' > 'b');










    }
}
