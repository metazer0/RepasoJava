//import java.util.Scanner;
//
//public class Arrays {
//    public static void main(String[] args) {
////
////        int[] array = new int[10];
////        array[0] = 6;
////        array[1] = 2;
////        array[2] = 8;
////        array[3] = 1;
////        array[4] = 3;
////        array[5] = 0;
////        array[6] = 9;
////        array[7] = 7;
////
////
////
////        while(true){
////
////            System.out.println("Search for?");
////
////            int num = Integer.valueOf(scanner.nextLine());
////            boolean found = false;
////            int index = 0;
////
////            for (int i = 0 ; i < array.length ; i++){
////                if(num == array[i]){
////                    found = true;
////                    index = i;
////                }
////                else{
//////                    found = false;
////                }
////            }
////
////            if(found == true){
////                System.out.println(num+"is at index "+index);
////            }else{
////                System.out.println(num+" was not found.");
////            }
////        }
//
//        int[] numbers = {5, 1, 3, 4, 2};
//        int res = sumOfNumbersInArray(numbers);
//        System.out.println(res);
//        int[] array = {5, 1, 3, 4, 2};
//        printArrayInStars(array);
//
////        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
////        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};
////
////        for (int i = 0; i < arrayOfFloatingpoints.length; i++) {
////            System.out.println(arrayOfStrings[i] + " " +  arrayOfFloatingpoints[i]);
////        }
//
//    }
//
//    private static void printArrayInStars(int[] array) {
//        for(int i = 0 ; i < array.length ; i++){
//            for (int j = 0 ; j < array[i] ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    private static int sumOfNumbersInArray(int[] numbers) {
//        int sum = 0;
//
//        for(int i = 0 ; i < numbers.length ; i++){
//            sum += numbers[i];
//        }
//        return sum;
//    }
//
//    public static boolean toString(int[] numbers) {
//    }
//}
