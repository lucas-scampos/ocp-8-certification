package com.certification.dates_strings_localization;

import java.time.*;
import java.time.temporal.ChronoUnit;

/*
* You cannot convert a LocalDateTime to an Instant. Remember that an Instant is a point in time.
*
* */
public class WorkingWithInstants {

    public static void main(String[] args) {
        Instant now = Instant.now(); // do something time consuming
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());


        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2015–05–25T15:55:00Z

        Instant instant2 = Instant.ofEpochSecond(9123023123L);
        System.out.println(instant); // 2015–05–25T15:55:00Z
        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015–05–26T15:55:00Z
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour); // 2015–05–25T16:55:00Z
        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // exception

    }
}
