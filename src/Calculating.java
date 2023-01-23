import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give the first number: ");
//        int a = Integer.valueOf(scanner.nextLine());
//        int b = Integer.valueOf(scanner.nextLine());
//        int c = a+b;
//        System.out.println(a+"+"+b+"="+c);
        System.out.println("Give the first number: ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int b = Integer.valueOf(scanner.nextLine());
        int sum = a+b;
        int product = a*b;
        int difference = a-b;
        double quotient = a/b;
        System.out.println(a+"+"+b+"="+sum);
        System.out.println(a+"-"+b+"="+difference);
        System.out.println(a+"*"+b+"="+product);
        System.out.println(a+"/"+b+"="+quotient);
    }
}
