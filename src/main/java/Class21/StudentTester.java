package Class21;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudents("John",18,"45697"),
                              new CollegeStudent("Anna",25,"45687"),
                              new SchoolStudents("Ed",23,"4568")};

        for (Student student : students) {
            student.study();
            student.rest();
            student.walk();
        }
        Student st = new CollegeStudent("Hj",45,"4556");


    }
}
