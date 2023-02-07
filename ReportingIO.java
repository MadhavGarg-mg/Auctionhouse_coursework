import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ReportingIO {
    public static void main(String[] args) {
        new ReportingIO().run();
    }

    public void run() {
        List<AuctionHouse> auctionHouses = new ArrayList<>();

        Reporting reporting = new Reporting();
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

                    System.out.println("How many houses do you want to add? ");
                    Scanner numHouses = new Scanner(System.in);

                    int numberAuctionHouses = numHouses.nextInt();
                    for (int i = 0; i < numberAuctionHouses; i++){
                        System.out.println("Please enter the Auction House name");
                        String name = sc.next();
                        AuctionHouse auctionHouseName = new AuctionHouse(name);
                        auctionHouses.add(auctionHouseName);
                        reporting.addAuctionHouse(auctionHouseName);}
                    System.out.println(auctionHouses);


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

                    System.out.println("What auction house do you want to add these items to? ");

                    Scanner auctionHouse = new Scanner(System.in);

                    Item itemInformation = new Item(itemLot, buyerName, price, year, itemType);

                    String auctionName = auctionHouse.next();

                    for (int j = 0; j < auctionHouses.size(); j++){
                        if (Objects.equals(auctionHouses.get(j).getName(), auctionName)){
                            auctionHouses.get(j).addItem(itemInformation);}
                    }

                    System.out.println(auctionHouses);
                    break;

                case 3:
                    System.out.println("For which year would you like to get the auction house with the largest " +
                            "average item price");
                    Scanner years = new Scanner(System.in);
                    System.out.println(reporting.highestAveragePriceYear(years.nextInt()));

                    break;

                case 4:
                    System.out.println(reporting.highestItemPrice());

                    break;

                case 5:
                    System.out.println("Amount");
                    Scanner amount = new Scanner(System.in);

                    System.out.println(reporting.highestAveragePriceYear(amount.nextInt()));
                    break;
            }
        }

    }
}