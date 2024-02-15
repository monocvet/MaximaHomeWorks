package HomeWork5;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дэвид", "Томас");
        Author author2 = new Author("Роберт", "Мартин");

        Book book1 = new Book("Программист-прагматик", author1, 2020);
        Book book2 = new Book("Чистый код", author2, 2021);

        System.out.println(book1);
        System.out.println(book2);
        book1.setYearOfPublication(2036);

        System.out.println("До внесения изменений: " + book1);
        Book book3 = passByObject(book1);
        System.out.println("После внесения изменений: " + book3);

        int value = 20;
        System.out.println("До внесения изменений: " + value);

        passByValue(value);
        System.out.println("После внесения изменений: " + value);


    }

    static int passByValue(int value) {
        value = 30;
        System.out.println("Внутри метода: " + value);
        return value;
    }

    static Book passByObject(Book book) {
        book.setYearOfPublication(1990);
        System.out.println("Внутри метода: " + book);
        return book;
    }
}
