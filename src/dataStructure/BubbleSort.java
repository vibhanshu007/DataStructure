package dataStructure;

public class BubbleSort {

    public static void main(String... args) {

        int[] intArray = {-5, 76, 89, -98, 84, 94, 45, -59, 38, 94, -4};

        for (int lastUnsortArray = intArray.length - 1; lastUnsortArray > 0; lastUnsortArray--) {
            for (int i = 0; i < lastUnsortArray; i++) {
                if (intArray[i] > intArray[i + 1])
                    swipe(intArray, i, i + 1);
            }
        }
        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }


    public static void swipe(int array[], int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
