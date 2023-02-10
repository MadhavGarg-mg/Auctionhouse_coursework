import java.util.*;

public class ReportingIO {
    public static void main(String[] args) throws Exception {
        new ReportingIO().run();
    }

    public void run() throws Exception {
        List<AuctionHouse> auctionHouses = new ArrayList<>();

        Reporting reporting = new Reporting();
        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        while(!quit) {

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

            boolean successChoice = false;
            int choice = 0;
            while (!successChoice) {
                try {
                    choice = sc.nextInt();
                    successChoice = true;
                } catch (InputMismatchException e) {
                    System.out.println("You entered the wrong input. Please enter a number");
                    sc.next();
                }}

            switch (choice) {
                case 1:

                    System.out.println("How many houses do you want to add? ");
                    Scanner numHouses = new Scanner(System.in);

                    boolean successAuctionHouses = false;
                    while (!successAuctionHouses) {
                        try {
                            int numberAuctionHouses = numHouses.nextInt();
                            for (int i = 0; i < numberAuctionHouses; i++) {
                                System.out.println("Please enter the Auction House name");
                                String name = sc.next();
                                AuctionHouse auctionHouseName = new AuctionHouse(name);
                                auctionHouses.add(auctionHouseName);
                                reporting.addAuctionHouse(auctionHouseName);
                            }
                            System.out.println("\n" + auctionHouses + "\n");
                            successAuctionHouses = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            numHouses.next();
                        }}
                    break;

                case 2:

                    if (auctionHouses.size() == 0) {
                        System.out.println("Please enter an auction house before you enter an item");
                        break;
                    }

                    System.out.println("Please enter the item lot number: ");

                    boolean successItemLot = false;
                    int itemLot = 0;
                    while (!successItemLot) {
                        try {
                            itemLot = sc.nextInt();
                            successItemLot = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    System.out.println("Please enter the buyer's name: ");
                    String buyerName = sc.next();


                    System.out.println("Please enter the selling price: ");
                    boolean successPrice = false;
                    double price = 0;
                    while (!successPrice) {
                        try {
                            price = sc.nextDouble();
                            successPrice = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    System.out.println("Please enter the selling year: ");
                    boolean successYear = false;
                    int year = 0;
                    while (!successYear) {
                        try {
                            year = sc.nextInt();
                            successYear = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    System.out.println("Choose an item type: " +
                            "1. Furniture, 2. Painting, 3. Sculpture");
                    boolean successType = false;
                    int type;
                    String itemType = null;
                    while (!successType) {
                        try {
                            type = sc.nextInt();
                            if (type == 1){
                                itemType = "furniture";
                            }
                            else if(type == 2){
                                itemType = "painting";
                            }
                            else if (type == 3) {
                                itemType = "sculpture";
                            }
                            else{
                                System.out.println("This is not a valid option");
                            }
                            successType = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    assert itemType != null;
                    Item itemInformation = new Item(itemLot, buyerName, price, year, itemType);

                    System.out.println("What auction house do you want to add these items to? ");
                    String auctionName = sc.next();

                    boolean houseFound = false;
                    for (int j = 0; j < auctionHouses.size(); j++) {
                        if (Objects.equals(auctionHouses.get(j).getName(), auctionName)) {
                            auctionHouses.get(j).addItem(itemInformation);
                            houseFound = true;
                            break;
                        }}

                    System.out.println("\n" + auctionHouses + "\n");

                    if(!houseFound){
                    System.out.println("This auction house doesn't exist :( . Try again");}
                    break;

                case 3:
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }

                    System.out.println("For which year would you like to get the auction house with the largest " +
                            "average item price");

                    boolean successYearAuctionHouse = false;
                    int yearAuction = 0;
                    while (!successYearAuctionHouse) {
                        try {
                            yearAuction = sc.nextInt();
                            successYearAuctionHouse = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    System.out.println("\n The auction house with the highest average sale in the year is: " +
                            reporting.highestAveragePriceYear(yearAuction) + "\n");

                    break;

                case 4:
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }
                    System.out.println("\n The most expensive item is: " + reporting.highestItemPrice()  + "\n");
                    break;

                case 5:
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }
                    System.out.println("Please enter the amount");

                    boolean successAmount = false;
                    int amount = 0;
                    while (!successAmount) {
                        try {
                            amount = sc.nextInt();
                            successAmount = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }}

                    System.out.println("\n The items with price greater than the amount are: " +
                            reporting.listGreaterThanAmount(amount) + "\n");
                    break;

                case 6:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        }

    }
}