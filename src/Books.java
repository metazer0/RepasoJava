//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Books {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Book> books = new ArrayList<>();
//
//        while(true){
//
//            System.out.println("Title: ");
//            String title = scanner.nextLine();
//            if(title.equals("")){
//                break;
//            }
//            Book newBook = new Book();
//            newBook.setTitle(title);
//            System.out.println("Pages:");
//            int pages = Integer.valueOf(scanner.nextLine());
//            newBook.setNumberOfPages(pages);
//            System.out.println("Publication year:");
//            int year = Integer.valueOf(scanner.nextLine());
//            newBook.setPublicationYear(year);
//            books.add(newBook);
//        }
//
//        System.out.println("What information will be printed?");
//        String res = scanner.nextLine();
//        if(res.equals("everything")){
//            for (Book book : books) {
//                System.out.println(book.toString());
//            }
//        }else{
//            for (Book book : books) {
//                System.out.println(book.getTitle());
//            }
//        }
//
//
//    }
//}
