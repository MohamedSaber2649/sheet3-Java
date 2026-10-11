package question2;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Ahmed", "ahmed@gmail.com");
        Author a2 = new Author("Mona", "mona@gmail.com");

        Author[] authors = {a1, a2};

        Book b1 = new Book(10, "Java Basics", authors, "Cairo Publisher", 250);

        System.out.println(b1);
    }
}
