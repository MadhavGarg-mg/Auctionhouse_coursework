import java.util.ArrayList;
import java.util.Arrays;

public class AuctionHouse {
    public String name;
    public Item[] items;

    public AuctionHouse(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String stringAuctionHouse(){
        return String.format("""
                Auction house name:\t%s
                Items sold:\t%s
                """, getName(), Arrays.toString(items));
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    int item = 0;
    double itemPrice = 0;
    public int mostExpensiveItem() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].price > itemPrice){
                item = items[i].itemLot;
                itemPrice = items[i].price;
            }
        }
        return item;
    }

    double averagePrice = 0;
    int numItems = 0;
    public double averageItemYear(int year) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].year == year){
                averagePrice += items[i].price;
                numItems += 1;
            }
        }
        return averagePrice / numItems;
    }

    ArrayList<Integer> itemList = new ArrayList<>();
    public ArrayList<Integer> listMoreAmount(int amount) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].price > amount){
                itemList.add(items[i].itemLot);
            }
        }
        return itemList;
    }
}
