package com.Actions;
import com.Classes.Present;
import com.Logging.Log;


import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private Log log;
    {
        try{
            log = new Log("logger.txt");
        }catch (IOException a){
            a.printStackTrace();
        }
    }

    public void presentOperation() {
        log.getLogger().info("Put the address of the file");
        Present obj = new Present();
        Command Info = new PresentInfo(obj);
        Command Sort   = new InitiateSort(obj);
        Command Find  = new InitiateSearch(obj);
        Commands start = new Commands(Info,Find,Sort);
        Scanner enter = new Scanner(System.in);
        int choice;
        System.out.println("\nOur present is completed! Let's do something with it");
        System.out.println("\nPress: \n1 - Watch present info \n2 - Search sweets with parameters " +
                "\n3 - Sort present \n4 - Exit");
        do {
            log.getLogger().info("run 'PrintMenuInfo' function");
            choice = enter.nextInt();
            switch (choice) {
                case 1 -> {
                    log.getLogger().info("run 'PresentInfo' function");
                    start.PresentInfo();
                }
                case 2  -> {
                    log.getLogger().info("run 'Search' function");
                    start.Search();
                }
                case 3 -> {
                    log.getLogger().info("run 'Sort' function");
                    start.Sort();
                }
                case 4 -> {
                    log.getLogger().info("exit program");
                    System.exit(0);
                }
                default -> {
                    log.getLogger().info("invalid request in menu");
                    System.out.println("invalid request");
                    System.exit(1);
                }
            }
        }while(true);
    }

    public void toBegin() {
        presentOperation();
    }
}