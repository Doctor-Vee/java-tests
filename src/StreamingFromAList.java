import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamingFromAList {
    public static void main(String[] args) {

        System.out.println("Hello World"); 
        List<String> l = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        Stream<String> sl2 = l.stream();
        l.add("three");
        String s1 = sl.collect(joining(" - "));
        System.out.println(s1);
//        System.out.println(l);
        l.add("manicure");
        try {
            String s2 = sl2.collect(joining(" + "));
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
//        System.out.println(l);
        System.out.println("Bye Bye");
    }

}
