package third;

public class SumSorter {
    public static String SumSorter (String string){
        int spaceCounter = 1;
        int arrayIndex = 0;
        boolean needIteration = true;
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

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < spaceCounter; i++) {
                if (sumArray[i] > sumArray[i - 1]) {
                    swapInt(sumArray, i, i-1);
                    swapString(stringArray, i, i-1);
                    needIteration = true;
                }
            }
        }

        for (int i = 0; i < spaceCounter; i++) {
            endString.append(stringArray[i]).append(" ");
        }
        return endString.toString();
    }

    private static void swapString(StringBuilder[] array, int ind1, int ind2) {
        StringBuilder tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static void swapInt(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
