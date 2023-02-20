/**
 * This class represents testing for all the classes
 *
 * @author Madhav Garg
 */
public class Testing {
    public static void main(String[] args) throws Exception {
        Item i1 = new Item(1000, "Aaryan Dominguez", 871.10, 2002, "furniture");
        Item i2 = new Item(1001, "Cecilia Barker", 411.80, 2000, "furniture");
        Item i3 = new Item(1002, "Xander Leon", 1121.40, 2005, "painting");
        Item i4 = new Item(1003, "Rowan Ellis", 210, 2000, "painting");
        Item i5 = new Item(1004, "Andreas Ramos", 2500, 2010, "sculpture");
        AuctionHouse a1 = new AuctionHouse("Beasts of Forever");
        AuctionHouse a2 = new AuctionHouse("Pristine Deceit");
        AuctionHouse a3 = new AuctionHouse("Integrity");
        Reporting r1 = new Reporting();

        // Testing all the methods in the Item class.

        System.out.println("Testing the Item class");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for item lot");

        System.out.println("Getting the item lot for the item");

        System.out.println("The item lot for the item is: " + i1.getItemLot());

        System.out.println("Setting the item lot to 1005");
        i1.setItemLot(1005);

        System.out.println("Getting the new item lot for the item");

        System.out.println("The item lot for the item is: " + i1.getItemLot() + "\n");

        // Crash i1.setItemLot(-1000) as the item lot cannot be a negative value

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for buyer name");

        System.out.println("Getting the buyer name for the item");

        System.out.println("The buyer name for the item is: " + i1.getBuyerName());

        System.out.println("Setting the buyer name to Chester Green");
        i1.setBuyerName("Chester Green");

        System.out.println("Getting the new buyer name for the item");

        System.out.println("The buyer name for the item is: " + i1.getBuyerName() + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for the price");

        System.out.println("Getting the price for the item");

        System.out.println("The price for the item is: " + i1.getPrice());

        System.out.println("Setting the price to 900");
        i1.setPrice(900);

        System.out.println("Getting the new price for the item");

        System.out.println("The price for the item is: " + i1.getPrice() + "\n");

        // Crash i1.setPrice(-1000) as the item price cannot be a negative value

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for the year");

        System.out.println("Getting the year for the item");

        System.out.println("The sold year for the item is: " + i1.getYear());

        System.out.println("Setting the year to 2000");
        i1.setYear(2000);

        System.out.println("Getting the new year for the item");
        System.out.println("The sold year for the item is: " + i1.getYear() + "\n");

        // Crash i1.setYear(-2000) as the year cannot be a negative value
        // Crash i1.setYear(2025) as the year 2025 has not started

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for the item type");

        System.out.println("Getting the item type for the item");

        System.out.println("The item type fot the item: " + i1.getItemType());

        System.out.println("Setting the item type to painting");
        i1.setItemType("painting");

        System.out.println("The item type fot the item: " + i1.getItemType() + "\n");

        // Crash setItemType("electronic") as item type can only be a furniture, sculpture, or a painting

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nPrinting the items.\n");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        // Testing all the methods in the AuctionHouse class.


        System.out.println("\nTesting AuctionHouse class\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the setter and getter for auction house lot");

        System.out.println("Getting the name of the auction house");

        System.out.println("The name of the auction house is: " + a1.getName());

        System.out.println("Setting the auction house name to Redemption of Harmony");
        a1.setName("Redemption of Harmony");

        System.out.println("Getting the new name of the auction house");
        System.out.println("The name of the auction house is: " + a1.getName() + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nAuction house without any item: " + a1);
        System.out.println("\nAdding i1 and i2 to the auction house\n");

        a1.addItem(i1);
        a1.addItem(i2);
        System.out.println("Auction house with i1 and i2: " + a1);

        System.out.println("\nAuction house without any item: " + a2);
        System.out.println("\nAdding i3 and i4 to the auction house\n");
        a2.addItem(i3);
        a2.addItem(i4);

        System.out.println("Auction house with i3 and i4: " + a2);

        System.out.println("\nAuction house without any item: " + a3);
        System.out.println("\nAdding i5 to the auction house\n");
        a3.addItem(i5);

        System.out.println("Auction house with i5: " + a3 + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the mostExpensiveItem() function\n");

        System.out.println("The most expensive item from a1 is: " + a1.mostExpensiveItem());
        System.out.println("The most expensive item from a2 is: " + a2.mostExpensiveItem());
        System.out.println("The most expensive item from a3 is: " + a3.mostExpensiveItem() + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the averageItemYear() function\n");
        System.out.println("The average cost of items in year 2000 for auction house a1 is: " + a1.averageItemYear(2000));
        System.out.println("The average cost of items in year 2000 for auction house a1 is: " + a2.averageItemYear(2000));
        System.out.println("The average cost of items in year 2000 for auction house a1 is: " + a3.averageItemYear(2000));
        System.out.println("The average cost of items in year 2010 for auction house a1 is: " + a3.averageItemYear(2010) + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the listMoreAmount() function\n");
        System.out.println("The list of all items in a1 more than 5000: " + a1.listMoreAmount(5000));
        System.out.println("The list of all items in a1 more than 500: " + a1.listMoreAmount(500));
        System.out.println("The list of all items in a1 more than 200: " + a1.listMoreAmount(200) + "\n");

        System.out.println("The list of all items in a2 more than 500: " + a2.listMoreAmount(500) + "\n");
        System.out.println("The list of all items in a3 more than 500: " + a3.listMoreAmount(500) + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        // Testing all the methods in the Reporting class.

        System.out.println("\nTesting Reporting class\n");

        System.out.println("Reporting without any auction houses: " + r1);
        System.out.println("\nAdding a1, a2, and a3 to reporting\n");
        r1.addAuctionHouse(a1);
        r1.addAuctionHouse(a2);
        r1.addAuctionHouse(a3);
        System.out.println("Reporting with all the auction houses: " + r1 + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the highestItemPrice() function\n");
        System.out.println("The item with the highest price is: " + r1.highestItemPrice() + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the highestAveragePriceYear() function\n");
        System.out.println("The house with the highest average item price in year 2000: " +
                r1.highestAveragePriceYear(2000) + "\n");

        System.out.println("The house with the highest average item price in year 10: " +
                r1.highestAveragePriceYear(10) + "\n");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nTesting the listGreaterThanAmount() function\n");

        System.out.println("The items greater than the amount 1 are: " + r1.listGreaterThanAmount(1) + "\n");
        System.out.println("The items greater than the amount 2000 are: " + r1.listGreaterThanAmount(2000));
    }
}
