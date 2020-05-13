package com.certification.dates_strings_localization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithDuration {

    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);// PT24H
        Duration hourly = Duration.ofHours(1);// PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10);// PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1);// PT0.000000001S

        Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);


        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration)); // 2015–01–20T15
        System.out.println(time.plus(duration)); // 15
        System.out.println(date.plus(duration)); // UnsupportedTemporalException

    }
}
