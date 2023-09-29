public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student(1, "Narjes", "narjes@stu.najah.edu");
        Student student2 = new Student(2, "Shahd", "shahd@stu.najah.edu");
        Student student3 = new Student(3, "Ayan", "ayan@stu.najah.edu");

        Course course1 = new Course("10672307", "Advanced topics in software construction", "D. assaf", 30);
        Course course2 = new Course("10672308", "Software engineering", "D. assaf", 25);
        Course course3 = new Course("10672309", "Physics for Beginners", "Prof. Davis", 20);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);

        university.enrollStudentInCourse(1, "10672307");
        university.enrollStudentInCourse(1, "10672308");
        university.enrollStudentInCourse(2, "10672307");
        university.enrollStudentInCourse(3, "10672309");

        System.out.println("\n");
        university.generateAllReports();


        university.dropStudentFromCourse(1, "10672307");

        university.generateAllReports();
    }
}

