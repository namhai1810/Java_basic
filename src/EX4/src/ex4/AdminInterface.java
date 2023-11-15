package ex4;

public interface AdminInterface {
	void createCourse(Course course); 
	void deleteCourse(String courseId); 
	void editCourse(String courseID); 
	void displayCourse(String courseId); 
	void registerStudent(Student student); 
	void viewAllCourses();
	void viewFullCourses();
	void writeFullCoursesToFile(String fullCoursesFileName); 
	void viewStudentsInCourse(String courseID);
	void viewCoursesOfStudent(String studentFirstName, String studentLastName);
	void sortCoursesByEnrollment();

}
