package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xxxxxxxxxxxzzzzzzzzzzzzzzzzzzzzzyyyyyyyyyyyyyyyyxxxxxxxxxxxxxzzzzzzzzzzzzzzzzzz";

        String result = "";   //""

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            if (result.contains("" + str.charAt(i))) { // if the character is already contained in new string
                continue; // skip it
            }

            result += str.charAt(i);
        }
        System.out.println(result);
    }
}