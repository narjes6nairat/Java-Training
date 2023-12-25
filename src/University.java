import java.util.ArrayList;
import java.util.List;

public class University {

    public void addStudent(Student student) {
        try {
            students.add(student);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalStateException("maximum capacity reached");
        }
    }

    public void addCourse(Course course) {
        try {
            courses.add(course);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalStateException("maximum capacity reached");
        }
    }

    private Student findStudent(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    private Course findCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
    public void enrollStudentInCourse(int studentID, String courseCode) {
        Student student = findStudent(studentID);
        Course course = findCourse(courseCode);
        try {
            if (student != null && course != null) {
                course.addStudent(student);
            }
        } catch (Exception e) {
            System.out.println("error to enroll student in course: " + e.getMessage());
        }
    }

    public void dropStudentFromCourse(int studentID, String courseCode) {
        Student student = findStudent(studentID);
        Course course = findCourse(courseCode);
        try {
            if (student != null && course != null) {
                course.removeStudent(student);
            }
        } catch (Exception e) {
            System.out.println("Error to drop student from course: " + e.getMessage());
        }
    }
    public void generateAllReports() {
        CourseReportGenerator courseReportGenerator = new CourseReportGenerator(courses);
        StudentReportGenerator studentReportGenerator = new StudentReportGenerator();

        courseReportGenerator.generateAllAvailableCoursesReport();

        for (Student student : students) {
            studentReportGenerator.generateEnrolledCoursesReport(student);
        }

        for (Course course : courses) {
            courseReportGenerator.generateStudentsEnrolledInCourseReport(course);
        }
    }
    private final List<Student> students= new ArrayList<>();
    private final List<Course> courses= new ArrayList<>();
}
