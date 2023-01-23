import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int chicken = 9000;
//        double bacon = 0.1;
//        String zetor = "Zetor";
//        System.out.println("Chicken");
//        System.out.println(chicken);
//        System.out.println("Bacon (kg)");
//        System.out.println(bacon);
//        System.out.println("Tractor");
//        System.out.println(zetor);
//
//        System.out.println("And finally, a summary:");
//        System.out.println(chicken);
//        System.out.println(bacon);
//        System.out.println(zetor);

//        System.out.println("Give a number");
//        int number = Integer.valueOf(scanner.nextLine());
//        System.out.println("You gave the number "+number);

        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a Double");
        double doubles = Double.valueOf(scanner.nextLine());
        System.out.println("Give a Boolean");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string "+str);
        System.out.println("You gave the integer "+integer);
        System.out.println("You gave the double "+doubles);
        System.out.println("You gave the boolean "+bool);
    }
}
