import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Give a number:");
//            int number = Integer.valueOf(scanner.nextLine());
//            if(number == 0){
//                break;
//            }else if(number < 0){
//                System.out.println("Unsuitable number");
//                continue;
//            }else if(number > 0){
//                System.out.println(number*number);
//            }
//        }

        int counter = 0;
        int sum = 0;
        double avg = 0;

        while(true){
            System.out.println("Enter input: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0)
                break;
            else{
                if(number > 0){
                    counter++;
                    sum = sum + number;
                }
                else{
                    //do nothing
                }
            }
        }
        if(sum <= 0){
            System.out.println("Cannot calculate average");
        }else{
            avg = sum/counter;
            System.out.println(avg);
        }
    }
}
