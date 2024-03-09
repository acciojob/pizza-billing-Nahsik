package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.setPrice(400);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    public String getBill() {
        String bill = "Base Price Of The Pizza: 400\n";
        int price = 400;
        if (extraCheese) {
            bill += "Extra Cheese Added: 80\n";
            price += 80;
        }
        if (extraToppings) {
            bill += "Extra Toppings Added: 120\n";
            price += 70;
        }
        if (takeAway) {
            bill += "Paperbag Added: 20\n";
            price += 20;
        }
        bill += "Total Price:" + price;
        return bill;
    }
}
