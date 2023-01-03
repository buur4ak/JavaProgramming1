package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        // stu.age=-200;

        // System.out.println(student.age);

        student.setAge(55);

        System.out.println(student.getAge());


        // student.setName("Burak");

        System.out.println(student.getName());




    }

}
