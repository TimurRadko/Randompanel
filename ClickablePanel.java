package com.timurradko.randompanel;

public class ClickablePanel implements Clickable {
    @Override
    public void click() {
        System.out.println("Clicked");
    }
}
