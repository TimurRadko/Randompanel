package com.timurradko.randompanel;

public class Button extends Controller implements Clickable {
    @Override
    public void click() {
        System.out.println("OK");
    }
}
