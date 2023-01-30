import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();


        while(true){
            System.out.println("Name:");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Item item = new Item(name);
            items.add(item);
        }

        for (Item itemm : items) {
            System.out.println(itemm.toString());
        }
    }
}
