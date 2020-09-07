import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += Character.getNumericValue(number.charAt(i));
            sum2 += Character.getNumericValue(number.charAt(number.length() - 1 - i));
        }
        System.out.println((sum1 == sum2) ? "Lucky" : "Regular");
    }
}