package DesignPattern.Mobile_FactoryMethod;

import java.lang.management.MonitorInfo;

public class Mobile_Factory {

    Mobile CreateMobile(String name) {
        if (name.toLowerCase().equals("apple")) {
            return new Apple();
        } else if (name.toLowerCase().equals("samsung")) {
            return new Samsung();
        } else if (name.toLowerCase().equals("nokia")) {
            return new Nokia();
        } else if (name.toLowerCase().equals("oneplus")) {
            return new OnePlus();
        }else {
            return null;
        }
    }
}
