package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkThatEatMeatReturnsListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void checkThatGetFamilyReturnsCat() {
        Feline feline = new Feline();
        assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void checkThatGetKittensReturnsQtyOfKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}