package day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase();

        System.out.println(str1);


        System.out.println("--------------------------------------");

        String str2 = "java programming";

        str2 = str2.toUpperCase();

        System.out.println(str2);

        System.out.println("--------------------------------------");

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // WOODEN SPOON
                                                                    // son olarak tanimladigimiz olani calistirir
        word = word.toLowerCase(); // wooden spoon

        System.out.println(word);

        System.out.println("--------------------------------------");

        String str4 = "        Cydeo School";

       str4 =str4.trim(); //"Cydeo School" // trim method gereksiz bosluklari silmek icin kullanilir

        System.out.println(str4);

        System.out.println("--------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String sentence2 = "I love Java Programming";

        int firstA = sentence2.indexOf('a');

        System.out.println(firstA);

        int secondA = sentence2.indexOf("a ");

        System.out.println(secondA);

        String s2 = "Java Python JavaScript Cydeo Pyhton";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        System.out.println("--------------------------------------");

        String w = "Java";

        System.out.println( w.indexOf('a') );

        System.out.println( w.lastIndexOf('a') );

        String w2 = "Java Python JavaScript Cydeo Pyhton";

        System.out.println( w2.indexOf('a') );

        System.out.println( w2.lastIndexOf('P') );









    }
}
