import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Student {
    private String name;
    private String group;
    private double grade;
    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public double getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", grade=" + grade +
                '}';
    }
}
class University {
    private List<Student> students;
    public University() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> sortStudentsByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public List<Student> filterStudentsByGrade(double minGrade) {
        return students.stream()
                .filter(student -> student.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }
    public void printStudents(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        University university = new University();
        
        university.addStudent(new Student("Alice", "CS101", 85.5));
        university.addStudent(new Student("Bob", "CS102", 74.0));
        university.addStudent(new Student("Charlie", "CS101", 90.0));
        university.addStudent(new Student("David", "CS103", 60.5));

        System.out.println("Список студентов (отсортированный по имени):");
        List<Student> sortedStudents = university.sortStudentsByName();
        university.printStudents(sortedStudents);

        System.out.println("\nСтуденты с оценкой выше 75:");
        List<Student> filteredStudents = university.filterStudentsByGrade(75.0);
        university.printStudents(filteredStudents);
    }
}
