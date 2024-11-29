package org.example.models;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> groceryList = new ArrayList<>();

    public void startGrocery(){
    int choice;
    do{
        System.out.println("Yapılmak istenen işlemi seçin.");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String itemsToAdd = scanner.nextLine();
                addItems(itemsToAdd);
                printSorted();
                break;
            case 2:
                System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                String itemsToRemove = scanner.nextLine();
                removeItems(itemsToRemove);
                printSorted();
                break;

        }
    }while (choice !=0);
    scanner.close();
    }

    public static void removeItems(String itemsToRemove) {
        String[] splitItems = itemsToRemove.split(",");
        for(String item: splitItems){
            item=item.trim();
            if(!checkItemInList(item)){
                System.out.println("Girilen item Listede yok!");
            }else{
                groceryList.remove(item);
            }
        }
        sortItems();
    }

    public static void addItems(String itemsToAdd) {
    String[] splitItems = itemsToAdd.split(",");
    for(String item: splitItems){
        item = item.trim();
        if(checkItemInList(item)){
            System.out.println("Listede Mevuct!");
        }else{
            groceryList.add(item);
        }
    }
    sortItems();
    }

    public static boolean checkItemInList(String item) {
        return groceryList.contains(item);
    }
    public static void printSorted(){
        sortItems();
        System.out.println("Listem: ");
        for (String item: groceryList){
            System.out.println(item);
        }
    }

    public static void sortItems() {
        Collections.sort(groceryList);
    }



}
