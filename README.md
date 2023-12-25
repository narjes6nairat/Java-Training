# Java Training: Student Enrollment System

In this project, I have created an application for a Student Enrollment System in Java. The design of the application takes into account principles of encapsulation, cohesion, and coupling. Below are descriptions of the key classes and their functionalities:

## Student Class
The `Student` class represents a student in the student enrollment system. It has the following attributes:

- `studentID`: The student's ID number.
- `name`: The student's name.
- `email`: The student's email address.
- `enrolledCourses`: A list of courses that the student is enrolled in.

The class provides the following methods:

- `getStudentID()`: Returns the student's ID number.
- `getName()`: Returns the student's name.
- `getEmail()`: Returns the student's email address.
- `getEnrolledCourses()`: Returns a list of courses that the student is enrolled in.
- `getEnrolledCourseTitles()`: Returns a list of the titles of the courses that the student is enrolled in.

## Course Class
The `Course` class represents a course in the student enrollment system. It has the following attributes:

- `courseCode`: The course's code.
- `title`: The course's title.
- `instructor`: The course's instructor.
- `maximumCapacity`: The maximum number of students that can enroll in the course.
- `enrolledStudents`: A list of students that are enrolled in the course.

The class provides the following methods:

- `getCourseCode()`: Returns the course's code.
- `getTitle()`: Returns the course's title.
- `getInstructor()`: Returns the course's instructor.
- `getMaximumCapacity()`: Returns the maximum number of students that can enroll in the course.
- `getEnrolledStudents()`: Returns a list of students that are enrolled in the course.
- `addStudent(Student student)`: Adds a student to the course's list of enrolled students.
- `removeStudent(Student student)`: Removes a student from the course's list of enrolled students.

## CourseReportGenerator Class
The `CourseReportGenerator` class is used to generate reports about courses in the student enrollment system. It has the following methods:

- `CourseReportGenerator(List<Course> courses)`: Constructor for the `CourseReportGenerator` class.
- `generateAllAvailableCoursesReport()`: Generates a report of all available courses in the student enrollment system.
- `generateStudentsEnrolledInCourseReport(Course course)`: Generates a report of all students enrolled in a given course.

## StudentReportGenerator Class
The `StudentReportGenerator` class is used to generate reports about students in the student enrollment system. It has the following methods:

- `generateEnrolledCoursesReport(List<Student> students, int studentID)`: Generates a report of all courses that a student is enrolled in, given the student's ID number.
- `generateEnrolledCoursesReport(Student student)`: Generates a report of all courses that a student is enrolled in, given the student object.

## University Class
The `University` class represents a university in the student enrollment system. It provides methods for adding and removing students and courses, enrolling and dropping students from courses, and generating reports about courses and students. It has the following methods:

- `addStudent(Student student)`: Adds a student to the university's list of enrolled students.
- `addCourse(Course course)`: Adds a course to the university's list of offered courses.
- `findStudent(int studentID)`: Finds a student by their ID number.
- `findCourse(String courseCode)`: Finds a course by its code.
- `enrollStudentInCourse(int studentID, String courseCode)`: Enrolls a student in a course.
- `dropStudentFromCourse(int studentID, String courseCode)`: Drops a student from a course.
- `generateAllReports()`: Generates reports about all courses and students in the university.
- `generateStudentEnrolledCoursesReport(int studentID)`: Generates a report of all courses that a student is enrolled in, given the student's ID number.

The `University` class ensures proper encapsulation, cohesion, and loose coupling between classes to maintain a well-organized and efficient student enrollment system.

---

This README provides an overview of the key classes and their functionalities in the Student Enrollment System application. You can refer to the individual class descriptions for more details on their attributes and methods.
