import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {
    private String name;
    List<Item> items = new ArrayList<>();

    public AuctionHouse(String name) {
        this.name = name;
    }

    public String toString() {
        return "AuctionHouse{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addItem(Item item){
        items.add(item);
    }

    Item item;
    double itemPrice;
    public Item mostExpensiveItem() {
        for (Item value : items) {
            if (value.getPrice() > itemPrice) {
                item = value;
                itemPrice = value.getPrice();
            }
        }
        return item;
    }

    double averagePrice;
    int numItems;
    public double averageItemYear(int year) {
        for (Item value : items) {
            if (value.getYear() == year) {
                averagePrice += value.getPrice();
                numItems += 1;
            }
        }
        return averagePrice / numItems;
    }

    ArrayList<Item> itemList = new ArrayList<>();
    public ArrayList<Item> listMoreAmount(int amount) {
        for (Item value : items) {
            if (value.getPrice() > amount) {
                itemList.add(value);
            }
        }
        return itemList;
    }
}
