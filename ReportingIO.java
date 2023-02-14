import java.util.*;

/**
 * This class represents the reporting IO which gives the user an interactive menu. It has the main and one method to
 * check for some values
 *
 * @author Madhav Garg
 */
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

            int choice = (int)success(sc);

            switch (choice) {
                case 1 -> {
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
                        }
                    }
                }
                case 2 -> {
                    if (auctionHouses.size() == 0) {
                        System.out.println("Please enter an auction house before you enter an item");
                        break;
                    }
                    System.out.println("\n" + auctionHouses + "\n");
                    System.out.println("What auction house do you want to add these items to? ");
                    String auctionName = sc.next();
                    AuctionHouse name = null;
                    boolean houseFound = false;
                    for (AuctionHouse auctionHouse : auctionHouses) {
                        if (Objects.equals(auctionHouse.getName(), auctionName)) {
                            name = auctionHouse;
                            houseFound = true;
                            break;
                        }
                    }
                    if (!houseFound) {
                        System.out.println("This auction house doesn't exist :( . Try again");
                        break;
                    }


                    System.out.println("Please enter the item lot number: ");
                    int itemLot = (int) success(sc);

                    System.out.println("Please enter the buyer's name: ");
                    String buyerName = sc.next();

                    System.out.println("Please enter the selling price: ");
                    double price = success(sc);

                    System.out.println("Please enter the selling year: ");
                    int year = (int) success(sc);

                    System.out.println("Choose an item type: " +
                            "1. Furniture, 2. Painting, 3. Sculpture");
                    boolean successType = false;
                    int type;
                    String itemType = null;
                    while (!successType) {
                        try {
                            type = sc.nextInt();
                            if (type == 1) {
                                itemType = "furniture";
                                successType = true;
                            } else if (type == 2) {
                                itemType = "painting";
                                successType = true;
                            } else if (type == 3) {
                                itemType = "sculpture";
                                successType = true;
                            } else {
                                System.out.println("This is not a valid option");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You entered the wrong input. Please enter a number");
                            sc.next();
                        }
                    }
                    Item itemInformation = new Item(itemLot, buyerName, price, year, itemType);

                    name.addItem(itemInformation);

                    System.out.println("\n" + auctionHouses + "\n");

                }
                case 3 -> {
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }
                    System.out.println("\n" + auctionHouses + "\n");
                    System.out.println("For which year would you like to get the auction house with the largest " +
                            "average item price");
                    int yearAuction = (int)success(sc);
                    System.out.println("\n The auction house with the highest average sale in the year is: " +
                            reporting.highestAveragePriceYear(yearAuction) + "\n");
                }
                case 4 -> {
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }
                    System.out.println("\n The most expensive item is: " + reporting.highestItemPrice() + "\n");
                }
                case 5 -> {
                    if (auctionHouses.size() == 0) {
                        System.out.println("There are no auction houses to get any data from");
                        break;
                    }

                    System.out.println("\n" + auctionHouses + "\n");
                    System.out.println("Please enter the amount");
                    double amount = success(sc);
                    System.out.println("\n The items with price greater than the amount are: " +
                            reporting.listGreaterThanAmount(amount) + "\n");
                }
                case 6 -> {
                    System.out.println("Quitting");
                    quit = true;
                }
                default -> System.out.println("Not a valid option");
            }
        }

    }

    /**
     * Returns a num which can be used to define year, item lot, and other values that uses numbers required from an
     * input.
     * @param sc represents the user input
     * @return num which represents a number of type double
     */
    private double success(Scanner sc) {
        boolean success = false;
        double num = 0;
        while (!success) {
            try {
                num = sc.nextDouble();
                if (num > 0){
                success = true;}
                else System.out.println("The value can not be negative. Try again");
            } catch (InputMismatchException e) {
                System.out.println("You entered the wrong input. Please enter a number");
                sc.next();
            }
        }
        return num;
    }
}