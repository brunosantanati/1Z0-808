package me.brunosantana.exam5.package2;

import me.brunosantana.exam5.package3.Planet;

public class Creator {
    public static Planet create() {
        return new Planet("Earth");
    }
}
