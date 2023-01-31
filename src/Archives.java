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
            if(archives.contains(archive)){
                continue;
            }else{
                archives.add(archive);
            }


        }
        System.out.println("==Items==");
        for (Archive archive : archives) {
            System.out.println(archive.getIdentifier() + ": " + archive.getName());
        }
    }
}

class Archive{
    String identifier;
    String name;

    public Archive(String identifier, String name){
      this.identifier = identifier;
      this.name = name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        return this.identifier.equals(comparedArchive.identifier);
    }

}
