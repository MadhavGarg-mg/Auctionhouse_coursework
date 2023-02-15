# 220646763_CSC1035_coursework1_2022

This is an auction houses program which takes auction houses and item sold in them and can return their information
or some statistics related to them. The program also has an interactive menu for the user to add items and 
auction houses.

## Item class

Item class is a class for creating an item sold in an auction house.

You can create an item using this command:

`Item item = new Item(itemLot, buyerName, price, year, itemType);`


### Assumptions 

The item lot number is the item lot of the item. It must be of type int.

The buyer's name is the buyer's name for an item. It must be a string.

The price is the selling price of an item. It must be of type double.

The year is the year the item was sold. It must be of type int.

The item type is the type of item. It must be a string and can only be furniture, painting or a sculpture.

Example: `Item chair = new Item(1000, "Madhav Garg", 1234, 2000, "furniture");`

There are checks for negative values in item lot number, price, year (auction house is not more than 2000 years old). 
There is also a check to check for the item type to be either a furniture, painting or a sculpture (not case-sensitive).
If any of these cases are broken then an error will be thrown. 

### Methods 

#### Setters

Setter: They are used to set the value of a field to a new value.

```
1. item.setItemLotNum(newItemLot) sets the itemLot to newItemLot 
2. item.setName(newName) sets the buyerName to newName
3. item.setPrice(newPrice) sets the price to newPrice
4. item.setYear(newYear) sets the year to newYear
5. item.setItemType(newItemType) sets the itemType to newItemType
```

Example: `chair.setprice(1250);`

#### Getter

Getters: They are used to get the value of a particular field from the item.

```
1. item.getItemLot() gets the itemLot for the item 
2. item.getName() gets the buyerName for the item 
3. item.getPrice() gets the price for the item 
4. item.getYear() gets the year for the item 
5. item.getItemType() gets the itemType for the item 
```

Example: `chair.getName();`

#### toString

This method is used to return a human-readable representation of an item.


## AuctionHouse class 

The `AuctionHouse` class is used to add auction houses, add items to the auction houses, and it has some methods
such as `mostExpensiveItem` which returns the most expensive item ever sold in an auction house, `averageItemYear` 
which returns the average item type for an auction house in a particular year, and `listMoreAmount` which returns a list
of all items in an auction house which are more expensive than the given amount.

Creating an auction house only requires a name:

`AuctionHouse auctionHouse = new AuctionHouse(name);`

Example: `AuctionHouse a1 = new AuctionHouse("Newcastle");`

### Methods

#### Getter

Getter: This is used to get the name of an auction house.

```
auctionhouse.getName() gets the name of the auction house. 
```

Example: `auctionhouse.getName();`

#### Setter

Setter: This is used to set the name of an auction house as a new name.

```
auctionhouse.setName(newName) sets the name of the auction house as the newName. 
```

Example: `a1.setName(London);`

#### addItem

`auctionHouse.addItem(Item);` adds an item to the auction house

Example: `a1.addItem(chair);`

#### mostExpensiveItem

`mostExpensiveItem` method searches for the most expensive item in the auction house and returns it.

`auctionHouse.mostExpensiveItem();`

Example: `a1.mostExpensiveItem();`

#### listMoreAmount

`listMoreAmount` method returns the list of all items that have a greater price then the entered amount.

`auctionHouse.listMoreAmount(amount);` amount must be of type double

Example: `a1.greaterThan(100);`

#### averageItemYear

`averageItemYear` method calculate the average item prices in a given year.

`auctionHouse.averageItemYear(year);`  year must be of type int

Example: `a1.averagePrice(2018);`

## Reporting class

Reporting class has a list that stores all the auction houses and their items. It also provides some statistics using
the following methods: `highestItemPrice`, `highestAveragePriceYear` and `listGreaterThanAmount`

To add an auction house to the list first create a reporting object and then use `addAuctionHouse`:

```
Reporting reporting = new Reporting();
reporting.addAuctionHouse(auctionHouse); auctionHouse must be an AuctionHouse object type
```

Example:
```
Reproting r1 = new Reporting();
r.addAuctionHouse(a1);
```

### Methods

#### highestItemPrice

`highestItemPrice` method returns the item with the highest price ever recorded in all auction houses.

`reporting.highestItemPrice();`

Example: `r1.highestItemPrice();`

#### highestAveragePriceYear

`highestAveragePriceYear` methods calculates the average prices for all auction houses over a given year and return the 
auction house with the highest average.

`reporting.highestAveragePriceYear(year);` year must be of type int

Example: `r1.highestAveragePriceYear(2018);`

#### listGreaterThanAmount

`listGreaterThanAmount` method returns the list of all the items which has a price higher than the entered amount in 
all auction houses.

`reporting.listGreaterThanAmount(amount);` --> The amount must be a double

Example: `r1.listGreaterThanAmount(100.20);`

## ReportingIO class

`ReportingIO` is a class that gives the user an interactive menu to add auction houses, put items in auction houses, 
get statistics from `highestItemPrice`, `highestAveragePriceYear` and `listGreaterThanAmount` methods.

### Methods

#### success 

This method has been created to remove a lot of duplicate code. I use this method to type check for any fields that use 
inputs other than string type.

`int choice = (int)success(sc);` returns the choice by using an input

## Testing class

`Testing` is just a class with all the tests of all the functions in other classes.