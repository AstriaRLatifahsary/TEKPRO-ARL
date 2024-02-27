public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 18);
        School school = new School("XYZ School", "123 Main St");

        school.admitStudent(student);
        student.study();
    }
}

