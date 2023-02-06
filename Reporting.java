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
}
