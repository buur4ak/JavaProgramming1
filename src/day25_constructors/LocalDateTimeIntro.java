package day25_constructors;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        java.time.LocalDateTime starts = java.time.LocalDateTime.now();

        System.out.println(starts);

        java.time.LocalDateTime ends = java.time.LocalDateTime.of(2023, 5, 18, 11, 0);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getHour());


    }

}

