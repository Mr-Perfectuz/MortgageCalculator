package com.me;

public class TextBox extends UIControl {
    private String text = ""; // Field


    @Override
    public String toString() {
        return text;

    }

    @Override
    public void render() {
//        System.out.println("Rander TextBox ");
        }

    public void  setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
}
