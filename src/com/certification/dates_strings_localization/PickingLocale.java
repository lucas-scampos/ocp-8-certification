package com.certification.dates_strings_localization;

import java.util.Locale;

/* fr -> language
   en_US -> language, country
*
*
* */
public class PickingLocale {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale l1 = new Locale.Builder() .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US") .setLanguage("en") .build();


        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA"); Locale frenchCanada = new Locale("fr", "CA");
    }
}
