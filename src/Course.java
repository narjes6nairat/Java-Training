import java.util.List;
import java.util.ArrayList;

public class Course {
    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public List<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public Course(String courseCode, String title, String instructor, int maximumCapacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        this.maximumCapacity = maximumCapacity;
        this.enrolledStudent = new ArrayList<>();
    }

    public void addStudent(Student student) {
        try {
            enrolledStudent.add(student);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeStudent(Student student) {
            enrolledStudent.remove(student);
    }

    private final String courseCode;
    private final String title;
    private final String instructor;
    private final int maximumCapacity;
    private final List<Student> enrolledStudent;
}
