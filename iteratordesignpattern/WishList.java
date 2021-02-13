package iteratordesignpattern;

public class WishList {
    private String name;
    private Item[] items;
    private int count = 0;

    public WishList(String name) {
        this.name = name; 
        items = new Item[5];
    }

    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if(count >= 5) {
            System.out.println("Can't add to menu");
        } else {
            items[count] = item;
            count ++;
        }
    }

    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    public double getTotalCost() {
        double price = 0;
        for(int i = 0; i < items.length; i++) {
            price += items[i].getPrice();
        }
        return price;
    }

    private Item[] growArray(Item[] items) {
        Item[] temp = new Item[2*items.length];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = items[i];
        }
        return temp;
    }
    
}
