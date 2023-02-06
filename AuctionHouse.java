public class AuctionHouse {
    public String name;
    public String[] items;

    public AuctionHouse(String name, String[] items) {
        this.name = name;
        this.items = items;
    }

//    public String format(){
//        return String.format("""
//                Auction house name:\t%s
//                Items sold:\t%s
//                """, getName(), getItems());
//    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setItems(String[] items){
        this.items = items;
    }

    public String[] getItems(){
        return items;
    }

    public String mostExpensiveItem() {
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
        }
    }
}
