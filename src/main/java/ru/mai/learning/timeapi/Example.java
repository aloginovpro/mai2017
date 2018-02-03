package ru.mai.learning.timeapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Example {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2018, 2, 3, 12, 0, 0);
        ZonedDateTime utc = ZonedDateTime.of(ldt1, ZoneId.of("UTC"));
        LocalDateTime ldt2 = LocalDateTime.of(2018, 2, 3, 15, 0, 0);

        Duration duration = Duration.between(ldt1, ldt2);
        ldt1 = ldt1.plus(1, ChronoUnit.HOURS);
    }

}
