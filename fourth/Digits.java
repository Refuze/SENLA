package fourth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Создайте программу, которая будет получать число и печатать
его в следующем формате (формы цифр можно придумать свои,
главное, чтобы они читались на экране)*/

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = scanner.nextLine();
        try {
            ArrayList<Integer> listDigits = parseDigits(str);
            ArrayList<ArrayList<String>> digitsToWrite = getStringOfString(listDigits);
            showDigits(digitsToWrite);
        } catch (NumberFormatException e) {
            System.out.println("Not a number entered");
        }
    }

    private static ArrayList<Integer> parseDigits(String str){
        ArrayList<Integer> digits = new ArrayList<>();
        for(int i =0; i < str.length(); i++){
            digits.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return digits;
    }

    private static void showDigits(ArrayList<ArrayList<String>> digits){
        for (int i = 0; i < digits.get(0).size(); i++) {
            for (int j = 0; j < digits.size(); j++) {
                System.out.print(digits.get(j).get(i));
                System.out.print(" ");
                if(j == digits.size() - 1)
                    System.out.println();
            }
        }
    }

    private static ArrayList<ArrayList<String>> getStringOfString(ArrayList<Integer> digits){
        ArrayList<ArrayList<String>> digitsList = new ArrayList<>();
        for (Integer digit : digits) {
            digitsList.add(getListForDigit(digit));
        }
        return digitsList;
    }

    private static ArrayList<String> getListForDigit(int digit){
        return switch (digit) {
            case 0 -> new ArrayList<>(Arrays.asList("  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "));
            case 1 -> new ArrayList<>(Arrays.asList("  *   ", " **   ", "  *   ", "  *   ", "  *   ", "  *   ", " ***  "));
            case 2 -> new ArrayList<>(Arrays.asList(" ***  ", "*   * ", "*  *  ", "  *   ", " *    ", "*     ", "***** "));
            case 3 -> new ArrayList<>(Arrays.asList("******", "    * ", "   *  ", "  *   ", " **** ", "     *", "***** "));
            case 4 -> new ArrayList<>(Arrays.asList("   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "));
            case 5 -> new ArrayList<>(Arrays.asList(" *****", " *    ", " *    ", " **** ", "     *", "     *", "***** "));
            case 6 -> new ArrayList<>(Arrays.asList("     * ", "    *  ", "   *   ", "  *    ", " ***** ", " *   * ", " ***** "));
            case 7 -> new ArrayList<>(Arrays.asList("***** ", "    * ", "   *  ", "  *   ", " *    ", "*     ", "*     "));
            case 8 -> new ArrayList<>(Arrays.asList(" ***  ", "*   * ", "*   * ", " ***  ", "*   * ", "*   * ", " ***  "));
            case 9 -> new ArrayList<>(Arrays.asList(" **** ", "*   * ", "*   * ", " **** ", "    * ", "    * ", "    * "));
            default -> new ArrayList<>();
        };
    }
}