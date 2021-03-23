import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) throws Exception {

        Pattern p1 = Pattern.compile("[0-9]*");
        Matcher m1 = p1.matcher("081392i4232");
        System.out.println(m1.matches());

        Pattern p2 = Pattern.compile("[0-9]*[a-z]");
        System.out.println(p2.matcher("081392i4232").matches());

        Pattern p3 = Pattern.compile("[0-9]*[a-z]*[0-9]*");
        System.out.println(p3.matcher("081392i4232").matches());

        Pattern responsePattern = Pattern.compile("Congratulations, your account number is [0-9]*");
        System.out.println(responsePattern.matcher("Congratulations, your account number is 123a").matches());

    }





}

