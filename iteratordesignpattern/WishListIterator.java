package iteratordesignpattern;

import java.util.Iterator;

public class WishListIterator implements Iterator {
    private Item[] items;
    private int position = 0;

    public WishListIterator(Item[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return items[position] != null && position < items.length;
    }

    public Item next() {
        Item item = items[position];
        position = position + 1;
        return item;
    }
}
