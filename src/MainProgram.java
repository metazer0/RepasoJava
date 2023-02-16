public class MainProgram {
    public static void main(String[] args) {
        int [] arr = {9,14,3,2,43,11,58,22};

        System.out.println("Before selection sort");

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);

        System.out.println("After selection sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int [] arr){

        int smallest = 0;
        int startIndex = 0;

        for(int i = 0 ; i < arr.length - 1 ; i++){

            startIndex = i;

            for(int  j = i + 1 ; j < arr.length ; j++){
                if(arr[startIndex] > arr[j]){
                    startIndex = j;
                }
            }

            smallest = arr[startIndex];
            arr[startIndex] = arr[i];
            arr[i] = smallest;
        }
    }

}
