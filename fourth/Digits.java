package fourth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        var listDigits = parseDigits(str);
        var digitsToWrite = getStringOfString(listDigits);
        showDigits(digitsToWrite);
    }

    private static ArrayList<Integer> parseDigits(String str){
        var digits = new ArrayList<Integer>();
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
        var digitsList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < digits.size(); i++) {
            digitsList.add(getListForDigit(digits.get(i)));
        }
        return digitsList;
    }

    private static ArrayList<String> getListForDigit(int digit){
        var digitList = new ArrayList<String>();
        switch (digit){
            case 0:
                digitList = new ArrayList<>(Arrays.asList("  ***  "," *   * ","*     *","*     *","*     *"," *   * ","  ***  "));
                break;
            case 1:
                digitList = new ArrayList<>(Arrays.asList("  *   "," **   ","  *   ","  *   ","  *   ","  *   "," ***  "));
                break;
            case 2:
                digitList = new ArrayList<>(Arrays.asList(" ***  ","*   * ","*  *  ","  *   "," *    ","*     ","***** "));
                break;
            case 3:
                digitList = new ArrayList<>(Arrays.asList("******","    * ","   *  ","  *   "," **** ","     *","***** "));
                break;
            case 4:
                digitList = new ArrayList<>(Arrays.asList("   *  ","  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "));
                break;
            case 5:
                digitList = new ArrayList<>(Arrays.asList(" *****"," *    "," *    "," **** ","     *","     *","***** "));
                break;
            case 6:
                digitList = new ArrayList<>(Arrays.asList("     * ","    *  ","   *   ","  *    "," ***** "," *   * "," ***** "));
                break;
            case 7:
                digitList = new ArrayList<>(Arrays.asList("***** ","    * ","   *  ","  *   "," *    ","*     ","*     "));
                break;
            case 8:
                digitList = new ArrayList<>(Arrays.asList(" ***  ","*   * ","*   * "," ***  ","*   * ","*   * "," ***  "));
                break;
            case 9:
                digitList = new ArrayList<>(Arrays.asList(" **** ","*   * ","*   * "," **** ","    * ","    * ","    * "));
                break;
        }
        return digitList;
    }

}