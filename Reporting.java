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
            for(int j = 0; j < auctionHouses[i].items.size(); j++){
                if (auctionHouses[i].items.get(j).getPrice() > highestPrice){
                    highestPrice = auctionHouses[i].items.get(j).getPrice();
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
            for(int j = 0; j < auctionHouses[i].items.size(); j++){
                if (auctionHouses[i].items.get(j).getYear() == year){
                        averagePrice += auctionHouses[i].items.get(j).getPrice();
                        totalItemsInYear += 1;
                }
                }
            averagePrice = averagePrice / totalItemsInYear;
            if (averagePrice > highestAveragePrice){
                highestAveragePrice = averagePrice;
                nameHighestAverage = auctionHouses[i].getName();
            }
        }
        return nameHighestAverage;
    }

    ArrayList<Integer> itemGreater = new ArrayList<>();
    public ArrayList<Integer> listGreaterThanAmount(double amount) {
        for (int i = 0; i < auctionHouses.length; i++) {
            for(int j = 0; j < auctionHouses[i].items.size(); j++){
                if (auctionHouses[i].items.get(j).getPrice() > amount){
                    itemGreater.add(auctionHouses[i].items.get(j).getItemLot());
                }
            }
        }
        return itemGreater;
    }
}
