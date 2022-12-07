package day26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup { // StudentsGroup HAS A Student

    public String groupName;
    public int groupId;
    public ArrayList<Student> students =new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { // creates the StudentsGroup object by setting the group name and group id
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); // size: 0

    }

    public void addStudent(Student student){ // takes one student object, and adds it to the arraylist of students
        students.add(student);
    }

    public void addStudent(String name, int age, char gender, String id){
        // takes name, age , gender, id of student, creates students object by usind the given info, then the student object to the array
        students.add(new Student(name, age , gender, id));

    }

    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
        // Takes the id and then removes the student object with the specified id from arraylist of students
            }


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}



/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */
