package iteratordesignpattern;

/**
 * Class Item sets the title, description, and price of an item and also can getPrice, has a toString method and prints
 * @author Rachael
 */
public class Item {
    private String title; //String title of the item
    private String description; //String description of the item
    private double price; //String price of the item

    /**
     * Constructor method to set all values from params
     * @param title title of the item
     * @param description description of the item
     * @param price price of the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Method returns a string representation of the item
     * @return a string with the title, description, and price
     */
    public String toString() {
        return "\n***** " + title + " *****\n" + description + "\nPrice: " + price +"";
    }

    /**
     * method that returns the price of the item
     * @return double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * method prints the tostring method
     */
    public void print() {
        System.out.println(toString());
    }
    
}