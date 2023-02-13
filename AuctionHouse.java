import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an auction house. It has methods relating to the abstraction of an auction house and
 * methods to get required items.
 *
 * @author Madhav Garg
 */
public class AuctionHouse {
    private String name;
    List<Item> items = new ArrayList<>();

    /**
     * This constructor sets up all the internal fields of an AuctionHouse object.
     * @param name represents the name of an auction house.
     */
    public AuctionHouse(String name) {
        this.name = name;
    }

    /**
     * Returns a human-readable version of an AuctionHouse object
     * @return String representation of the auction house
     */
    public String toString() {
        return "AuctionHouse{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    /**
     * Sets the name of an auction house to the desired name
     * @param name represents the name of the auction house
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns the name of the auction house
     * @return name of the auction house
     */
    public String getName(){
        return name;
    }

    /**
     * Adds an item to the auction house
     * @param item represents an item sold in that auction house
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Returns the most expensive item sold in the auction house
     * @return the most expensive item
     */
    public Item mostExpensiveItem() {
        Item item = null;
        double itemPrice = 0;
        for (Item value : items) {
            if (value.getPrice() > itemPrice) {
                item = value; // replaces item if new item is more expensive
                itemPrice = value.getPrice(); // stores new price to check other items with the new price
            }
        }
        return item;
    }


    /**
     * Returns the average item price for a given auction house for a particular year
     * @param year represents the year on which items were sold
     * @return the average item price
     */
    public double averageItemYear(int year) {
        double totalPrice = 0;
        int numItems = 0;
        for (Item value : items) {
            if (value.getYear() == year) {
                totalPrice += value.getPrice(); // Adds the price all of items
                numItems += 1;
            }
        }
        if (numItems != 0){
        return totalPrice / numItems;}

        else return 0;
    }


    /**
     * Returns the list of items sold for more than a given amount
     * @param amount represents the amount beyond which you require the list of items for
     * @return a list of items
     */
    public ArrayList<Item> listMoreAmount(int amount) {
        ArrayList<Item> itemList = new ArrayList<>();
        for (Item value : items) {
            if (value.getPrice() > amount) {
                itemList.add(value); // Putting items in a list if their amount is more than the given amount
            }
        }
        return itemList;
    }
}
