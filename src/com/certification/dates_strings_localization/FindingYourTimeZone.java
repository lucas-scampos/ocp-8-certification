package com.certification.dates_strings_localization;

import java.time.ZoneId;

public class FindingYourTimeZone {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America")) .sorted().forEach(System.out::println);

    }
}
