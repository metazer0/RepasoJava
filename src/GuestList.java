
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                list.add(reader.nextLine());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("Enter names, an empty line quits");

        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            if(list.contains(name)){
                System.out.println("The name is on the list");
            }else{
                System.out.println("Name not on the list");
            }

        }
    }
}
