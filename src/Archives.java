import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Archives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.equals("")){
                break;
            }
            System.out.println(identifier);
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println(name);
            Archive archive = new Archive(identifier,name);
            archives.add(archive);
        }
        System.out.println("==Items==");
    }
}

class Archive{
    String identifier;
    String name;

    public Archive(String identifier, String name){
      this.identifier = identifier;
      this.name = identifier;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

}
