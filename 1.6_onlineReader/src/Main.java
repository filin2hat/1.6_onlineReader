public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Агата Кристи");
        Author authorTwo = new Author("Лю Цысинь");
        Author authorThree = new Author("Кэти Сьерра");

        Book bookOne = new Book(authorOne, "Десять негритят", 1939, 269);
        Book bookTwo = new Book(authorOne, "Загадочное происшествие в Стайлзе", 1920, 103);
        Book bookThree = new Book(authorOne, "Третья девушка", 1966, 201);
        Book bookFour = new Book(authorTwo, "Задача трех тел", 2008, 299);
        Book bookFive = new Book(authorThree, "Изучаем Java", 2012, 714);

        User userOne = new User("Petya", "Petrov", "pochta1@mail.ru");
        User userTwo = new User("Olya", "Smornova", "pochta2@mail.ru");
        User userThree = new User("Yura", "Penkov", "uzi_pizi@shmizi.con");

        System.out.println(bookFive + "\n" + bookFive.timeToRead());
        System.out.println(bookFour + "\n" + bookFour.timeToRead());
        userCounter(User.totalOnline);
    }

    public static void userCounter(int userOnline) {
        System.out.println("Позователей on-line: " + userOnline);
    }
}