package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean bagAdded;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price+=300;
            this.bill="Base Price Of The Pizza: 300\n";
        }
        else{
            this.price+=400;
            this.bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.cheeseAdded){
            return;
        }
        this.price+=80;
        this.cheeseAdded=true;
        this.bill+="Extra Cheese Added: 80\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.toppingsAdded){
            return;
        }
        this.toppingsAdded=true;

           if(this.isVeg){
               this.price+=70;
               this.bill="Extra Toppings Added: 70\n";
           }
           else{
               this.price+=120;
               this.bill="Extra Toppings Added: 120\n";
           }

    }

    public void addTakeaway(){
        // your code goes here
        if(this.bagAdded){
            return;
        }
        this.bagAdded=true;
        // your code goes here
        this.price+=20;
        this.bill+="Paperbag Added: 20\n";
    }

    public String getBill(){
        // your code goes here
        if(this.billGenerated){
            return this.bill;
        }
        this.billGenerated = true;
        this.bill+="Total Price: " + this.price+"\n";
        return this.bill;
    }
}
