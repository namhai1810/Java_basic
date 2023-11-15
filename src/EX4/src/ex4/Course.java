package ex4;

import java.util.ArrayList; 
import java.util.Scanner;

public class Course {
	String courseID;
	String courseName; 
	int maxStudents; 
	int currentStudents; 
	String section; 
	String location; 
	Staff instructor;
	ArrayList<String> enrolledStudentIDs;


	Course(String courseId, String courseName, int maxStudents, String section, String location) {
	this.courseID = courseId; 
	this.courseName = courseName; 
	this.maxStudents = maxStudents; 
	this.section = section; 
	this.location = location; 
	this.currentStudents = 0; 
	this.instructor = null;
	this.enrolledStudentIDs = new ArrayList<>();
	}


	Course(String courseId, String courseName, int maxStudents, String section, String location, Staff instructor) {
	this.courseID = courseId; 
	this.courseName = courseName; 
	this.maxStudents = maxStudents; 
	this.section = section; 
	this.location = location; 
	this.currentStudents = 0; 
	this.instructor = instructor;
	this.enrolledStudentIDs = new ArrayList<>();
	}

	public String getCourseID() { 
		return courseID;
	}
	
	public void setCourseID(String courseId) { 
		this.courseID = courseId;
	}

	public String getCourseName() { 
		return courseName;
	}

	public void setCourseName(String courseName) { 
		this.courseName = courseName;
	}

	public int getMaxStudents() { 
		return maxStudents;
	}
	
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	
	public int getCurrentStudents() {
		return currentStudents;
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public Staff getInstructor() { 
		return instructor;
	}

	public void setInstructor(Staff instructor) { 
		this.instructor = instructor;
	}

	public ArrayList<String> getEnrolledStudentIDs() { 
		return enrolledStudentIDs;
	}


	public void setEnrolledStudentIDs(ArrayList<String> enrolledStudentIDs) { 
		this.enrolledStudentIDs = enrolledStudentIDs;
	}
	
	public void addStudent(Student student) { 
		enrolledStudentIDs.add(student.getUsername());
	}

	public void removeStudent(Student student) { 
		enrolledStudentIDs.remove(student.getUsername());
	}

	public static Course inputCourse() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Information:"); 
		System.out.print("Course Name: ");
		String courseName = sc.nextLine();
		System.out.print("Course ID: "); 
		String courseId = sc.nextLine();
		System.out.print("Max # of Students: "); 
		int maxStudents = sc.nextInt(); sc.nextLine();
		System.out.print("Course Section #: "); 
		String sectionNumber = sc.nextLine(); 
		System.out.print("Course Location: "); 
		String location = sc.nextLine();
		Course course = new Course(courseId, courseName, maxStudents, sectionNumber, location);
		return course;
		}

	public String toCSV() {
		return courseID + "," + courseName + "," + maxStudents + "," + currentStudents + "," +
				section + "," + location + "," + (instructor != null ? instructor.getUsername() : "") + "," +
				String.join(";", enrolledStudentIDs);
	}

	public boolean isFull() {
		return currentStudents >= maxStudents;
	}
}
