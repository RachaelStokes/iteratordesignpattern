package iteratordesignpattern;
/**
 * Method creates a wishlist array of items and adds new items to the array 
 * @author Rachael
 */
public class WishList {
    private String name; //string name of the wishlist
    private Item[] items; //array of Item called items
    private int count = 0; //int count of items in the array

    /**
     * constructor sets the name of the wishlist and creates array items with a size of 5
     * @param name string name of wish list
     */
    public WishList(String name) {
        this.name = name; 
        items = new Item[5];
    }

    /**
     * method add item only adds an item if there is space in the array
     * @param title string title of the new item being added
     * @param description string description of the new item being added
     * @param price double price of the new item being added
     */
    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if(count >= 5) {
            System.out.println("Can't add to menu");
        } else {
            items[count] = item;
            count ++;
        }
    }

    /**
     * creates a new iterator for wishlist
     * @return new wishlistIterator for items array
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * method that returns the total cost of all the items after they are added up
     * @return the total cost of all items
     */
    public double getTotalCost() {
        double price = 0;
        for(int i = 0; i < items.length; i++) {
            price += items[i].getPrice();
        }
        return price;
    }

    /**
     * private method grows the array to twice its size
     * @param items the items going into the grown array
     * @return returns the new bigger array with all of the items
     */
    private Item[] growArray(Item[] items) {
        Item[] temp = new Item[2*items.length];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
    
}
