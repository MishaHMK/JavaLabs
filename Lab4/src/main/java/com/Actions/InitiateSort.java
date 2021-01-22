package com.Actions;

import com.Classes.Present;

public class InitiateSort implements Command{

    private final Present present;
    public InitiateSort(Present present) {
        this.present = present;
    }

    @Override public void execute() {
        System.out.println("\n\nLet's sort sweets in our present! \n");
        Sort sort = new Sort();
        sort.toSort(present);
        System.out.println("\n\nSorted present:");
        present.showInfo();
    }
}
