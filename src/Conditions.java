import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a year: ");
//        int year = Integer.valueOf(scanner.nextLine());
//        if(year < 2015){
//            System.out.println("Ancient history!");
//        }
//        System.out.println("Give points [0-100]");
//        int points = Integer.valueOf(scanner.nextLine());
//        if(points > 100){
//            System.out.println("Incredible!");
//        }
//        else if(points >= 90 && points <= 100){
//            System.out.printf("5");
//        }
//        else if(points >= 80 && points <= 89){
//            System.out.printf("4");
//        }
//        else if(points >= 70 && points <= 79){
//            System.out.printf("3");
//        }
//        else if(points >= 60 && points <= 69){
//            System.out.printf("2");
//        }
//        else if(points >= 50 && points <= 59){
//            System.out.printf("1");
//        }
//        else if(points >= 0 && points <= 49){
//            System.out.printf("failed");
//        }
//        else System.out.println("impossible!");

//        System.out.println("Password?");
//        String password = scanner.nextLine();
//        if(password.equals("Caput Draconis")){
//            System.out.println("Welcome!");
//        }else{
//            System.out.println("Off with you!");
//        }

        System.out.println("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
        if(year%100==0 && year%400==0){
            System.out.println("The year is a leap year");
        }
        else if(year%4==0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
