import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}

class TextUI{
    private Scanner scanner;
    private SimpleDictionary objects;
    public TextUI(Scanner scanner, SimpleDictionary objects){
        this.scanner = scanner;
        this.objects = objects;
    }

    public void start(){
        while(true){
            System.out.print("Command:");
            String command = scanner.nextLine();
            switch (command){

                case "add":
                    System.out.print("Word:");
                    String word = scanner.nextLine();
                    System.out.println("Translation:");
                    String translation = scanner.nextLine();
                    objects.add(word,translation);
                    continue;

                default:
                    System.out.println("Uknown command, please enter a new command");
                    continue;

                case "search":
                    System.out.println("To be translated:");
                    String translated = scanner.nextLine();

                case "end":
                    System.out.println("Bye bye!");
                    break;
            }
                break;
        }
    }
}

class SimpleDictionary{

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

}
