package com.driver;

public class Pizza {

    protected int price;
    private Boolean isVeg;
    private String bill;
    protected boolean extraCheese;
    protected boolean extraToppings;
    protected boolean takeAway;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = 300;
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
            this.price += 70;
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
            bill += "Extra Toppings Added: 70\n";
        }
        if (takeAway) {
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: " + this.price;
        return bill;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
