package ex4;

public interface StudentInterface {
	void viewAllCourses();
	void viewOpenCourses();
	void registerInCourse(String courseName, String section); 
	void withdrawFromCourse(String courseName);
	void viewRegisteredCourses();
}
