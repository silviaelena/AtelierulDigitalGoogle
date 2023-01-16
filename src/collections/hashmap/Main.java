package collections.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        Student stud = new Student("1234567890", "Blaa");
        students.add(new Student("1234567891", "Ana"));
        students.add(new Student("1234567892", "Andrei"));
        students.add(new Student("1234567893", "Maria"));
        students.add(new Student("1234567894", "George"));
        students.add(stud);
        students.add(stud);
        students.add(stud);

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234567891");
        System.out.println(name);

        String name_error = sd.findStudentName("1234567898");
//        System.out.println(name_error);

        System.out.println(students);
        HashSet<Student> hashStudents = new HashSet<>(students);
        System.out.println(hashStudents);
    }
}
