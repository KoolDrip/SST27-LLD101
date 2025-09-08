package com.example.render;

public class App {
    public static void main(String[] args) {
        Renderer r = new Renderer();
        String text = "Hello Flyweight! ".repeat(2000);
        int cost = r.render(text);
        System.out.println("Cost=" + cost);

        TextStyleFactory f = r.getStyleFactory();
        TextStyle s1 = f.getTextStyle("Inter", 14, false);
        TextStyle s2 = f.getTextStyle("Inter", 14, false);
        TextStyle s3 = f.getTextStyle("Inter", 14, true);

        System.out.println("s1 == s2 (identical config)? " + (s1 == s2));
        System.out.println("s1 == s3 (different config)? " + (s1 == s3));
    }
}
