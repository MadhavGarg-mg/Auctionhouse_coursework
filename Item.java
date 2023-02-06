public class Item {
    public int itemLot;
    public String buyerName;
    public double price;
    public int year;
    public String itemType;

    public Item(int itemLot, String buyerName, double price, int year, String itemType) {
        this.itemLot = itemLot;
        this.buyerName = buyerName;
        this.price = price;
        this.year = year;
        this.itemType = itemType;
    }

    public String stringItems(){
        return String.format("""
                Item lot number:\t%s
                Buyer name:\t%s
                Price:\t%s
                Year:\t%s
                Item type: \t%s
                """, getItemLot(), getBuyerName(), getPrice(), getYear(), getItemType());
    }

    public void setItemLot(int itemLot){
        this.itemLot = itemLot;
    }

    public int getItemLot(){
        return itemLot;
    }

    public void setBuyerName(String buyerName){
        this.buyerName = buyerName;
    }

    public String getBuyerName(){
        return buyerName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    public String getItemType(){
        return itemType;
    }
}
