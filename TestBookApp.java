package DesignPattern.Mobile_FactoryMethod;

public class TestBookApp {
    public static void main(String[] args) {
        Mobile_Factory m1 = new Mobile_Factory();
        Mobile a = m1.CreateMobile("apple");
        Mobile o = m1.CreateMobile("samsung");
        Mobile s = m1.CreateMobile("nokia");
        Mobile n = m1.CreateMobile("Oneplus");

        System.out.println("Unique Feature of Apple : "+a.features());
        System.out.println("Price of Apple : "+a.getPrice());
        System.out.println("OS of Apple : "+a.OS());
        System.out.println();
        System.out.println("Unique Feature of Samsung : "+s.features());
        System.out.println("Price of Samsung : "+s.getPrice());
        System.out.println("OS of Samsung : "+s.OS());
        System.out.println();

        System.out.println("Unique Feature of Nokia : "+n.features());
        System.out.println("Price of Nokia : "+n.getPrice());
        System.out.println("OS of Nokia : "+n.OS());
        System.out.println();


        System.out.println("Unique Feature of OnePlus : "+o.features());
        System.out.println("Price of OnePlus : "+o.getPrice());
        System.out.println("OS of OnePlus : "+o.OS());


    }
}
