import java.util.List;

public class CourseReportGenerator {
    private final List<Course> courses;

    public CourseReportGenerator(List<Course> courses) {
        this.courses = courses;
    }

    public void generateAllAvailableCoursesReport() {
        System.out.println("Report of All Available Courses:");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Instructor: " + course.getInstructor());
            System.out.println("Maximum Capacity: " + course.getMaximumCapacity());
            System.out.println("--------------------");
        }
    }

    public void generateStudentsEnrolledInCourseReport(Course course) {
        List<Student> enrolledStudents = course.getEnrolledStudent();
        System.out.println("Report of Students Enrolled in " + course.getTitle() + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println("--------------------");
        }
    }
}
