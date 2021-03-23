import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class WorkingWithSets {

    public static int testFunction(List<String> input) {
        HashSet<String> setter = new HashSet<>();
        for (String str : input) {
            setter.add(str);
        }

        for (String word : setter) {
            System.out.println(word);
        }
        return input.size();
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(testFunction(Arrays.asList("Msan", "Womanj", "Guys", "Girls", "Msan", "Guys", "Mango")));

    }


}

