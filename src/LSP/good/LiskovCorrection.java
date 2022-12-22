package LSP.good;

import lombok.Getter;

public class LiskovCorrection {

    @Getter
    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }
        public double getPrice() {
            return this.price;
        }
        private double getDiscount(){
            return 0;
        }
    }

    public static class BeverageItem extends MenuItem {
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPrice(){
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            return (10 * 0.01 * this.price);
        }
    }

    public static void printItemPrice(MenuItem menuItem) {

        if(menuItem instanceof BeverageItem) {
            System.out.print("Beverage Item price: ");
        } else {
            System.out.print("Menu Item price: ");
        }
        System.out.println(menuItem.getPrice());
    }

    public static void main(String[] args) {
        MenuItem menuItem  = new MenuItem(100, "Bread", "wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60, "Coke", "cold beverage");

        printItemPrice(menuItem);
        printItemPrice(beverageItem);
    }
}
