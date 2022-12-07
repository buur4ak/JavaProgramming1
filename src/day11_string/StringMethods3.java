package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------------------");

        String str = "              ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-------------------------------------------------------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("-------------------------------------------------------------------------------");

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));

        System.out.println("-------------------------------------------------------------------------------");

        String str4 = "Java";
        String str5 = "java";

        System.out.println(str4.equalsIgnoreCase(str5));

        System.out.println("-------------------------------------------------------------------------------");

        String studentName = "Hasan Naran Sumeyye Nataliia";

        boolean hasAhmet = studentName.contains("Ahmed");

        System.out.println("hasAhmet = " + hasAhmet);

        System.out.println("-------------------------------------------------------------------------------");

        String sentence = "My favorite programming language is JAVA";
        
        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);

        System.out.println("-------------------------------------------------------------------------------");

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println("isValid = " + isValid);
        
        boolean t = url.endsWith(".com");

        System.out.println("t = " + t);

        System.out.println("-------------------------------------------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);






















    }
}
