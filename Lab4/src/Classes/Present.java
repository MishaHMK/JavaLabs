package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Present {
    private final List<Sweet> P = new ArrayList();

    public Present() {
        this.createPresent();
    }

    public Present(int a) {
        this.createPresent2(a);
    }
    public List<Sweet> getArr() {
        return this.P;
    }

    private void createPresent() {
        List<Sweet> M = LotsOfSweets.createSweetArr();
        fillPresent(M);
    }

    private void createPresent2(int a) {
        List<Sweet> M = LotsOfSweets.createSweetArr();
        fillPresent2(M, a);
    }

    public void fillPresent(List<Sweet> arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nSet how much sweets to set into our present: ");
        int size = scan.nextInt();
        size -= 1;
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            P.add(arr.get(r.nextInt(arr.size() - 1)));
        }
    }

    public void fillPresent2(List<Sweet> arr, int a) {
        int size = 0;
        size = a-1;
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            P.add(arr.get(r.nextInt(arr.size() - 1)));
        }
    }

    public void showInfo() {
        for (int i = 0; i < this.getArr().size(); i++) {
            System.out.println(this.getArr().get(i));
        }
    }

   public int estimateWeight() {
        int current_w = 0;
        for (int i = 0; i < this.getArr().size(); i++) {
            current_w += this.getArr().get(i).getWeight();
        }
        return current_w;
    }

    public void PresentInfo() {
        System.out.println("\n\nOur present:");
        this.showInfo();
        System.out.printf("\n\nOur present total weight is %d\n", this.estimateWeight());
    }
}