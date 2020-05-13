package com.certification.design_paterns_and_principles;

/*
1. Use a constructor to set all properties of the object.
2. Mark all of the instance variables private and final.
3. Don’t define any setter methods.
4. Don’t allow referenced mutable objects to be modified or accessed directly.
5. Prevent methods from being overridden.
*
* */
import java.util.ArrayList;
import java.util.List;

public class AnimalImmutable {

    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public AnimalImmutable(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
}
