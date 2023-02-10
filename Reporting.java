import java.util.*;

public class Reporting {
    List<AuctionHouse> auctionHouses = new ArrayList<>();

    public Reporting() {

    }

    public String toString() {
        return "Reporting{" +
                "auctionHouse=" + auctionHouses +
                '}';
    }

    public void addAuctionHouse(AuctionHouse house){
        auctionHouses.add(house);
    }


    Item largestPrice;
    double highestPrice;
    public Item highestItemPrice() {
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getPrice() > highestPrice) {
                    highestPrice = auctionHouse.items.get(j).getPrice();
                    largestPrice = auctionHouse.items.get(j);
                }
            }
        }
        return largestPrice;
    }

    double highestAveragePrice;
    AuctionHouse nameHighestAverage;

    public AuctionHouse highestAveragePriceYear(int year) {
        for (AuctionHouse auctionHouse : auctionHouses) {
            double averagePrice = 0;
            int totalItemsInYear = 0;
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getYear() == year) {
                    averagePrice += auctionHouse.items.get(j).getPrice();
                    totalItemsInYear += 1;
                }
            }
            averagePrice = averagePrice / totalItemsInYear;
            if (averagePrice > highestAveragePrice) {
                highestAveragePrice = averagePrice;
                nameHighestAverage = auctionHouse;
            }
        }
        if(highestAveragePrice != 0){
        return nameHighestAverage;}
        else return null;
    }

    ArrayList<Item> itemGreater = new ArrayList<>();
    public ArrayList<Item> listGreaterThanAmount(double amount) {
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (int j = 0; j < auctionHouse.items.size(); j++) {
                if (auctionHouse.items.get(j).getPrice() > amount &&
                        !itemGreater.contains(auctionHouse.items.get(j))) {
                    itemGreater.add(auctionHouse.items.get(j));
                }
            }
        }
        return itemGreater;
    }
}
