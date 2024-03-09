package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.setPrice(400);
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            this.price += 80;
        }
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        if (!extraToppings) {
            this.price += 120;
        }
        this.extraToppings = true;
    }

    public String getBill() {
        String bill = "Base Price Of The Pizza: 400\n";
        if (extraCheese) {
            bill += "Extra Cheese Added: 80\n";
        }
        if (extraToppings) {
            bill += "Extra Toppings Added: 120\n";
        }
        if (takeAway) {
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price:" + this.price;
        return bill;
    }
}
