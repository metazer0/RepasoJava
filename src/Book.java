public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(){

    }
    public Book(String title, int pages, int year){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublicationYear(int year){
        this.publicationYear = year;
    }

    public void setNumberOfPages(int pages){
        this.numberOfPages = pages;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title+", "+this.numberOfPages+", "+this.publicationYear;
    }

}
