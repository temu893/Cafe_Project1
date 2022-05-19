package com.perscholas.cafeProject2;

public class Cappuccino extends Product {
    boolean peppermint;
    boolean whippedCream;

    public Cappuccino(String name, double price, String description,boolean peppermint,boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;

    }
    public Cappuccino() {
        super("Cappuccino", 5.99, "Regular Cappuccino");

    }


    double cappuccinoSubtotal;

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public double getCappuccinoSubtotal() {
        return cappuccinoSubtotal;
    }

    public void setCappuccinoSubtotal(double cappuccinoSubtotal) {
        this.cappuccinoSubtotal = cappuccinoSubtotal;
    }

    @Override
    public double calculateProductTotal() {
        System.out.println("Do you want add pepper mint on your Cappuccino ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int addPeppermint = s.nextInt();

        System.out.println("Do you want to add whipped cream on your Cappuccino ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int addWhippedCream = s.nextInt();


        double cappPrice = 0;


        switch (addPeppermint) {
            case 1:
                //this.setSugar(true);
                cappPrice = super.getPrice() + 2 ;
                break;
            case 2:
                //this.setSugar(false);
                cappPrice = super.getPrice() ;
                break;
            default:
                System.out.println("input didn't match");
        }

        switch (addWhippedCream) {
            case 1:
                //this.setSugar(true);
                cappPrice = cappPrice + 1 ;
                break;
            case 2:
                //this.setSugar(false);
                cappPrice = cappPrice ;
                break;
            default:
                System.out.println("input didn't match");
        }

        setCappuccinoSubtotal(cappuccinoSubtotal);
        cappuccinoSubtotal = cappPrice * super.getQuantity();
        setCappuccinoSubtotal(cappuccinoSubtotal);
        return cappuccinoSubtotal ;    }

}
