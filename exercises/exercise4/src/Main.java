import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        //case 1
        System.out.println("case 1:");
        System.out.println("Positive case: regex(^wen[a-z]?)  text(wena)  result: "
                + Pattern.matches("^wen[a-z]?", "wena"));
        System.out.println("Negative case: regex(^wen[a-z]?)  text(wea)  result: "
                + Pattern.matches("^wen[a-z]?", "wea"));

        //case 2
        System.out.println("case 2:");
        System.out.println("Positive case: regex([a-z]+wen$)  text(abwen)  result: "
                + Pattern.matches("[a-z]+wen$", "abwen"));
        System.out.println("Negative case: regex([a-z]+wen$)  text(aben)  result: "
                + Pattern.matches("[a-z]+wen$", "aben"));
        //case 3
        System.out.println("case 3:");
        System.out.println("Positive case: regex(wen[0-9]+)  text(wen123)  result: "
                + Pattern.matches("wen[0-9]+", "wen123"));
        System.out.println("Negative case: regex(wen[0-9]+)  text(wen)  result: "
                + Pattern.matches("wen[0-9]+", "wen"));

        //case 4
        System.out.println("case 4:");
        System.out.println("Positive case: regex(wen[0-9]?)  text(wen1)  result: "
                + Pattern.matches("wen[0-9]?", "wen1"));
        System.out.println("Negative case: regex(wen[0-9]?)  text(wen1234)  result: "
                + Pattern.matches("wen[0-9]?", "wen1234"));

        //case 5
        System.out.println("case 5:");
        System.out.println("Positive case: regex(wen[^1-9]+)  text(wen00000)  result: "
                + Pattern.matches("wen[^1-9]+", "wen00000"));
        System.out.println("Negative case: regex(wen[^1-9]+)  text(wen1234)  result: "
                + Pattern.matches("wen[^1-9]+", "wen00110"));
    }
}