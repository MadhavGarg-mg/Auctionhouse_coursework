import java.util.*;

/**
 * This class represents reporting of auction houses. It has methods relating to the abstraction of reporting and to
 * return required auction houses or items.
 *
 * @author Madhav Garg
 */
public class Reporting {
    List<AuctionHouse> auctionHouses = new ArrayList<>();

    public Reporting() {

    }

    /**
     * Returns a human-readable version of a Reporting object
     * @return String representation of reporting
     */
    public String toString() {
        return "Reporting{" +
                "auctionHouse=" + auctionHouses +
                '}';
    }

    /**
     * Adds an auction house to reporting
     * @param house represents an auction house
     */
    public void addAuctionHouse(AuctionHouse house){
        auctionHouses.add(house);
    }


    /**
     * Returns the most expensive item sold in all the auction houses
     * @return the most expensive item ever sold
     */
    public Item highestItemPrice() {
        Item itemLargestPrice = null;
        double highestPrice = 0;
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getPrice() > highestPrice) {
                    highestPrice = auctionHouse.items.get(j).getPrice(); // Gets the price of the item to check for other items
                    itemLargestPrice = auctionHouse.items.get(j); // Replaces items as more expensive items are checked
                }
            }
        }
        return itemLargestPrice;
    }

    /**
     * Returns the auction house with the highest average item price for a particular year
     * @param year the year when an item was sold
     * @return auction house with the highest average item price for the given year
     */
    public AuctionHouse highestAveragePriceYear(int year) {
        double highestAveragePrice = 0;
        AuctionHouse nameHighestAverage = null;
        for (AuctionHouse auctionHouse : auctionHouses) {
            double totalPrice = 0;
            int totalItemsInYear = 0;
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getYear() == year) {
                    totalPrice += auctionHouse.items.get(j).getPrice(); // calculates the total price of items sold
                    totalItemsInYear += 1;
                }
            }
            double averagePrice = totalPrice / totalItemsInYear;
            if (averagePrice > highestAveragePrice) {
                highestAveragePrice = averagePrice;
                nameHighestAverage = auctionHouse;
            }
        }
        return nameHighestAverage;
    }


    /**
     * Returns the list of all items sold with the price more than the amount
     * @param amount represents the amount for which we will be checking the item on
     * @return List of items which were sold for more than the given amount
     */
    public List<Item> listGreaterThanAmount(double amount) {
        List<Item> itemGreater = new ArrayList<>();
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getPrice() > amount &&
                        !itemGreater.contains(auctionHouse.items.get(j))) {
                    itemGreater.add(auctionHouse.items.get(j));
                } // The condition eliminates the same items sold in different auction houses for all the same information be added to the list
            }
        }
        return itemGreater;
    }
}
