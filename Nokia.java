package DesignPattern.Mobile_FactoryMethod;

public class Nokia implements Mobile{
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String features() {
        return "IMMORTALITITY";
    }

    @Override
    public String OS() {
        return "Snapdragon 3310";
    }
}
