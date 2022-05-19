package com.perscholas.cafeProject2;

public class Coffee extends Product {

    boolean sugar ;
    boolean milk ;

    public Coffee(String name, double price, String description,boolean sugar , boolean milk) {
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;

    }
    public Coffee() {
        super("Coffee", 2.99, "Regular Coffee");
        this.sugar = false;
        this.milk = false;

    }



    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
       
    }
    double coffeeSubtotal ;

    public double getCoffeeSubtotal() {
        return coffeeSubtotal;
    }

    public void setCoffeeSubtotal(double coffeeSubtotal) {
        this.coffeeSubtotal = coffeeSubtotal;
    }

    @Override
    public double calculateProductTotal() {
        System.out.println("Do you want to add sugar on your coffee ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int sugarChoice = s.nextInt();

        System.out.println("Do you want to add milk on your coffee ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int milkChoice = s.nextInt();


        double cofPrice = 0;


        switch (sugarChoice) {
            case 1:
                //this.setSugar(true);
                cofPrice = super.getPrice() + 10000 ;
                break;
            case 2:
                //this.setSugar(false);
                cofPrice = super.getPrice() ;
                break;
            default:
                System.out.println("input didn't match");
        }

        switch (milkChoice) {
            case 1:
                //this.setSugar(true);
                cofPrice = cofPrice + 100 ;
                break;
            case 2:
                //this.setSugar(false);
                cofPrice = cofPrice ;
                break;
            default:
                System.out.println("input didn't match");
        }

        setCoffeeSubtotal(coffeeSubtotal);
        coffeeSubtotal = cofPrice * super.getQuantity();
        setCoffeeSubtotal(coffeeSubtotal);
        return coffeeSubtotal ;


    }


}
