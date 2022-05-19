package com.perscholas.cafeProject2;

public class Espresso extends Product {
    boolean extraShot ;
    boolean macchiato ;
    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;


    }

    public Espresso() {
        super("Espresso", 4.99, "Regular Espresso");
        this.macchiato = false;
        this.extraShot = false;

    }

    double espressoSubtotal;

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    public double getEspressoSubtotal() {
        return espressoSubtotal;
    }

    public void setEspressoSubtotal(double espressoSubtotal) {
        this.espressoSubtotal = espressoSubtotal;
    }

    @Override
    public double calculateProductTotal() {
        System.out.println("Do you want extra shot of Espresso ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int extraShott = s.nextInt();

        System.out.println("Do you want to add macchiato on your Espresso ? 1 for Yes , 2 for No:\n" +
                "1: Yes\n" +
                "2: No\n" + "\n" );
        int macchia = s.nextInt();


        double essPrice = 0;


        switch (extraShott) {
            case 1:
                //this.setSugar(true);
                essPrice = super.getPrice() + 2 ;
                break;
            case 2:
                //this.setSugar(false);
                essPrice = super.getPrice() ;
                break;
            default:
                System.out.println("input didn't match");
        }

        switch (macchia) {
            case 1:
                //this.setSugar(true);
                essPrice = essPrice + 1 ;
                break;
            case 2:
                //this.setSugar(false);
                essPrice = essPrice ;
                break;
            default:
                System.out.println("input didn't match");
        }

        setEspressoSubtotal(espressoSubtotal);
        espressoSubtotal = essPrice * super.getQuantity();
        setEspressoSubtotal(espressoSubtotal);
        return espressoSubtotal ;


    }


}
