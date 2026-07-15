public class Main {

    public static void main(String[] args) {

        StudentOperations operations =
                new StudentOperations();

        operations.addStudent(
                new Student(101,
                "Arun",
                "MCA"));

        operations.addStudent(
                new Student(102,
                "Priya",
                "MCA"));

        operations.displayStudents();

        System.out.println();

        operations.searchStudent(101);
    }
}