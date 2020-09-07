import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double dist = scanner.nextDouble();
        final double time = scanner.nextDouble();
        System.out.println(dist / time);
    }
}