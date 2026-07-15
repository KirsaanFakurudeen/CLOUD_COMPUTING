import java.util.*
class StudentOperations {
    System.out.println("Enter the number of students:");
}
public void searchStudent(int id) {
    for (Student student : students) {
        if (student.getId() == id) {
            System.out.println("\nStudent Found!");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            return;
        }
    }
    System.out.println("Student not found.");
}
// java code