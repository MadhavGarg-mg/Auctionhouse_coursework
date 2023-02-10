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

        System.out.println("Testing Item class");
        System.out.println(" ");

        i1.setItemLot(1005);
        System.out.println("The item lot is: " + i1.getItemLot());

        i1.setBuyerName("Chester Green");
        System.out.println("The buyer name is: " + i1.getBuyerName());

        i1.setPrice(900);
        System.out.println("The item price is: " + i1.getPrice());

        i1.setYear(2000);
        System.out.println("The item sold year is: " + i1.getYear());

        i1.setItemType("painting");
        System.out.println("The item type is: " + i1.getItemType());

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        // Testing all the methods in the AuctionHouse class.

        System.out.println(" ");
        System.out.println("Testing AuctionHouse class");
        System.out.println(" ");

        System.out.println("Changing the auction house name from " + a1.getName());
        a1.setName("Redemption of Harmony");
        System.out.println("The Auction House name is: " + a1.getName());

        a1.addItem(i1);
        a1.addItem(i2);
        a1.addItem(i3);
        a1.addItem(i4);

        a2.addItem(i1);
        a2.addItem(i2);
        a2.addItem(i5);

        a3.addItem(i1);
        a3.addItem(i3);
        a3.addItem(i5);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("The most expensive item is " + a1.mostExpensiveItem());
        System.out.println("The most expensive item is " + a2.mostExpensiveItem());
        System.out.println("The most expensive item is " + a3.mostExpensiveItem());

        System.out.println(a1.averageItemYear(2000));
        System.out.println(a2.averageItemYear(2000));
        System.out.println(a3.averageItemYear(2000));

        System.out.println(a1.listMoreAmount(500));
        System.out.println(a2.listMoreAmount(500));
        System.out.println(a3.listMoreAmount(500));

        // Testing all the methods in the Reporting class.

        System.out.println(" ");
        System.out.println("Testing Reporting class");
        System.out.println(" ");

        System.out.println(r1);
        r1.addAuctionHouse(a1);
        r1.addAuctionHouse(a2);
        r1.addAuctionHouse(a3);
        System.out.println(r1);

        System.out.println("The highest item price is: " + r1.highestItemPrice());

        System.out.println("The house with the highest average item price in year 2000: " +
                r1.highestAveragePriceYear(2000));

        System.out.println(r1.listGreaterThanAmount(2000));
    }
}
