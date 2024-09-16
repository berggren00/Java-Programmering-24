package UppgifterPersonlig;

class Book{
 private String title;
 private String author;
 private int age;
 
 public Book(){
    title = "Default title";
    author = "Default author";
    age = 2042;
 }

 public void printDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Age: " +age);
 }

 public static void main(String[] args) {
    Book book = new Book();
    book.printDetails();
 }


}
