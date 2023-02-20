import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIRecipe ui = new UIRecipe(scanner);
        ui.start();
    }
}

class Recipe{
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(int cookingTime){
        this.cookingTime = cookingTime;
    }
}

class UIRecipe{
    private Scanner scanner;
    private String fileName;
    private String command;

    private ArrayList<Recipe> recipes;

    public UIRecipe(Scanner scanner){
        this.scanner = scanner;
        this.command = "";
    }

    public void start(){
        readInput();
        menu();
    }

    private void menu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        while(!(this.command.equals("stop"))){
            System.out.print("Enter command:");
            this.command = this.scanner.nextLine();
            if(this.command.equals("list")){
                readRecipe();
            }
            if(this.command.equals(("find name"))){
                System.out.print("Searched word:");
                String word = this.scanner.nextLine();
                findByName(word);
            }
            if(this.command.equals(("find cooking time"))){
                System.out.print("Searched word:");
                String time = this.scanner.nextLine();
                findByTime(time);
            }

        }
    }

    public void readInput(){
        System.out.print("File to read:");
        this.fileName = this.scanner.nextLine();
    }

    public void readRecipe(){

        try(Scanner scan = new Scanner(Paths.get(this.fileName))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void findByName(String name){
        try(Scanner scan = new Scanner(Paths.get(this.fileName))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                if(row.contains(name)){
                    System.out.println(row);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void findByTime(String time){
        try(Scanner scan = new Scanner(Paths.get(this.fileName))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                String[] times = row.split(": ");
                String time1 = times[0];
                System.out.println(time1);
            }

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
