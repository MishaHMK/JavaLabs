package Classes;
import java.util.Random;

public class SweetFactory {
    public static Sweet createRandomSweet() {
        String[] names = new String[]{"ToxicWastes", "Rafaello", "Crabs", "Bounty", "Snickers", "Twix", "LoveIs", "MilkyWay", "Skittles", "M&Ms",
                                      "Haribo", "Toffie", "Boost", "Crunch", "Chomp","Kinder", "Greengy", "Marshmallow", "Yogurtini", "Timmi" };
        Random x = new Random();
        String n = names[x.nextInt(20)];
        int w = x.nextInt(20) + 3;
        int s = x.nextInt((30)) + 5;

        return new Sweet(n, w, s);
    }
}