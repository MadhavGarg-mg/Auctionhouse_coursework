public class Item {
    private int itemLot;
    private String buyerName;
    private double price;
    private int year;
    private String itemType;

    public Item(int itemLot, String buyerName, double price, int year, String itemType) throws Exception{
        if(itemType.equals("furniture") || itemType.equals("painting") || itemType.equals("sculpture")){
            this.itemLot = itemLot;
            this.buyerName = buyerName;
            this.price = price;
            this.year = year;
            this.itemType = itemType.toLowerCase();}
        else throw new Exception("This Item type must be furniture, painting, or sculpture.");
    }

    // Type check on itemType
    public String toString() {
        return "Item{" +
                "itemLot=" + getItemLot() +
                ", buyerName='" + getBuyerName() + '\'' +
                ", price=" + getPrice() +
                ", year=" + getYear() +
                ", itemType='" + getItemType() + '\'' +
                '}';
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
        this.itemType = itemType.toLowerCase();
    }

    public String getItemType(){
        return itemType;
    }
}
