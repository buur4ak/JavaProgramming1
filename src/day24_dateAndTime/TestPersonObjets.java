package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjets {

    public static void main(String[] args) {

        Person[] people = { new Person(),new Person(),new Person(),new Person(),new Person() };
        people[0].setInfo("Burak",'M', LocalDate.of(1987,4,13));





        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people ));



        // print name & birth of each person objects


        // remove all the person object that has the age > 55




    }

}
