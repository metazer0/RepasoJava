import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Sorting.sort(numbers);
    }

    public static int smallest(int [] array){

        int smallest = array[0];

        for(int i = 0 ; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int [] array){
        int smallest = array[0];
        int indexSmallest = 0;

        for(int i = 0 ; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static int indexOfSmallestFrom(int [] array, int startIndex){
        int smallest = array[startIndex];
        int indexSmallest = 0;
        for(int i = startIndex ; i < array.length ; i++ ){
            if(smallest >= array[i]){
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int [] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void sort(int [] array){

        int index = 0;

        System.out.println(Arrays.toString(array));

        while(index < array.length){
            swap(array, index, indexOfSmallestFrom(array,index));
            System.out.println(Arrays.toString(array));
            index += 1;
        }


    }
}

