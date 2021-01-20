import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size, inp;
        String input;
        ArrayList<Book> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();
        System.out.printf("Enter size of array: ");
        size = scan.nextInt();
        arr.ensureCapacity(size);
        logic.fillArr(arr, size);
        System.out.printf("Full list of our books: ");
        System.out.println(arr);


        System.out.printf("\n\nPut the author name, whom books you want to find: ");
        input = scan.next();
        logic.findbyAuthor(arr, size, input);

        System.out.printf("\n\nPut the publish whom books you want to find: ");
        input = scan.next();
        logic.findbyPublish(arr, size, input);

        System.out.printf("\n\nPut the min release year of books what you find: ");
        inp = scan.nextInt();
        logic.findfromYear(arr, size, inp);

    }
}
