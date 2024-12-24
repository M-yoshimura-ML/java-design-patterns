package com.company.singleton;

/*
Singleton pattern using lazy initialization holder class.
This class ensure that we have a lazy initialization without worrying about synchronization.
* */
public class LazyRegistryIODH {
    private LazyRegistryIODH () {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
