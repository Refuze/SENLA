package third;

import java.util.ArrayList;

public class SumVowelWords {
    public static void SumVowelWords (String string){
        int spaceCounter = 1;
        int arrayIndex = 0;
        StringBuilder endString = new StringBuilder();

        for (char symbol : string.toCharArray()){
            if (symbol == 32)
                spaceCounter++;
        }

        StringBuilder[] stringArray = new StringBuilder[spaceCounter];
        int[] sumArray = new int[spaceCounter];

        for (int i = 0; i < spaceCounter; i++) {
            stringArray[i] = new StringBuilder();
        }

        for (char symbol : string.toCharArray()) {
            stringArray[arrayIndex].append(symbol);
            if (symbol == 32) {
                stringArray[arrayIndex].deleteCharAt(stringArray[arrayIndex].length() - 1);
                arrayIndex++;
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            sumArray[i] = SumVowelLetter.SumVowelLetter(stringArray[i].toString());
        }

        for (int number : sumArray) {
            endString.append(number).append(", ");
        }
        stringArray[arrayIndex].deleteCharAt(stringArray[arrayIndex].length() - 1);
        stringArray[arrayIndex].deleteCharAt(stringArray[arrayIndex].length() - 1);
        System.out.println(endString);
    }
}
