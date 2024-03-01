package comparable;

import java.util.*;

class Item {
    int price;
    String name;
    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Item [price: " + this.price + ", name: " + this.name + "]";
    }
}
public class Using_Lambda {
    public static void main(String[] args) {
        Comparator<Item> com = (i1, i2) -> i1.price>i2.price?1:-1;
        // NO RETURN STATEMENT AND NO NEED TO SPECIFY CLASS LIKE ITEM
        // Comparator<Item> com = (Item i1, Item i2) -> i1.price>i2.price?1:-1;

        List<Item> items = new ArrayList<Item>();
        items.add(new Item(2000, "PUMA Tshirt"));
        items.add(new Item(5500, "Denim Jacket"));
        items.add(new Item(5000, "John Jacobs Specs"));
        items.add(new Item(5500, "RedTape Sneakers"));
        items.add(new Item(13500, "Samsung M32"));

        for(Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println();

        Collections.sort(items, com);
        for(Item item : items) {
            System.out.println(item.toString());
        }
    }
}
