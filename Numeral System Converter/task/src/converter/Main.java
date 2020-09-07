package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int sourceBase = sc.nextInt();
            String number = sc.next();
            int targetBase = sc.nextInt();
            if (sourceBase < 1 || sourceBase > 36 || targetBase < 1 || targetBase > 36) {
                System.out.println("Error, base out of bounds");
            } else {
                String[] splitNumbers = number.split("\\.");
                long decNumInt;
                double decNumFr = 0;
                String resultIntPart;
                StringBuilder resultFrPart = new StringBuilder();

                decNumInt = (sourceBase == 1) ? splitNumbers[0].length() : Long.parseLong(splitNumbers[0], sourceBase);
                resultIntPart = targetBase == 1 ? onesSystem(decNumInt) : Long.toString(decNumInt, targetBase);

                if (splitNumbers.length > 1) {
                    for (int i = 0; i < splitNumbers[1].length(); i++) {
                        decNumFr += (double) Character.getNumericValue(splitNumbers[1].toCharArray()[i]) / Math.pow(sourceBase, i + 1);
                    }
                    for (int i = 0; i < 5; i++) {
                        String multiRes = Double.toString(decNumFr * targetBase);
                        String[] splitMultiRes = multiRes.split("\\.");
                        resultFrPart.append(Long.toString(Long.parseLong(splitMultiRes[0]), targetBase));
                        decNumFr = Double.parseDouble("0." + splitMultiRes[1]);
                    }
                }

                System.out.println(resultIntPart + "." + resultFrPart.toString());
            }
        } catch (Exception e) {
            System.out.println("Error, " + e.getClass().getSimpleName());
        }
    }

    private static String onesSystem(long decNum) {
        StringBuilder newNumber = new StringBuilder();
        for (int i = 0; i < decNum; i++) {
            newNumber.append("1");
        }
        return newNumber.toString();
    }
}
