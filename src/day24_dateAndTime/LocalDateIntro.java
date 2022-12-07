package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthDayAzra = LocalDate.of(2016,01,25);

        System.out.println("Azra's birthday = " + birthDayAzra);

        System.out.println("-------------------------------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(birthDayAzra.getDayOfWeek());
        System.out.println(birthDayAzra.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        System.out.println("-------------------------------------------------------------------");

        today = today.plusYears(1);

        System.out.println(today);

        System.out.println("-------------------------------------------------------------------");

        LocalDate graduationFate = LocalDate.of(2025,6,4);
        graduationFate = graduationFate.plusYears(2);
        System.out.println(graduationFate);
        graduationFate = graduationFate.plusMonths(7);
        System.out.println(graduationFate);
        graduationFate = graduationFate.plusWeeks(7);
        System.out.println(graduationFate);
        graduationFate = graduationFate.plusDays(100);
        System.out.println(graduationFate);

        System.out.println("-------------------------------------------------------------------");

        LocalDate KaanBirthday = LocalDate.of(2022,9,15);
        KaanBirthday = KaanBirthday.minusYears(2).minusMonths(2).minusDays(55);

        System.out.println(KaanBirthday);

        System.out.println("-------------------------------------------------------------------");

        LocalDate birthDay1 = LocalDate.of(1994,7,7);
        LocalDate birthDay2 = LocalDate.of(1995,6,7);

        boolean r1 = birthDay1.isEqual(birthDay2);
        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println( grad_date.isBefore( LocalDate.of(2022,12,31)));
        System.out.println( grad_date.isAfter( LocalDate.of(2022,12,31)));











    }


}
