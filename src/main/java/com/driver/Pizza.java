package com.driver;

public class Pizza {

    protected int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            this.price += 80;
        }
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        if (!extraToppings) {
            this.price += this.isVeg ? 70 : 120;
        }
        this.extraToppings = true;
    }

    public void addTakeaway() {
        if (!takeAway) {
            this.price += 20;
        }
        this.takeAway = true;
    }

    public String getBill() {
        String bill = "Base Price Of The Pizza: 300\n";
        if (extraCheese) {
            bill += "Extra Cheese Added: 80\n";
        }
        if (extraToppings) {
            bill += "Extra Toppings Added: "+ (isVeg ? 70 : 120)+ "\n";
        }
        if (takeAway) {
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return bill;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
