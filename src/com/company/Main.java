package com.company;

public class Main {

    public static void main(String[] args) {
        Father father = new Father(39, ColorHair.BROWN, 179.5, 84.3, "Bisnessman");
        System.out.println( father.getInfo());
        System.out.println("__________________________");
        Son son = new Son(12, ColorHair.BLACK, 155.4, 40.2);
        System.out.println(son.getInfo());
        System.out.println("__________________________");
        Son son1 = new Son(18, ColorHair.WHITE, 189.9, 73.4);
        System.out.println( son1.getInfo());

    }
}


