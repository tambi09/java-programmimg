package day50_inheritance;

public class Ebook  extends Book{

    int size;
    int pages;

    public void readBook(){
        System.out.println("Reading Book");
        System.out.println("Title = " + title);
        System.out.println("");
    }
}
