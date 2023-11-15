package ex4;

import java.util.Scanner;

public class Student extends User implements StudentInterface{
	Student(String username, String password, String firstName, String middleName, String lastName) {
		super(username, password, firstName, middleName, lastName);
	}
	public static Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Information:");
		System.out.print("Username: ");
		String username = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();
		System.out.print("First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Middle Name: ");
		String middleName = sc.nextLine();
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();
		return new Student(username, password, firstName, middleName, lastName);
	}
	
	@Override
	public void viewAllCourses() {
		for (Course course : CourseRegistrationSystem.getCourses()) {
			System.out.println("Course ID: " + course.getCourseID());
			System.out.println("Course Name: " + course.getCourseName());
			System.out.println("Current Students: " + course.getCurrentStudents());
			System.out.println("Max Students Allowed: " + course.getMaxStudents());
			System.out.println("Section: " + course.getSection());
			System.out.println("Location: " + course.getLocation());
			if (course.getInstructor() != null) {
				System.out.println("Instructor: " + course.getInstructor());
			}
			else {
				System.out.println("Instructor: Not assigned");
			}
			if (course.getEnrolledStudentIDs().contains(this.getUsername())) {
				System.out.println("You are already enrolled in this course.");
			} else if (course.isFull()) {
				System.out.println("Course is full.");
			} else {
				System.out.println("You can enroll in this course.");
			}
			System.out.println();
		}
	}
	
	@Override
	public void viewOpenCourses() {
		for (Course course : CourseRegistrationSystem.getCourses()) {
			if (!course.getEnrolledStudentIDs().contains(this.getUsername()) && !course.isFull()) {
				System.out.println("Course ID: " + course.getCourseID());
				System.out.println("Course Name: " + course.getCourseName());
				System.out.println("Current Students: " + course.getCurrentStudents());
				System.out.println("Max Students Allowed: " + course.getMaxStudents());
				System.out.println("Section: " + course.getSection());
				System.out.println("Location: " + course.getLocation());
				if (course.getInstructor() != null) {
					System.out.println("Instructor: " +course.getInstructor());
				} else {
					System.out.println("Instructor: Not assigned");
				}
				System.out.println("You can enroll in this course.");
				System.out.println();
			}
		}
	}
	
	@Override
	public void registerInCourse(String courseName, String section) {
		Course courseToRegister = CourseRegistrationSystem.findCourseByNameAndSection(courseName, section);
		if (courseToRegister != null) {
			if (!courseToRegister.isFull()) {
				if(!courseToRegister.getEnrolledStudentIDs().contains(this.getUsername())) {
					courseToRegister.addStudent(this);
					courseToRegister.currentStudents += 1;
					System.out.println("You have successfully registered in the course: " + courseName);
				} else {
					System.out.println("You are already registered in the course: " + courseName);
				}
			}
			else {
				System.out.println("The course is already full: " + courseName);
			}
		}
		else {
			System.out.println("Course not found: " + courseName);
		}
	}
	
	@Override
	public void withdrawFromCourse(String courseID) {
		Course courseToWithdraw = CourseRegistrationSystem.findCourseByID(courseID);
		if (courseToWithdraw != null) {
			if
			(courseToWithdraw.getEnrolledStudentIDs().contains(this.getUsername())) {
				courseToWithdraw.removeStudent(this);
				System.out.println("You have successfully withdrawn from the course with ID: " + courseID);
			} else {
				System.out.println("You are not registered in the course with ID: " + courseID);
			}
		} else {
			System.out.println("Course not found with ID: " + courseID);
		}
	}
	
	@Override
	public void viewRegisteredCourses() {
		System.out.println("Registered Courses:");
		boolean foundRegisteredCourses = false;
		for (Course course : CourseRegistrationSystem.getCourses()) {
			if (course.getEnrolledStudentIDs().contains(this.getUsername())) {
				System.out.println("Course Name: " + course.getCourseName());
				System.out.println("Section: " + course.getSection());
		System.out.println("Instructor: " + (course.getInstructor() !=
				null ? course.getInstructor() : "Not assigned"));
		System.out.println("Location: " + course.getLocation());
		System.out.println();
		foundRegisteredCourses = true;
			}
		}
		if (!foundRegisteredCourses) {
			System.out.println("You are not registered in any courses.");
		}
	}

	

}
