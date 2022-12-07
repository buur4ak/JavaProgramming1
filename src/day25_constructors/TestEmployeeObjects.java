package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Khashavar", 32, 'M',"Java Developer",95000, LocalDate.of(2022,12,02));
        Employee e2 = new Employee("Mohammed", 31, 'M',"Project Manager",120000, LocalDate.of(2021,05,01));

        System.out.println(e1);
        System.out.println(e2);

    }


}
