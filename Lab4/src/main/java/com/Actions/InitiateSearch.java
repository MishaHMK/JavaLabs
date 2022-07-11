package com.Actions;

import com.Classes.Present;

import java.util.Scanner;

public class InitiateSearch implements Command{
    private final Present present;
    int begin;
    int end;

    public InitiateSearch(Present present) {
        this.present = present;
    }

    @Override public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nSet sugar % range for sweets in present to look for: ");
        begin = scan.nextInt();
        end = scan.nextInt();
        Search search = new Search();
        System.out.println("\nSweets which suit our sugar % range ( " + begin + "-" + end + " )");
        search.toSearch(present, begin, end);
    }
}
