import java.util.*;

public class ReportingIO {
    public static void main(String[] args) {
        new ReportingIO().run();
    }

    public void run() {
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
                }
            }


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
                            System.out.println(auctionHouses);
                            successAuctionHouses = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            numHouses.next();
                        }
                    }
                    break;

                case 2:

                    if (auctionHouses.size() == 0) {
                        System.out.println("Please enter an auction house before you enter an item");
                        break;
                    }

                    System.out.println("What auction house do you want to add these items to? ");
                    String auctionName = sc.next();

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
                        }
                    }

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
                        }
                    }

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
                        }
                    }

                    System.out.println("Please enter the item type: ");
                    String itemType = sc.next();


                    Item itemInformation = new Item(itemLot, buyerName, price, year, itemType);


                    for (int j = 0; j < auctionHouses.size(); j++) {
                        if (Objects.equals(auctionHouses.get(j).getName(), auctionName)) {
                            auctionHouses.get(j).addItem(itemInformation);
                        }
                    }

                    System.out.println(auctionHouses);
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
                        }
                    }

                    System.out.println("The auction house with the highest average sale in the year is: " +
                            reporting.highestAveragePriceYear(yearAuction));
//                    System.out.println(reporting.highestAveragePriceYear(sc.nextInt()));

                    break;

                case 4:
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }
                    System.out.println(reporting.highestItemPrice());

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
                        }
                    }
                    System.out.println("The items with price greater than the amount are: " +
                            reporting.highestAveragePriceYear(amount));
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