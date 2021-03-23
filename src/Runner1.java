import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;


public class Runner1 {

    public static int testFunction(List<String> input) {
        HashSet<String> setter = new HashSet<>();
        for (String str : input) {
            setter.add(str);
        }

        for (String word : setter) {
            System.out.println(word);
        }
        System.out.println(setter.size());
        return input.size();
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(testFunction(Arrays.asList("Msan", "Womanj", "Guys", "Girls", "Msan", "Guys", "Mango")));

    }


}

