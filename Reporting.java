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
        for (int i = 0; i < auctionHouses.size(); i++) {
            for(int j = 0; j < auctionHouses.get(i).items.size(); j++){
                if (auctionHouses.get(i).items.get(j).getPrice() > highestPrice){
                    highestPrice = auctionHouses.get(i).items.get(j).getPrice();
                    largestPrice = auctionHouses.get(i).items.get(j);
                }
            }
        }
        return largestPrice;
    }

    double highestAveragePrice;
    AuctionHouse nameHighestAverage;

    public AuctionHouse highestAveragePriceYear(int year) {
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
                nameHighestAverage = auctionHouses.get(i);
            }
        }
        if(highestAveragePrice != 0){
        return nameHighestAverage;}
        else return null;
    }

    ArrayList<Integer> itemGreater = new ArrayList<>();
    public ArrayList<Integer> listGreaterThanAmount(double amount) {
        for (int i = 0; i < auctionHouses.size(); i++) {
            for(int j = 0; j < auctionHouses.get(i).items.size(); j++){
                if (auctionHouses.get(i).items.get(j).getPrice() > amount &&
                        !itemGreater.contains(auctionHouses.get(i).items.get(j).getItemLot())){
                    itemGreater.add(auctionHouses.get(i).items.get(j).getItemLot());
                }
            }
        }
        return itemGreater;
    }
}
