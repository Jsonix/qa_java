package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {

    @RunWith(Parameterized.class)
    public static class ParameterizedAnimalTest {

        private final String animalKind;
        private final List<String> animalFood;

        @Parameterized.Parameters
        public static Object[][] getAnimalData() {
            return new Object[][]{
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                    {"Травоядное", List.of("Трава", "Различные растения")},
            };
        }

        public ParameterizedAnimalTest(String animalKind, List<String> animalFood) {
            this.animalKind = animalKind;
            this.animalFood = animalFood;
        }

        @Test
        public void checkThatGetFoodReturnFood() throws Exception {
            Animal animal = new Animal();
            List<String> actual = animal.getFood(animalKind);
            assertEquals(animalFood, actual);
        }
    }

    public static class AllAnimalTest {

        @Test
        public void checkThatGetFoodReturnsException() {
            Exception exception = null;
            try {
                Animal animal = new Animal();
                animal.getFood("Не хищник");
            } catch (Exception ex) {
                exception = ex;
            }
            assertNotNull(exception);
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }

        @Test
        public void checkThatGetFamilyReturnAnimals() {
            Animal animal = new Animal();
            String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
            String actual = animal.getFamily();
            assertEquals(expected, actual);

        }
    }
}