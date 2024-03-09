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
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void addTakeaway() {
        this.takeAway = true;
    }

    public String getBill() {
        String bill = "Base Price Of The Pizza: 300\n";
        int price = 300;
        if(extraCheese){
            bill += "Extra Cheese Added: 80\n";
            price+=80;
        }
        if(extraToppings){
            bill += "Extra Toppings Added: 70\n";
            price+=70;
        }
        if(takeAway){
            bill+= "Paperbag Added: 20\n";
            price+=20;
        } 
        bill+= "Total Price:" + price;
        return bill;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
