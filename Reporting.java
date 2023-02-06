import java.util.ArrayList;
import java.util.Arrays;

public class Reporting {
    public AuctionHouse[] auctionHouses;

    public Reporting(AuctionHouse[] auctionHouses) {
        this.auctionHouses = auctionHouses;
    }
    public String stringReporting(){
        return String.format("""
                Auction houses:\t%s
                """, Arrays.toString(auctionHouses));
    }
    double highestPrice;
    public double highestItemPrice() {
        for (int i = 0; i < auctionHouses.length; i++) {
            for(int j = 0; j < auctionHouses[i].items.length; j++){
                if (auctionHouses[i].items[j].price > highestPrice){
                    highestPrice = auctionHouses[i].items[j].price;
                }
            }
        }
        return highestPrice;
    }

    double highestAveragePrice;
    String nameHighestAverage;

    public String highestAveragePriceYear(int year) {
        for (int i = 0; i < auctionHouses.length; i++) {
            double averagePrice = 0;
            int totalItemsInYear = 0;
            for(int j = 0; j < auctionHouses[i].items.length; j++){
                if (auctionHouses[i].items[j].year == year){
                        averagePrice += auctionHouses[i].items[j].price;
                        totalItemsInYear += 1;
                }
                }
            averagePrice = averagePrice / totalItemsInYear;
            if (averagePrice > highestAveragePrice){
                highestAveragePrice = averagePrice;
                nameHighestAverage = auctionHouses[i].name;
            }
        }
        return nameHighestAverage;
    }

    ArrayList<Integer> itemGreater = new ArrayList<>();
    public ArrayList<Integer> listGreaterThanAmount(double amount) {
        for (int i = 0; i < auctionHouses.length; i++) {
            for(int j = 0; j < auctionHouses[i].items.length; j++){
                if (auctionHouses[i].items[j].price > amount){
                    itemGreater.add(auctionHouses[i].items[j].itemLot);
                }
            }
        }
        return itemGreater;
    }
}
