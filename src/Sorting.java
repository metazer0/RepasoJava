import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        Sorting.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        Sorting.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
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

    }
}

