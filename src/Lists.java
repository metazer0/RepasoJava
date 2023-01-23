import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Lists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        ArrayList<String> list = new ArrayList<>();
//
//        while(true){
//            System.out.println("Enter a name");
//            String input = scanner.nextLine();
//            if(input.equals("")){
//                break;
//            }else{
//                list.add(input);
//            }
//        }
//
//        int size = list.size() - 1;
//
//
//        String i = list.get(size);j
//        String f = list.get(0);
//
//        System.out.println(i);
//        System.out.println(f);

//        System.out.println("Enter a number");
//
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while(true){
//            int input = Integer.valueOf(scanner.nextLine());
//
//            if(input < 0){
//                break;
//            }else{
//                list.add(input);
//            }
//        }
//
//        System.out.println("Search For?");
//        int num = Integer.valueOf(scanner.nextLine());
//        int res = SearchForIndex(list,num);
//        System.out.println(num+" is at index "+res);
//

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);


    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lower, int upper){

        for (int i = 0 ; i < numbers.size(); i++){
            int number = numbers.get(i);
            if(number >= lower && number <= upper){
                System.out.println(number);
            }
        }
    }
    public static int SearchForIndex(ArrayList<Integer> list, int num){

        for(int i = 0 ; i < list.size() ; i++){
            if(num == list.get(i)){
                return i;
            }
        }
        return 0;
    }
}


