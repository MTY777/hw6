package com.company;

public class GrandFather {
    int age;
    private ColorHair colorHair;
    private double growth;
    private double weight;


    public GrandFather(int age, ColorHair colorHair, double growth, double weight) {
        this.age = age;
        this.colorHair = colorHair;
        this.growth = growth;
        this.weight = weight;
    }

    public int getAge(int age) {
        return this.age;
    }

    public ColorHair getColorHair(ColorHair colorHair) {
        return this.colorHair;
    }

    public double getGrowth(double growth) {
        return this.growth;
    }

    public double getWeight(double weight) {
        return this.weight;
    }
    public String getInfo() {
        return "Лет: " + age +
                "\nЦвет волос: " + colorHair +
                "\nРост: " + growth +
                "\nВес: " + weight ;
    }


}

