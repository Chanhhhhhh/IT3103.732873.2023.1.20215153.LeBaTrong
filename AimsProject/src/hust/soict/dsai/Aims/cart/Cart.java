package hust.soict.dsai.Aims.cart;

import hust.soict.dsai.Aims.disc.DigitalVideoDisc;
import java.util.Objects;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    int qutyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qutyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full");
        else {
            itemsOrdered[qutyOrdered] = disc;
            qutyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc disc : dvdList) {
            if(qutyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full");
            else {
                itemsOrdered[qutyOrdered] = disc;
                qutyOrdered++;
                System.out.println("The disc has been added");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        if(qutyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full to add dvd1");
        else {
            itemsOrdered[qutyOrdered] = dvd1;
            qutyOrdered++;
            System.out.println("The dvd1 has been added");
        }
        if(qutyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full to add dvd2");
        else {
            itemsOrdered[qutyOrdered] = dvd2;
            qutyOrdered++;
            System.out.println("The dvd2 has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qutyOrdered == 0) System.out.println("The cart is already empty");
        else {
            DigitalVideoDisc[] arr_new = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            for(int i=0, k=0;i<qutyOrdered;i++){
                if(!Objects.equals(itemsOrdered[i].getTitle(), disc.getTitle())){
                    arr_new[k]=itemsOrdered[i];
                    k++;
                }
            }
            qutyOrdered--;
            itemsOrdered = arr_new;
            System.out.println("The disc has been removed");
        }
    }

    public float totalCost() {
        float sum = 0;
        for(int i = 0; i<qutyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=0;i<qutyOrdered;i++){
            System.out.println("" + (i+1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + this.totalCost() + "$");
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        for(int i=0;i<qutyOrdered;i++){
            if(itemsOrdered[i].getId() == id) {
                System.out.println("Result for id: " + id);
                System.out.println(itemsOrdered[i].toString());
                System.out.println();
                return;
            }
        }
        System.out.println("No match is found!");
    }
    public void searchByTitle(String title) {
        for(int i=0;i<qutyOrdered;i++){
            if(itemsOrdered[i].getTitle() == title) {
                System.out.println("Result for title: " + title);
                System.out.println(itemsOrdered[i].toString());
                System.out.println();
                return;
            }
        }
        System.out.println("No match is found!");
    }
}