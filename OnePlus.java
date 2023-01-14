package DesignPattern.Mobile_FactoryMethod;

public class OnePlus implements Mobile{
    @Override
    public int getPrice() {
        return 30000;
    }

    @Override
    public String features() {
        return "1+";
    }

    @Override
    public String OS() {
        return "Oxygen OS";
    }
}
