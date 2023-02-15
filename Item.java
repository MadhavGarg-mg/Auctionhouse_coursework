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
 * @throws Exception if the item lot is not a positive integer
 * @throws Exception if the price is not a positive double
 * @throws Exception if the year is not between 1 and 2023 (inclusive)
 * @throws Exception if the item type is not a furniture, painting, and sculpture
 */
    public Item(int itemLot, String buyerName, double price, int year, String itemType) throws Exception{
        if(itemLot > 0){
            this.itemLot = itemLot;}
        else throw new Exception("The item lot must be a positive value.");

        this.buyerName = buyerName;

        if(price > 0){
            this.price = price;}
        else throw new Exception("The item price must be a positive value");

        if(year > 0 && year < 2024){
            this.year = year;}
        else throw new Exception("The year must be positive and the item should be sold before 2024.");

        itemType = itemType.toLowerCase();
        if(itemType.equals("furniture") || itemType.equals("painting") || itemType.equals("sculpture")){
            this.itemType = itemType;}
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
     * @throws Exception if the item lot is not a positive integer
     */
    public void setItemLot(int itemLot) throws Exception {
        if(itemLot > 0){
            this.itemLot = itemLot;}
        else throw new Exception("The item lot must be a positive value.");
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
     * @throws Exception if the price is not a positive double
     */
    public void setPrice(int price) throws Exception {
        if(price > 0){
            this.price = price;}
        else throw new Exception("The price must be a positive double.");
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
     * @throws Exception if the year is not between 1 and 2023 (inclusive)
     */
    public void setYear(int year) throws Exception {
        if(year > 0 && year < 2024){
            this.year = year;}
        else throw new Exception("The year must be positive and the item should be sold before 2024.");
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
     * @throws Exception if the item type is not a furniture, painting, and sculpture
     */
    public void setItemType(String itemType) throws Exception {
        if(itemType.equals("furniture") || itemType.equals("painting") || itemType.equals("sculpture")){
            this.itemType = itemType.toLowerCase();}
        else throw new Exception("This Item type must be furniture, painting, or sculpture.");
    }

    /**
     * Returns the item type for an item
     * @return the item type of item
     */
    public String getItemType(){
        return itemType;
    }
}
