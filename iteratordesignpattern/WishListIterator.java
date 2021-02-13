package iteratordesignpattern;

import java.util.Iterator;

/**
 * class iterates through an array of items when there is more in the array
 * @author Rachael
 */
public class WishListIterator implements Iterator {
    private Item[] items; //items array of Item to iterate through
    private int position = 0; //int array position starts at 0

    /**
     * constructor method sets array in the class equal to paramater array
     * @param items array of items to be used in the class
     */
    public WishListIterator(Item[] items) {
        this.items = items;
    }

    /**
     * determines if the array has an item at the next position
     * @return boolean true or false if it has an item
     */
    public boolean hasNext() {
        return items[position] != null && position < items.length;
    }

    /**
     * moves to the next item in the array
     * @return returns the next item in the array
     */
    public Item next() {
        Item item = items[position];
        position ++;
        return item;
    }
}
