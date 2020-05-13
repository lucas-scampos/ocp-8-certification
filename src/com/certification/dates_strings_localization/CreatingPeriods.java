package com.certification.dates_strings_localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/*
 *  P1Y2M3D
 *
 *  P -> mandatory
 *  Y -> YEAR
 *  M -> MONTH
 *  D -> DAY
 *  Java omits any measurements that are 0
 *  Period.ofMonths(3) -> P3M
 *  Period.of(0, 20, 47) -> P20M47D
 *  Period.ofWeeks(3) -> P21D
 * */
public class CreatingPeriods {

    public static void main(String[] args) {
        Period annually = Period.ofYears(1);// every 1 year
        Period quarterly = Period.ofMonths(3);// every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2);// every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7);// every year and 7 days
        //Cant chain creating periods
        Period wrong = Period.ofYears(1).ofWeeks(1); // every week


        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015–02–20
        System.out.println(dateTime.plus(period)); // 2015–02–20T15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException

    }
}
