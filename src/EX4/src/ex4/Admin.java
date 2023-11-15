package ex4;

import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.List; 
import java.util.Scanner;

public class Admin extends User implements AdminInterface {
	Admin( String username, String password, String firstName, String middleName, String lastName) {
		super(username, password, firstName, middleName, lastName);
	}

	@Override
	public void createCourse(Course course) { 
		CourseRegistrationSystem.getCourses().add(course);
	}

	@Override
	public void deleteCourse(String courseID) {
		for (Course course : CourseRegistrationSystem.getCourses()) { 
			if (course.getCourseID().equals(courseID)) {
				CourseRegistrationSystem.getCourses().remove(course); 
				System.out.println("Course deleted successfully."); 
				return;
			}
		}
		System.out.println("Course with ID " + courseID + " not found.");
	}
	
	@Override
	public void editCourse(String courseID) {
		for (Course course : CourseRegistrationSystem.getCourses()) { 
			if (course.getCourseID().equals(courseID)) {
				Scanner sc = new Scanner(System.in);
				String courseName = course.getCourseName(); 
				System.out.print("Max # of Students: "); 
				int maxStudents = sc.nextInt(); 
				sc.nextLine();
				System.out.print("Course Section #: "); 
				String sectionNumber = sc.nextLine(); 
				System.out.print("Course Location: "); 
				String location = sc.nextLine();
				Course editedCourse = new Course(courseID, courseName, maxStudents, sectionNumber, location);
				course.setCourseName(editedCourse.getCourseName()); 
				course.setMaxStudents(editedCourse.getMaxStudents()); 
				course.setSection(editedCourse.getSection()); 
				course.setLocation(editedCourse.getLocation()); 
				course.setInstructor(editedCourse.getInstructor());
				System.out.println("Course edited successfully."); 
				return;
			}
		}
		System.out.println("Course with ID " + courseID + " not found.");
	}

	@Override
	public void displayCourse(String courseId) {
		Course courseToDisplay = CourseRegistrationSystem.findCourseByID(courseId);
		if (courseToDisplay != null) { 
			System.out.println("Course Details:");
			System.out.println("Course ID: " + courseToDisplay.getCourseID()); 
			System.out.println("Course Name: " + courseToDisplay.getCourseName());
			System.out.println("Max Students: " + courseToDisplay.getMaxStudents());
			System.out.println("Current Students: " + courseToDisplay.getCurrentStudents());
			System.out.println("Section: " + courseToDisplay.getSection()); 
			System.out.println("Location: " + courseToDisplay.getLocation()); 
			if (courseToDisplay.getInstructor() != null) {
				System.out.println("Instructor: " + courseToDisplay.getInstructor());
			} else {
				System.out.println("Instructor: Not assigned");
			}
		} else {
			System.out.println("Course not found.");
		}
	}

	@Override
	public void registerStudent(Student student) { 
		Scanner sc = new Scanner(System.in); 
		boolean studentExists = CourseRegistrationSystem.getUsers().contains(student);
		if (!studentExists) {
			CourseRegistrationSystem.getUsers().add(student); System.out.println("Student " + student.getFirstName() + " " +
			student.getLastName() + " has been registered.");
			}
		else {
			System.out.println("Student with the specified username already exists.");
		}
		sc.nextLine();

	}
	
	@Override
	public void viewAllCourses() { 
		System.out.println("All courses:");
		for(Course course : CourseRegistrationSystem.getCourses()) { 
			System.out.println("Course ID: " + course.getCourseID()); 
			System.out.println("Course Name: " + course.getCourseName()); 
			System.out.println("Current Students: " +
			course.getCurrentStudents());
			System.out.println("Max Students Allowed: " + course.getMaxStudents());
			if (course.getInstructor() != null) { 
				System.out.println("Instructor: " + course.getInstructor());
			}
			else {
				System.out.println("Instructor: Not assigned");
			}
			if (!course.getEnrolledStudentIDs().isEmpty()) { 
				System.out.println("Enrolled Students:");
				for (String studentID : course.getEnrolledStudentIDs()) { 
					Student student = CourseRegistrationSystem.findStudentByID(studentID);
					if (student != null) {
						System.out.println(" Student Name: " + student.getFirstName() + " " + student.getLastName());
						System.out.println(" Student ID: " + student.getUsername());
					} else {
						System.out.println("No students enrolled in this course.");
					}
					System.out.println();
				}
			}
		}
	}
	
