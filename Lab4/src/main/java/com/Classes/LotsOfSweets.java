package com.Classes;
import java.util.ArrayList;
import java.util.List;
import static com.Classes.SweetFactory.createRandomSweet;


public class LotsOfSweets {
    public static List<Sweet> createSweetArr() {
        List<Sweet> Arr = new ArrayList();
        for (int i = 0; i < 50; ++i) {
            System.out.println("\nSetting sweet №" + (i + 1));
            Arr.add(createRandomSweet());
            System.out.println(Arr.get(Arr.size()-1));
        }
        return Arr;
    }
}
