package me.brunosantana.exam1.try2.package1;

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

//class NewsPaper extends Paper { //Line 12
abstract class NewsPaper extends Paper { //fix1
    public void setMargin() {}
    //public void setOrientation() {}//Line 14 //fix2
}

public class Test21{} //Just for compile
