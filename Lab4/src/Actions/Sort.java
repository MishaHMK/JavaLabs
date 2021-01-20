package Actions;
import java.util.Comparator;
import java.util.Scanner;
import Classes.Present;
import Classes.Sweet;


public class Sort {

    public void toSort(Present obj) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n 1 - Sort by weight     2 - Sort by sugar % ");
        String enter = in.next();

        if (enter.equals("1")) {
            obj.getArr().sort(Comparator.comparingInt(Sweet::getWeight));
        }
        if (enter.equals("2")) {
            obj.getArr().sort(Comparator.comparingInt(Sweet::getSugar));
        }
    }
}
