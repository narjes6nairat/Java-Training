public class StudentReportGenerator {
    public void generateEnrolledCoursesReport(Student student) {
        System.out.println("Report of Courses for " + student.getName() + " is Enrolled:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Instructor: " + course.getInstructor());
            System.out.println("Maximum Capacity: " + course.getMaximumCapacity());
        }
    }
}