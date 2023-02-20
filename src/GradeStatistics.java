import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Grades grades = new Grades();

        UI userInterface = new UI(scanner,grades);

        userInterface.start();
    }
}

class Grades{
    private ArrayList<Integer> points;

    private ArrayList<Integer> passed;

    private char grades [][];


    private double average;

    public Grades(){
        this.passed = new ArrayList<>();
        this.points = new ArrayList<>();
        this.average = 0.0;
        this.grades = new char[5][10];
    }

    public void addPoints(int point){
        this.points.add(point);
    }

    public double getAverage(){
        int sum = 0;
        for (Integer point : this.points) {
            sum += point;
        }
        this.average += sum/this.points.size();
        return this.average;
    }

    public double getPassPercentage(){
        double percent = 100*this.passed.size()/this.points.size();
        return percent;
    }


    public double getAveragePassing(){
        this.average = 0.0;
        int sum = 0;
        int count = 0;
        for (Integer point : this.points) {
            if(point >= 50){
                sum += point;
                this.passed.add(point);
                count++;
            }
        }
        this.average += sum/count;
        return this.average;
    }

    public int GradeDistribution(int point){

            int grade = 0;


            if(point < 50){
               grade = 0;
            }
            else if(point < 60){
                grade = 1;
            }
            else if(point < 70){
                grade = 2;
            }
            else if(point < 80){
                grade = 3;
            }
            else if(point < 90){
                grade = 4;
            }
            else if(point >= 90){
                grade = 5;
            }

            return grade;

    }

    public void printGradeDistribution(){

    }

}