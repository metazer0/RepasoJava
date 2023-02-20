import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Grades grades;

    public UI(Scanner scanner, Grades grades){
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start(){
        readInput();
        printAverage();
    }

    private void readInput() {
        System.out.println("Enter points totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            if(input >= 0 && input <= 100){
                grades.addPoints(input);
            }
        }
    }

    public void printAverage(){
        System.out.print("Point average (all):"+this.grades.getAverage());
        System.out.println("");
        System.out.print("Points average(passing):"+this.grades.getAveragePassing());
        System.out.println("");
        System.out.println("Pass percentage: "+this.grades.getPassPercentage()+"%");
    }
}
