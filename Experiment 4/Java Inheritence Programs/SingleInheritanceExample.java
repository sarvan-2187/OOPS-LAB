import java.util.Scanner;

class Book {
    String title;

    void getTitle(Scanner sc) {
        System.out.print("Enter book title: ");
        title = sc.nextLine();
    }

    void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}

class Novel extends Book {
    String author;

    void getAuthor(Scanner sc) {
        System.out.print("Enter author name: ");
        author = sc.nextLine();
    }

    void displayAuthor() {
        System.out.println("Author: " + author);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Novel novel = new Novel();
        novel.getTitle(sc);
        novel.getAuthor(sc);
        novel.displayTitle();
        novel.displayAuthor();

        sc.close();
    }
}
