package dataStructure;

public class InsertionSort {

    public static void main(String ... args){

        int[] intArray = {-5, 76, 89, -98, 84, 94, 45, -59, 38, 94, -4};

        for (int firstUnsortArrayIndex = 1; firstUnsortArrayIndex < intArray.length; firstUnsortArrayIndex++){
            int newEelement = intArray[firstUnsortArrayIndex];

            int i;

            for(i = firstUnsortArrayIndex ; i > 0 && intArray[i-1] > newEelement; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newEelement;
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
