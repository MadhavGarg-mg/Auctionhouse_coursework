/**
 * This class represents an item sold in an auction. It has methods relating to the abstraction of an item.
 *
 * @author Madhav Garg
 */
public class Item {
    private int itemLot;
    private String buyerName;
    private double price;
    private int year;
    private String itemType;
/**
 * This constructor sets up all the internal fields of an Item object.
 * @param itemLot represents the item lot number of an item
 * @param buyerName represents the name of the buyer of the item
 * @param price represents the price of the sold item
 * @param year represents the year when the item was sold
 * @param itemType represents the type of item
 * @throws Exception if the item type is not a furniture, painting, and sculpture
 * */
    public Item(int itemLot, String buyerName, double price, int year, String itemType) throws Exception{
        if(itemType.equals("furniture") || itemType.equals("painting") || itemType.equals("sculpture")){
            this.itemLot = itemLot;
            this.buyerName = buyerName;
            this.price = price;
            this.year = year;
            this.itemType = itemType.toLowerCase();}
        else throw new Exception("This Item type must be furniture, painting, or sculpture.");
    }

    /**
     * Returns a human-readable version of an Item object
     * @return String representation of the item
     */
    public String toString() {
        return "Item{" +
                "itemLot=" + getItemLot() +
                ", buyerName='" + getBuyerName() + '\'' +
                ", price=" + getPrice() +
                ", year=" + getYear() +
                ", itemType='" + getItemType() + '\'' +
                '}';
    }

    /**
     * Sets the item lot number to the desired item lot number
     * @param itemLot represents the item lot number of an item
     */
    public void setItemLot(int itemLot){
        this.itemLot = itemLot;
    }

    /**
     * Returns the item lot of an item
     * @return the item lot number
     */
    public int getItemLot(){
        return itemLot;
    }

    /**
     * Sets the buyer name for an item
     * @param buyerName represents the buyer name for an item
     */
    public void setBuyerName(String buyerName){
        this.buyerName = buyerName;
    }

    /**
     * Returns the buyer name of an item
     * @return the buyer name for an item
     */
    public String getBuyerName(){
        return buyerName;
    }

    /**
     * Sets the price for an item
     * @param price represents the price for an item
     */
    public void setPrice(int price){
        this.price = price;
    }

    /**
     * Return the price of an item
     * @return the price of an item
     */
    public double getPrice(){
        return price;
    }

    /**
     * Sets the year for an item
     * @param year represents the year when the item was sold
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Return the year of an item
     * @return the year of an item
     */
    public int getYear(){
        return year;
    }

    /**
     * Sets the item type for an item
     * @param itemType represents the type of item sold
     */
    public void setItemType(String itemType){
        this.itemType = itemType.toLowerCase();
    }

    /**
     * Returns the item type for an item
     * @return the item type of item
     */
    public String getItemType(){
        return itemType;
    }
}
