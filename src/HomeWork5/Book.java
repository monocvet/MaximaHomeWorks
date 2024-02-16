package HomeWork5;

public class Book {
    private String name;
    private Author author;
    private Integer yearOfPublication;

    public Book(String name, Author author, Integer yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "название = " + name +
                ", автор = " + author +
                ", год = " + yearOfPublication;
    }
}
