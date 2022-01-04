package com.company;

public class Father extends GrandFather {
    private String work;

    public Father(int age, ColorHair colorHair, double growth, double weight) {
        super(age, colorHair, growth, weight);
        this.work = work;
    }

    public Father(int age, ColorHair colorHair, double growth, double weight, String work){
        super(age, colorHair, growth, weight);
    }

    public String getWork() {
        return work;
    }
    @Override
    public final String getInfo() {
        return super.getInfo() +
                "\nРабота: " + work;
    }

}
