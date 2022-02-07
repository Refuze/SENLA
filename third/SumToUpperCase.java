package third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumToUpperCase {
    public static String SumToUpperCase (String string){
        string = SumSorter.SumSorter(string);
        int spaceCounter = 1;
        int arrayIndex = 0;
        StringBuilder endString = new StringBuilder();
        Integer[] vowels = new Integer[]{65, 69, 73, 79, 85, 89, 1040, 1054, 1069, 1045, 1048, 1067, 1059, 1025, 1070,
                1071, 97, 101, 105, 111, 117, 121, 1072, 1086, 1101, 1077, 1080, 1099, 1091, 1105, 1102,1103};
        List vowelsList = new ArrayList<>(Arrays.asList(vowels));

        for (char symbol : string.toCharArray()){
            if (symbol == 32)
                spaceCounter++;

        }
        StringBuilder[] stringArray = new StringBuilder[spaceCounter];
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

        for (int i = 0; i < spaceCounter ; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (vowelsList.contains((int)  stringArray[i].charAt(j))){
                    stringArray[i].insert(j, Character.toUpperCase(stringArray[i].charAt(j)));
                    break;
                }
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            endString.append(stringArray[i]).append(" ");
        }
        return endString.toString();
    }
}
