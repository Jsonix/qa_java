package com.example;

public class AlexLion extends Lion{
    private static final String sex = "Самец";
    boolean hasMane;

    public AlexLion(Feline feline) throws Exception {
        super(sex, feline);
    }

    public int getKittens() {
        return 0;
    }

    public String getFriends(){
        return "зебра Марти, бегемотиха Глории и жираф Мелман";
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
}
