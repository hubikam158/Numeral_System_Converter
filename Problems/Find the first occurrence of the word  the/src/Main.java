import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Pattern pattern = Pattern.compile("[tT]he");
        Matcher matcher = pattern.matcher(sentence);
        System.out.println(matcher.find() ? matcher.start() : "-1");
    }
}