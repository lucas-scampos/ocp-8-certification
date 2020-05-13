package com.certification.advanced_class_design.review_questions;
/* Question 17
* */
public enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
    REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false); // Needs ;
    boolean hasHair;

    AnimalClasses(boolean hasHair) { //Cant have public modifier
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void giveWig() {
        hasHair = true;
    }
}