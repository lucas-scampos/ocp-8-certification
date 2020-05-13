package com.certification.dates_strings_localization;

import java.util.*;

/* Picking a resource boundle
  1. Zoo_fr_FR.java - the requested locale
  2. Zoo_fr_FR.properties - the requested locale
* 3. Zoo_fr.java - the requested locale WITHOUT country
  4. Zoo_fr.properties - the requested locale WITHOUT country
  5. Zoo_en_US.java - Default locale
  6. Zoo_en_US.properties - DEFAULT locale
* 7. Zoo_en.java - default locale WITHOUT country
* 8. Zoo_en.properties - default locale without country
  9. Zoo.java - no locale at all
  10. Zoo.properties - no locale at all
  11. throw MissingResourceException.
* */

public class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(france);
    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));

        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);
    }
}