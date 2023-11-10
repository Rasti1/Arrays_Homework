package app;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] products = {"Shampoo", "Apples", "Meat",
        "Cheese", "Meat"};
        System.out.println("Names of all products: ");
        for (int i = 0; i < 5; i++){
            System.out.println((i + 1) + ". " + products[i]);
        }
        System.out.print("\nType product's name for searching: ");
        String searchItem = sc.nextLine();
        boolean found = false;
        for (String product : products) {
            if (searchItem.equalsIgnoreCase(product)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Product in list.");
        } else {
            System.out.println("Product not in list.");
        }
    }
}
