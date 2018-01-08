# 학습목표
자바(8) Date Time 학습
------------------------
## 1. Java Date Time APIs
### Java8 이전에는 Date를 표현 및 처리를 위하여 다음과 같은 Date 와 Calendar API들을 사용하였다.
----------------------------------
    java.util.Date             – date and time, print with default time-zone.
    java.util.Calendar         – date and time, more methods to manipulate date.
    java.text.SimpleDateFormat – formatting (date -> text), parsing (text -> date) for date and calendar.
### Java8에서는 date와 time API들이 java.time 패키지로 새로 만들어졌다.
    java.time.LocalDate         – date without time, no time-zone.
    java.time.LocalTime         – time without date, no time-zone.
    java.time.LocalDateTime     – date and time, no time-zone.
    java.time.ZonedDateTime     – date and time, with time-zone.
    java.time.DateTimeFormatter – formatting (date -> text), parsing (text -> date) for java.time
    java.time.Instant           – date and time for machine, seconds passed
                                  since the Unix epoch time (midnight of January 1, 1970 UTC)
    java.time.Duration          – Measures time in seconds and nanoseconds.
    java.time.Period            – Measures time in years, months and days.
    java.time.TemporalAdjuster  – Adjust date.
## 2. 학습목차
* 1.Java Date and Calendar examples
* 2.Java – How to compare dates
* 3.Java – How to get current date time
* 4.Java – How to get current timestamp
* 5.Java – How to convert String to a Date
* 6.Java – How to calculate elapsed time
* 7.Java 8 – How to convert String to LocalDate
* 8.Java 8 – How to format LocalDateTime
* 9.Java 8 – Convert Instant to LocalDateTime
* 10.Java 8 – Convert Instant to ZoneDateTime
* 11.Java 8 – Convert Date to LocalDate and LocalDateTime
* 12.Java 8 – ZonedDateTime examples
* 13.Java – Convert date and time between timezone
* 14.Java – Display all ZoneId and its UTC offset
* 15.Java 8 – Duration and Period examples
* 16.Java – How to add days to current date
* 17.Java 8 – TemporalAdjusters examples
* 18.Java 8 – MinguoDate examples (Taiwan calendar)
* 19.Java 8 – HijrahDate, How to calculate the Ramadan date (Islamic calendar)

-----------------------------------------------------------

스프링캠프 2017 D1 keynote
D1-A1 thread,nio,reactive
   CompletableFuture / Backpressure
D1-A2 Async&Spring

