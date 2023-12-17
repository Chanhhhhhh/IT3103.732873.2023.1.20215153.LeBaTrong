package hust.soict.dsai.aims.screen;

import hust.soict.dsai.Aims.cart.Cart;
import hust.soict.dsai.Aims.media.Book;
import hust.soict.dsai.Aims.media.DigitalVideoDisc;
import hust.soict.dsai.Aims.media.CompactDisc;
import hust.soict.dsai.Aims.store.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Lovely", "Ballad",
                "George Lucas", 87, 24.95f);
        store.addMedia(cd1);

        Book book1 = new Book("DevUp", "Soft Skill", 10.4f);
        store.addMedia(book1);

        new StoreScreen(store, cart);
    }
}