import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file:");
        String file = scanner.nextLine();

        ArrayList<Persona> records = readRecordsFromFile(file);
        System.out.println("Persons: "+records.size());
        System.out.println("Persons:");
        for (Persona record : records) {
            System.out.println(record);
        }
    }

    public static ArrayList<Persona> readRecordsFromFile(String file){

        ArrayList<Persona> personas  = new ArrayList<>();


        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String [] pieces = line.split(",");
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                Persona persona = new Persona(name,age);
                personas.add(persona);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return personas;
    }

}
class Persona{
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }
}