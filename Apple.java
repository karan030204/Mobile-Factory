package DesignPattern.Mobile_FactoryMethod;

public class Apple implements Mobile{
    @Override
    public int getPrice() {
        return 150000;
    }

    @Override
    public String features() {
        return "LifeLong";
    }

    @Override
    public String OS() {
        return "M! chip hai re baba";
    }
}
