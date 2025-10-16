package OOP;

public class Book {
    private String name;
    private Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorNames() {
        StringBuilder strResult = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            strResult.append(authors[i].getName());
            if (i < authors.length - 1)
                strResult.append(", ");
        }
        return strResult.toString();
    }
}