	@Override
	public void viewFullCourses() { 
		System.out.println("Full Courses:"); Boolean fullCourseExist = false;
		for(Course course : CourseRegistrationSystem.getCourses()) {
			if (course.isFull()) { 
				fullCourseExist = true;
				System.out.println("Course ID: " + course.getCourseID()); 
				System.out.println("Course Name: " + course.getCourseName()); 
				System.out.println("Current Students: " + course.getCurrentStudents());
				System.out.println("Max Students Allowed: " + course.getMaxStudents());
				if (!course.getEnrolledStudentIDs().isEmpty()) { 
					System.out.println("Enrolled Students:");
					for (String studentID : course.getEnrolledStudentIDs()) { 
						Student student = CourseRegistrationSystem.findStudentByID(studentID);
						if (student != null) {
							System.out.println(" Student Name: " +student.getFirstName() + " " + student.getLastName());
							System.out.println(" Student ID: " + student.getUsername());
						}
					}	
				} else {
					System.out.println("No students enrolled in this course.");
				}
				System.out.println();
			}
		}
		if (!fullCourseExist) {
			System.out.println("There are no full courses");
		}
	}
	
	@Override
	public void writeFullCoursesToFile(String fullCoursesFileName) { 
		try (PrintWriter writer = new PrintWriter(new FileWriter(fullCoursesFileName))) {
			for (Course course : CourseRegistrationSystem.getCourses()) { 
				if (course.isFull()) {
					writer.println(course.toCSV());
				}
			} 
		} catch (IOException e) { 
				e.printStackTrace();
		}
	}
	
	@Override
	public void viewStudentsInCourse(String courseID) { 
		Course courseToView = null;
		for (Course course : CourseRegistrationSystem.getCourses()) { 
			if (course.getCourseID().equals(courseID)) {
				courseToView = course; 
				break;
			}
		}
		if (courseToView != null) {
			System.out.println("Students registered in course " + courseID + "- " + courseToView.getCourseName() + ":");
			List<String> studentIDs = courseToView.getEnrolledStudentIDs(); 
			if (studentIDs.isEmpty()) {
				System.out.println("No students enrolled in this course."); 
				return;
			}
			for (String studentID : studentIDs) { 
				Student student = CourseRegistrationSystem.findStudentByID(studentID);
				if (student != null) { 
					System.out.println(student.getFirstName() + " " + student.getLastName() + " (ID: " + studentID + ")");
				}
			}
		} else {
			System.out.println("Course with ID " + courseID + " not found.");
		}
	}
		
	@Override
	public void viewCoursesOfStudent(String studentFirstName, String studentLastName) {
		List<Student> matchingStudents = CourseRegistrationSystem.findStudentsByName(studentFirstName, studentLastName);
		if (matchingStudents.isEmpty()) {
			System.out.println("No students found with the given name."); 
			return;
		}
		for (Student studentToView : matchingStudents) { 
			System.out.println("Student ID: " + studentToView.getUsername()); 
			System.out.println("Student Name: " + studentToView.getFirstName()+ " " + studentToView.getLastName());
			System.out.println("Courses:");
			for (Course course : CourseRegistrationSystem.getCourses()) { 
				if(course.getEnrolledStudentIDs().contains(studentToView.getUsername())) { 
					System.out.println(course.getCourseName() + " (ID: " + course.getCourseID() + ")");
				}
			}
			System.out.println();
		}
	}
	
	@Override
	public void sortCoursesByEnrollment() {
		Collections.sort(CourseRegistrationSystem.getCourses(), new Comparator<Course>() {
			@Override
			public int compare(Course course1, Course course2) {
				return Integer.compare(course2.getCurrentStudents(),
						course1.getCurrentStudents());
			}
		});
		System.out.println("Courses sorted by current # of students registered:");
		for (Course course : CourseRegistrationSystem.getCourses()) {
			System.out.println("Course ID: " + course.getCourseID());
			System.out.println("Course Name: " + course.getCourseName());
			System.out.println("Current Students: " + course.getCurrentStudents());
			System.out.println("Max Students: " + course.getMaxStudents());
			System.out.println();
		}
	}
}
