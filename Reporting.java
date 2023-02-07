import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    double highestPrice;
    public double highestItemPrice() {
        for (int i = 0; i < auctionHouses.size(); i++) {
            for(int j = 0; j < auctionHouses.get(i).items.size(); j++){
                if (auctionHouses.get(i).items.get(j).getPrice() > highestPrice){
                    highestPrice = auctionHouses.get(i).items.get(j).getPrice();
                }
            }
        }
        return highestPrice;
    }

    double highestAveragePrice;
    String nameHighestAverage;

    public String highestAveragePriceYear(int year) {
        for (int i = 0; i < auctionHouses.size(); i++) {
            double averagePrice = 0;
            int totalItemsInYear = 0;
            for(int j = 0; j < auctionHouses.get(i).items.size(); j++){
                if (auctionHouses.get(i).items.get(j).getYear() == year){
                        averagePrice += auctionHouses.get(i).items.get(j).getPrice();
                        totalItemsInYear += 1;
                }
                }
            averagePrice = averagePrice / totalItemsInYear;
            if (averagePrice > highestAveragePrice){
                highestAveragePrice = averagePrice;
                nameHighestAverage = auctionHouses.get(i).getName();
            }
        }
        return nameHighestAverage;
    }

    ArrayList<Integer> itemGreater = new ArrayList<>();
    public ArrayList<Integer> listGreaterThanAmount(double amount) {
        for (int i = 0; i < auctionHouses.size(); i++) {
            for(int j = 0; j < auctionHouses.get(i).items.size(); j++){
                if (auctionHouses.get(i).items.get(j).getPrice() > amount){
                    itemGreater.add(auctionHouses.get(i).items.get(j).getItemLot());
                }
            }
        }
        return itemGreater;
    }
}
