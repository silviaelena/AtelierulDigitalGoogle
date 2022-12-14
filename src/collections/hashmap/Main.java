package collections.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        students.add(new Student("1234567891", "Ana"));
        students.add(new Student("1234567892", "Andrei"));
        students.add(new Student("1234567893", "Maria"));
        students.add(new Student("1234567894", "George"));

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234567891");
        System.out.println(name);

        String name_error = sd.findStudentName("1234567898");
//        System.out.println(name_error);
    }
}
