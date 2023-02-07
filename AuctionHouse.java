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

    int item;
    double itemPrice;
    public int mostExpensiveItem() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getPrice() > itemPrice){
                item = items.get(i).getItemLot();
                itemPrice = items.get(i). getPrice();
            }
        }
        return item;
    }

    double averagePrice;
    int numItems;
    public double averageItemYear(int year) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getYear() == year){
                averagePrice += items.get(i).getPrice();
                numItems += 1;
            }
        }
        return averagePrice / numItems;
    }

    ArrayList<Integer> itemList = new ArrayList<>();
    public ArrayList<Integer> listMoreAmount(int amount) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getPrice() > amount){
                itemList.add(items.get(i).getItemLot());
            }
        }
        return itemList;
    }
}
