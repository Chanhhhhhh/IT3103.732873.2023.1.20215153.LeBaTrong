package hust.soict.dsai.Aims.store;

import  hust.soict.dsai.Aims.disc.DigitalVideoDisc;
import java.util.Objects;

public class Store {
    public static final int MAX_NUMBERS_VIDEOS = 20;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_VIDEOS];
    int quantity = 0;
    public void addDVD(DigitalVideoDisc disc) {
        if(quantity == MAX_NUMBERS_VIDEOS) System.out.println("The store is almost full");
        else {
            itemsInStore[quantity] = disc;
            quantity++;
            System.out.println("The dvd has been added");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(quantity == 0) System.out.println("The store is already empty");
        else {
            DigitalVideoDisc[] arr_new = new DigitalVideoDisc[MAX_NUMBERS_VIDEOS];
            for(int i=0, k=0;i<quantity;i++){
                if(!Objects.equals(itemsInStore[i].getTitle(), disc.getTitle())){
                    arr_new[k]=itemsInStore[i];
                    k++;
                }
            }
            quantity--;
            itemsInStore = arr_new;
            System.out.println("The dvd has been removed");
        }
    }

    public float totalCost() {
        float sum = 0;
        for(int i = 0; i<quantity; i++) {
            sum += itemsInStore[i].getCost();
        }
        return sum;
    }
}
