public class Testing {
    public static void main(String[] args) {
        Item i1 = new Item(1000, "Aaryan Dominguez", 871.10, 2002, "furniture");
        Item i2 = new Item(1001, "Cecilia Barker", 411.80, 2000, "furniture");
        Item i3 = new Item(1002, "Xander Leon", 1121.40, 2005, "painting");
        Item i4 = new Item(1003, "Rowan Ellis", 210, 2000, "painting");
        Item i5 = new Item(1004, "Andreas Ramos", 2500, 2010, "sculpture");
//        AuctionHouse a1 = new AuctionHouse("Beasts of Forever");
//        AuctionHouse a2 = new AuctionHouse("Pristine Deceit");
//        AuctionHouse a3 = new AuctionHouse("Integrity");
//        Reporting r1 = new Reporting();

        // Testing all the methods in the Item class.

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

    }
}
