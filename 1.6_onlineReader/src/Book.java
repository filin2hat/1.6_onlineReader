public class Book {
    public String nameBook;
    public Author author;
    public int yearBook;
    public int numberOfPages;

    public Book(Author author, String nameBook, int yearBook, int numberOfPages) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.numberOfPages = numberOfPages;
    }

    public String timeToRead() {
        int timeHours = numberOfPages / 35;
        int timeWeek = numberOfPages / 200;
        return "Для прочтения книги " + "[" + nameBook + "]" + " Вам примерно потребуется " +
                timeHours + " часов, или " + timeWeek + " недель.\n";
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + "\n" +
                "Автор книги: " + author + "\n" +
                "Год написание книги: " + yearBook + "\n" +
                "Количество страниц: " + numberOfPages;
    }
}
