package com.company.structural.facade.email;

public class StationaryFactory {
    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}
