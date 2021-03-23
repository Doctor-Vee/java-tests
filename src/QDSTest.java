public class QDSTest {


    // IMPLEMENT ME
    private static String reverseCase(final String wordToReverse) {
        String reversed = "";

//Solution 1
        char[] characters = wordToReverse.toCharArray();
        for (char ch : characters) {
            if (Character.isLowerCase(ch)) {
                reversed += Character.toUpperCase(ch);
            } else {
                reversed += Character.toLowerCase(ch);
            }
        }

// Solution 2
        // String [] letters = wordToReverse.split("");
        // for (int i = 0; i<letters.length; i++){
        //   if(Character.isLowerCase(wordToReverse.charAt(i))){
        //     reversed += Character.toUpperCase(wordToReverse.charAt(i));
        //   } else {
        //     reversed += Character.toLowerCase(wordToReverse.charAt(i));
        //   }
        // }

// Solution 3
        // String [] letters = wordToReverse.split("");

        // for (String letter: letters){
        //   if("abcdefghijklmnopqrstuvwxyz".contains(letter)){
        //     reversed += letter.toUpperCase();
        //   } else {
        //     reversed += letter.toLowerCase();
        //   }
        // }


        return reversed;
    }

    private static void reverseCaseTest() {

        String result = reverseCase("Happy Birthday");
        assertStrings("hAPPY bIRTHDAY", result);

        System.out.println("----------------------------------------");

        String result2 = reverseCase("MANY THANKS");
        assertStrings("many thanks", result2);

        System.out.println("----------------------------------------");

        String result3 = reverseCase("sPoNtAnEoUs");
        assertStrings("SpOnTaNeOuS", result3);
    }


    //Returns the number of alphanumeric characters that are duplicated

    // IMPLEMENT ME
    private static int countDuplicates(String toBeCounted) {


        return 5;
    }

    private static void countDuplicatesTest() {

        int result1 = countDuplicates("Aa");
        assertStrings("0", String.valueOf(result1));
        System.out.println("----------------------------------------");

        int result2 = countDuplicates("Indivisibilities");
        assertStrings("2", String.valueOf(result2));
        System.out.println("----------------------------------------");

        int result3 = countDuplicates("aabbcdeee");
        assertStrings("3", String.valueOf(result3));

    }


    private static void assertStrings(String expected, String actual) {
        System.out.println("expected : " + expected);
        System.out.println("actual : " + actual);
        System.out.println("Test : " + expected.equals(actual));
    }


    public static void main(String[] args) {

        System.out.println(System.lineSeparator());
        System.out.println("Reverse Case");
        System.out.println(System.lineSeparator());

        reverseCaseTest();

        System.out.println(System.lineSeparator());
        System.out.println("Count Duplicates");
        System.out.println(System.lineSeparator());

        countDuplicatesTest();
    }

}


