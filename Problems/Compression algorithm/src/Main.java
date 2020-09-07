import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        int count = 1;
        System.out.print(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]) {
                System.out.print(String.valueOf(count) + chars[i]);
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}