import java.util.Scanner;

public class ReportingIO {
    public static void main(String[] args) {
        new ReportingIO().run();
    }

    public void run() {
        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        while(!quit){
            Scanner input = new Scanner(System.in);
            String options = """ 
                1. Enter Auction house data.
                2. Enter item data.
                3. Get report for auction house with largest average item price for a given year.
                4. Get report for the highest price item ever reported.
                5. Get report for all the items sold with a price greater than a given price.
                6. Quit the menu.
                """;

            System.out.println("Please select an option");
            System.out.println(options);
            int choice = sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("Please enter the Auction house name: ");
                    String name = sc.next();
                    System.out.println("Please enter the items sold in the Auction house: ");

//                    AuctionHouse scname = new AuctionHouse(name, );
                    break;
                case 2:
                    System.out.println("Please enter the item lot number: ");
                    int itemLot = sc.nextInt();

                    System.out.println("Please enter the buyer's name: ");
                    String buyerName = sc.next();

                    System.out.println("Please enter the selling price: ");
                    double price = sc.nextDouble();

                    System.out.println("Please enter the selling year: ");
                    int year = sc.nextInt();

                    System.out.println("Please enter the item type: ");
                    String itemType = sc.next();

                    Item item = new Item(itemLot, buyerName, price, year, itemType);

                    break;
                case 3:
                    System.out.println("a");

                    break;
//                case 4:
//                    System.out.println("Quitting");
//                    quit = true;
//                    break;
//                default:
//                    System.out.println("Not a valid option");
            }
        }

    }
}