package ex4;

public class Staff extends User implements StaffInterface  {
	Staff(String username, String password, String firstName, String middleName, String lastName) {
		super(username, password, firstName, middleName, lastName);
	}
	
	@Override
	public void viewAllCourses() {
		for(Course course : CourseRegistrationSystem.getCourses()) {
			System.out.println("Course ID: " + course.getCourseID());
			System.out.println("Course Name: " + course.getCourseName());
			System.out.println("Current Students: " +
					course.getCurrentStudents());
			System.out.println("Max Students Allowed: " +
					course.getMaxStudents());
			System.out.println("Section: " + course.getSection());
			System.out.println("Location: " + course.getLocation());
			if (course.getInstructor() != null) {
				System.out.println("Instructor: " +
						course.getInstructor().getFirstName() + " " +
						course.getInstructor().getLastName());
			}
			else {
				System.out.println("Instructor: Not assigned");
			}
			System.out.println();
		}
	}
	
	@Override
	public void registerTeaching(String courseName, String section) {
		Course courseToTeach = CourseRegistrationSystem.findCourseByNameAndSection(courseName, section);
		if (courseToTeach != null) {
			if (courseToTeach.getInstructor() != null) {
				System.out.println("The course " + courseName + " already has an instructor.");
			} else {
				courseToTeach.setInstructor(this);
				System.out.println("You have been registered as the instructor for the course " + courseName);
			}
		} else {
			System.out.println("Course " + courseName + " not found.");
		}
	}
	
	@Override
	public void withdrawFromCourse(String courseID) {
		Course courseToWithdrawFrom = CourseRegistrationSystem.findCourseByID(courseID);
		if (courseToWithdrawFrom != null) {
			if (this == courseToWithdrawFrom.getInstructor()) {
				courseToWithdrawFrom.setInstructor(null);
				System.out.println("You have withdrawn from teaching the course " + courseToWithdrawFrom.getCourseName() + " (ID: " + courseID + ").");
			} else {
				System.out.println("You are not the instructor for the course" + courseToWithdrawFrom.getCourseName() + " (ID: " + courseID + ").");
			}
		} else {
			System.out.println("Course with ID " + courseID + " not found.");
		}
	}
	
	@Override
	public void viewCoursesTeaching() {
		boolean foundCourses = false;
		for (Course course : CourseRegistrationSystem.getCourses()) {
			if (this == course.getInstructor()) {
				System.out.println("Course ID: " + course.getCourseID());
				System.out.println("Course Name: " + course.getCourseName());
				System.out.println("Section: " + course.getSection());
				System.out.println("Location: " + course.getLocation());
				System.out.println("Max Students Allowed: " + course.getMaxStudents());
				System.out.println("Current Students: " + course.getCurrentStudents());
				if (!course.getEnrolledStudentIDs().isEmpty()) {
					System.out.println("Enrolled Students:");
					for (String studentID : course.getEnrolledStudentIDs()) {
						Student student = CourseRegistrationSystem.findStudentByID(studentID);
						if (student != null) {
							System.out.println(" Student Name: " + student.getFirstName() + " " + student.getLastName());
							System.out.println(" Student ID: " + student.getUsername());
						}
					}
				}
				else {
					System.out.println("No students enrolled in this course.");
				}
				System.out.println();
				foundCourses = true;
			}
		}
		if (!foundCourses) {
			System.out.println("You are not currently teaching any courses.");
		}
	}
}
