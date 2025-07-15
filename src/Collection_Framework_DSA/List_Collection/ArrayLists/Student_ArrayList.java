package Collection_Framework_DSA.List_Collection.ArrayLists;

/*In this program, we have created a Student class.
Students, which are created S1, S2, and S3, are object references.
Those also can be added into the ArrayList. But the point is,
 you will not be able to see them properly. So if you want to see them,
  you have to override the two string methods of Object or you can create your own method,
  which is a print details to print the details.

 */

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }


    public void printDetails() {// Create method is must
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }
}
public class Student_ArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Ritwik","2");
        Student s3 = new Student("Shubham","3");

        List<Student> myStudents = new ArrayList();// add Arraaylist
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }

}
