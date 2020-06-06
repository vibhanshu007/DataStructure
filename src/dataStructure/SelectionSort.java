package dataStructure;

public class SelectionSort {

    public static void main(String [] args){

        int[] intArray = {-5, 76, 89, -98, 84, 94, 45, -59, 38, 94, -4};

        for(int lastUnsortArray = intArray.length - 1 ; lastUnsortArray >0; lastUnsortArray--){

            int larger = 0;

            for (int i = 0 ; i<= lastUnsortArray; i++){
                if(intArray[i]>intArray[larger]){
                    larger = i;
                }
            }

            swipeArray(intArray,larger,lastUnsortArray);
        }

        for (int i: intArray) {
            System.out.println(i);
        }

    }

    private static void swipeArray(int[] array, int firstElement, int secondElement){

        if( firstElement == secondElement){
            return;
        }

        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
