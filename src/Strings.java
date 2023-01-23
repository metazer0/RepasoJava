import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while(true){
//            String input = scanner.nextLine();
//            if(input.equals("")){
//                break;
//            }
//
//            String [] pieces = input.split(",");
//            System.out.println("Name :"+pieces[0]+", age: "+pieces[1]);
//        }
//
//        while(true){
//            String input = scanner.nextLine();
//            if(input.equals("")){
//                break;
//            }
//
//            String [] pieces = input.split(" ");
//            int last = pieces.length - 1;
//
//            System.out.println(pieces[last]);
//        }

        int sumyears = 0;
        double avg = 0.0;
        int count = 0;
        String longest = "";
        int Maxlength = 0;
        ArrayList<String> names = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] pieces = input.split(",");
            names.add(pieces[0]);
            sumyears += Integer.valueOf(pieces[1]);
            count++;
        }

        for (String name : names) {
            if(name.length() > Maxlength){
                Maxlength = name.length();
                longest = name;
            }
        }

        System.out.println(longest);
        avg = sumyears/count;
        System.out.println(avg);
    }
}
