package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void checkThatGetKittensReturn0() throws Exception {
        AlexLion alex = new AlexLion(feline);
        int actual = alex.getKittens();
        assertEquals(0, actual);
    }

    @Test
    public void checkThatDoesHaveManeReturnTrue() throws Exception {
        AlexLion alex = new AlexLion(feline);
        boolean actual = alex.doesHaveMane();
        assertEquals(true, actual);
    }

    @Test
    public void checkThatGetFoodReturnsPredator() throws Exception {
        AlexLion alex = new AlexLion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = alex.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void checkThatGetFriendsReturnAlexFriends() throws Exception {
        AlexLion alex = new AlexLion(feline);
        String expected = "зебра Марти, бегемотиха Глории и жираф Мелман";
        String actual = alex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void checkThatGetPlaceOfLivingReturnNewYork() throws Exception {
        AlexLion alex = new AlexLion(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}