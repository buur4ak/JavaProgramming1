package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Burak",35,'M',"Java Developer",95000,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Sumeye",28,'F',"Back-end Developer",98000,"B13");

        Employee employee3 = new Employee();
        employee3.setInfo("Kaan",21,'M',"Data Engineer",110000,"B14");


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.work();






    }

}
