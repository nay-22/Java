package MASTERCLASS.Section_9.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static GroceryList list = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit) {
            System.out.println("Enter your choice:");
            choice = in.nextInt();
            in.nextLine();

            switch(choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    list.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(list.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(list.getGroceryList());




    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Enter the grocery item: ");
        list.addGroceryItem(in.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter current item name: ");
        String itemNo = in.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = in.nextLine();
        list.modifyGroceryItem(itemNo, newItem);
    }
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = in.nextLine();
        list.removeGroceryItem(itemNo);
    }
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = in.nextLine();
        if(list.findItem(searchItem) >= 0) {
            System.out.println("Found "+searchItem+" in the grocery list");
        } else {
            System.out.println("Item not found");
        }
    }

}
