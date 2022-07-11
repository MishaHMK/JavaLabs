import java.util.Random;

public class Book_Factory {
    public static Book createRandomBook() {
        final String[] titles = {"Harry Potter", "С-Programming", "The art of insult", "5 Steps to Knowledge", "Lord of the Rings", "Shining", "Love to Life"};
        final String[] authors = {"MarkTwain", "TywinLannister", "PeterParker", "J.J.Abrams", "StephenKing", "HowardLovecraft", "J.K.Rowling"};
        final String[] publishes = {"DarkHorse", "ACT", "Manuscript", "HelloWorld", "Fantasy", "Bloomberg"};
        Random x = new Random();
        int id = x.nextInt(1000);
        String title = titles[x.nextInt(7)];
        String author = authors[x.nextInt(7)];
        String publish = publishes[x.nextInt(6)];
        int year = x.nextInt(50) + 1970;
        int pages = x.nextInt((1000)) + 120;
        int price = x.nextInt(100) + 10;
        return new Book(id, year, pages, price, title, author, publish);
    }
}
