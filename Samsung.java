package DesignPattern.Mobile_FactoryMethod;

public class Samsung implements Mobile {

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public String features() {
        return "Documentation is good";
    }

    @Override
    public String OS() {
        return "Android iota";
    }
}