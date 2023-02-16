import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId){

        int foundId;

        for(int i = 0 ; i < books.size(); i++){
            if(books.get(i).getId() == searchedId){
                return i;
            }
        }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId){

        int startIndex = 0;
        int endIndex = books.size() - 1;

        for(int i = startIndex ; i < books.size() ; i++){
            int middle = (startIndex+endIndex)/2;

            if(searchedId == books.get(middle).getId()){
                return books.get(middle).getId();
            }else if(searchedId > books.get(middle).getId()){
                startIndex = middle+1;
            }else if(searchedId < books.get(middle).getId()){
                endIndex = middle-1;
            }
        }

        return -1;

    }
}

class Book{
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }
}