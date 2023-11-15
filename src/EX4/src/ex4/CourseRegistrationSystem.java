package ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class CourseRegistrationSystem {
	private static List<User> users = new ArrayList<>();
	private static List<Course> courses = new ArrayList<>();
	private static List<Course> fullCourses = new ArrayList<>();
	private static String usersFileName = "userFile.csv";
	private static String coursesFileName = "courseFile.csv";
	private static String fullCoursesFileName = "fullCourseFile.csv";
	
	static List<Course> getCourses() {
		return courses;
	}
	static List<Course> getFullCourses() {
		return fullCourses;
	}
	static List<User> getUsers() {
		return users;
	}
	
	public static void main(String[] args) {
		createIfNotExists(usersFileName);
		createIfNotExists(coursesFileName);
		createIfNotExists(fullCoursesFileName);
		loadUserDataFromFile(users, usersFileName);
		loadCourseDataFromFile(courses, coursesFileName);
		loadCourseDataFromFile(fullCourses, fullCoursesFileName);
		int choose;
		do {
			showLoginMenu();
			choose = choose();
			switch(choose) {
			case 1:
				userLogin();
				break;
			case 2:
				userRegister();
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong number");
				break;
			}
		}
		while(choose != 3);
	}
	
	public static void showLoginMenu() {
		System.out.println("+ ---------------------------------------------------------- +");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.println("+ ---------------------------------------------------------- +");
	}
	public static void showAdminMenu() {
		System.out.println("+ ---------------------------------------------------------- +");
		System.out.println("Admin Menu");
		System.out.println("1. Create a new course");
		System.out.println("2. Delete a course");
		System.out.println("3. Edit a course (except for ID and name)");
		System.out.println("4. Display info for a course");
		System.out.println("5. Register a student");
		System.out.println("6. View all courses");
		System.out.println("7. View all full courses");
		System.out.println("8. Write to a file list of full courses");
		System.out.println("9. View names of students registered to a course");
		System.out.println("10. View list of courses a student is registered in");
		System.out.println("11. Sort courses by current # of students registered");
		System.out.println("12. Logout");
		System.out.println("+ ---------------------------------------------------------- +");
	}
	public static void showStudentMenu() {
		System.out.println("+ ---------------------------------------------------------- +");
		System.out.println("Student Menu");
		System.out.println("1. View all courses");
		System.out.println("2. View open courses");
		System.out.println("3. Register for a course");
		System.out.println("4. Withdraw from a course");
		System.out.println("5. View registered courses");
		System.out.println("6. Logout");
		System.out.println("+ ---------------------------------------------------------- +");
	}
	public static void showStaffMenu() {
		System.out.println("+ ---------------------------------------------------------- +");
		System.out.println("Staff Menu");
		System.out.println("1. View all courses");
		System.out.println("2. Register teaching in a course");
		System.out.println("3. Withdraw from a course");
		System.out.println("4. View all courses staff is registered in");
		System.out.println("5. Exit");
		System.out.println("+ ---------------------------------------------------------- +");
	}
	
	public static int choose() {
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select: ");
		choose = sc.nextInt();
		return choose;
	}
	
	public static void createIfNotExists(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Course findCourseByID(String courseID) {
		for (Course course : CourseRegistrationSystem.getCourses()) {
			if (course.getCourseID().equals(courseID)) {
				return course;
			}
		}
		return null; // Course not found
	}
	
	public static Student findStudentByID(String studentID) {
		for (User user : users) {
			if (user instanceof Student && user.getUsername().equals(studentID)) {
				return (Student) user;
			}
		}
		return null;
	}
	
	public static Staff findStaffByID(String staffID) {
		for (User user : users) {
			if (user instanceof Staff && user.getUsername().equals(staffID)) {
				return (Staff) user;
			}
		}
		return null;
	}
	
	public static Course findCourseByNameAndSection(String courseName, String section) {
		for (Course course : CourseRegistrationSystem.getCourses()) {
			if (course.getCourseName().equalsIgnoreCase(courseName) && course.getSection().equalsIgnoreCase(section)) {
				return course;
			}
		}
		return null;
	}
	
	public static List<Student> findStudentsByName(String firstName, String lastName) {
		List<Student> matchingStudents = new ArrayList<>();
		for(User user : users) {
			if(user instanceof Student) {
				Student student = (Student) user;
				if (student.getFirstName().equalsIgnoreCase(firstName) 
						&& student.getLastName().equalsIgnoreCase(lastName)) {
					matchingStudents.add(student);
					System.out.println(student.getFirstName() + " " +student.getLastName());
					}
				}
			}
		return matchingStudents;
	}
	
	public static void saveUserDataToFile(List<User> users, String filename) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			for (User user : users) {
				writer.println(user.getRole() + "," + user.toCSV());
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public static void loadUserDataFromFile(List<User> users, String filename){
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 6) {
					String role = parts[0];
					String username = parts[1];
					String password = parts[2];
					String firstName = parts[3];
					String middleName = parts[4];
					String lastName = parts[5];
					User user = null;
					switch (role) {
					case "Admin":
						user = new Admin(username, password, firstName, middleName, lastName);
						break;
					case "Student":
						user = new Student(username, password, firstName, middleName, lastName);
								break;
						case "Staff":
							user = new Staff(username, password, firstName, middleName, lastName);
									break;
							default:
								System.out.println("Invalid role detected in user data.");
					}
					if (user != null) {
						users.add(user);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveCourseDataToFile(List<Course> courses, String filename) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			for (Course course : courses) {
				writer.println(course.toCSV());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void loadCourseDataFromFile(List<Course> courses, String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 6) {
					String courseId = parts[0];
					String courseName = parts[1];
					int maxStudents = Integer.parseInt(parts[2]);
					int currentStudents = Integer.parseInt(parts[3]);
					String section = parts[4];
					String location = parts[5];
					Course course = new Course(courseId, courseName, maxStudents, section, location);
					String instructorID = (parts.length > 6) ? parts[6] : null;
					if (instructorID != null) {
						Staff staff = CourseRegistrationSystem.findStaffByID(instructorID);
						course.setInstructor(staff);
					}
					if (parts.length > 7 && !parts[7].isEmpty()) {
						String[] studentIDs = parts[7].split(";");
						course.enrolledStudentIDs.addAll(Arrays.asList(studentIDs));
						course.currentStudents = course.enrolledStudentIDs.size();
					}
					courses.add(course);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Login");
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		boolean loggedIn = false;
		for (User user : users) {
			if (user.getUsername().equals(username) &&
					user.getPassword().equals(password)) {
				System.out.println("Logged in as " + user.getRole());
				execute(user);
				loggedIn = true;
			}
		}
		if(loggedIn == false) {
			System.out.println("Invalid username or password");
		}
	}
	
	public static void userRegister() {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Registration");
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		boolean usernameExists = users.stream().anyMatch(user ->
		user.getUsername().equals(username));
		if (usernameExists) {
			System.out.println("Username already exists. Please choose a different username.");
			return;
		}
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter middle name: ");
		String middleName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Select your role:");
		System.out.println("1. Admin");
		System.out.println("2. Student");
		System.out.println("3. Staff");
		System.out.print("Enter your role (1/2/3): ");
		int roleChoice = sc.nextInt();
		User newUser = null;
		switch (roleChoice) {
		case 1:
			newUser = new Admin(username, password, firstName, middleName, lastName);
			break;
		case 2:
			newUser = new Student(username, password, firstName, middleName, lastName);
			break;
		case 3:
			newUser = new Staff(username, password, firstName, middleName, lastName);
			break;
		default:
			System.out.println("Invalid role selection.");
			return;
		}
		users.add(newUser);
		saveUserDataToFile(users, usersFileName);
		System.out.println("Registration as " + newUser.getRole() + "successful! You can now log in.");
	}
	
	public static void execute(User loggedInUser) {
		if (loggedInUser.getRole().equals("Admin")) { 
			Admin admin = (Admin) loggedInUser;
			int choose; 
			do {
				showAdminMenu(); 
				choose = choose(); 
				switch(choose) {
				case 1:
					createCourse(admin); break;
				case 2:
					deleteCourse(admin); break;
				case 3:
					editCourse(admin); break;
				case 4:
					displayCourse(admin); break;
				case 5:
					registerStudent(admin); break;
				case 6:
					viewAllCourses(admin); break;
				case 7:
					viewFullCourses(admin); break;
				case 8:
					writeFullCoursesToFile(admin); break;
				case 9:
					viewStudentsInCourse(admin); break;
				case 10:
					viewCoursesOfStudent(admin); break;
				case 11:
					sortCoursesByEnrollment(admin); break;
				case 12: break; 
				default:
				System.out.println("Wrong number admin"); break;
				}
			}
			while(choose != 12);
		}
		else if (loggedInUser.getRole().equals("Student")) { 
			Student student = (Student) loggedInUser;
			int choose; 
			do {
				showStudentMenu(); choose = choose(); 
				switch(choose) {
				case 1:
					viewAllCourses(student); break;
				case 2:
					viewOpenCourses(student); break;
				case 3:
					registerInCourse(student); break;
				case 4:
					withdrawFromCourse(student); break;
				case 5:
					viewRegisteredCourses(student); break;
				case 6:
					break;
				default:
					System.out.println("Wrong number student"); break;
				}
			}
			while(choose != 6);
		}
		else if (loggedInUser.getRole().equals("Student")) { 
			Student student = (Student) loggedInUser;
			int choose; 
			do {
				showStudentMenu(); 
				choose = choose();
				switch(choose) {
				case 1:
					viewAllCourses(student); break;
				case 2:
					viewOpenCourses(student); break;
				case 3:
					registerInCourse(student); break;
				case 4:
					withdrawFromCourse(student); break;
				case 5:
					viewRegisteredCourses(student); break;
				case 6:
					break; 
				default:
					System.out.println("Wrong number student"); break;
				}
			} while(choose != 6);
		}
		else if (loggedInUser.getRole().equals("Staff")) { 
			Staff staff = (Staff) loggedInUser;
			int choose; 
			do {
				showStaffMenu(); 
				choose = choose(); 
				switch(choose) {
					case 1:
						viewAllCourses(staff); break;
					case 2:
						registerInCourse(staff); break;
					case 3:
						withdrawFromCourse(staff); break;
					case 4:
						viewCoursesTeaching(staff); break;
					case 5:
						break; 
					default:
						System.out.println("Wrong number staff"); break;
				}
			}
			while(choose != 5);
		}
	}
	
	public static void createCourse(Admin admin) { 
		Course course = Course.inputCourse(); 
		admin.createCourse(course);
	    //System.out.println("Course count: " + courses.size()); 
	    saveCourseDataToFile(courses, coursesFileName);
	}
	
	public static void deleteCourse(Admin admin) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID: "); 
		String courseID = sc.nextLine(); 
		admin.deleteCourse(courseID);
		saveCourseDataToFile(courses, coursesFileName); 
		System.out.println("Course count: " + courses.size());
	}
	
	public static void editCourse(Admin admin) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Course ID: "); 
		String courseID = sc.nextLine(); 
		admin.editCourse(courseID);
		saveCourseDataToFile(courses, coursesFileName); 	
		System.out.println("Course count: " + courses.size());
	}
	
	public static void displayCourse(Admin admin) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Course ID: "); 
		String courseID = sc.nextLine(); 
		admin.displayCourse(courseID);
	}
	
	public static void registerStudent(Admin admin) { 
		Student student = Student.inputStudent(); 
		admin.registerStudent(student); 
		saveUserDataToFile(users, usersFileName);
	}
	
	public static void viewAllCourses(Admin admin) { 
		admin.viewAllCourses();
	}
	
	public static void viewFullCourses(Admin admin) { 
		admin.viewFullCourses();
	}

	public static void writeFullCoursesToFile(Admin admin) { 
		admin.writeFullCoursesToFile(fullCoursesFileName);
	}
	
	public static void viewStudentsInCourse(Admin admin) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Course ID: ");
		String courseID = sc.nextLine(); 
		admin.viewStudentsInCourse(courseID);
	}
	
	public static void viewCoursesOfStudent(Admin admin) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine(); 
		System.out.println("Enter last name: "); 
		String lastName = sc.nextLine();
		admin.viewCoursesOfStudent(firstName, lastName);
	}
	
	public static void sortCoursesByEnrollment(Admin admin) { 
		admin.sortCoursesByEnrollment();
	}
	
	public static void viewAllCourses(Student student) { 
		System.out.println("All courses:");
		student.viewAllCourses();
	}
	
	public static void viewOpenCourses(Student student) { 
		System.out.println("Open courses:"); 
		student.viewOpenCourses();
	}

	public static void registerInCourse(Student student) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter course name:");
		String courseName = sc.nextLine(); 
		System.out.println("Enter section:"); 
		String section = sc.nextLine();
		student.registerInCourse(courseName, section); 
		saveCourseDataToFile(courses, coursesFileName);
	}

	public static void withdrawFromCourse(Student student) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter course ID:");
		String courseID = sc.nextLine(); 
		student.withdrawFromCourse(courseID); 
		saveCourseDataToFile(courses, coursesFileName);
	}
	
	public static void viewRegisteredCourses(Student student) { 
		student.viewRegisteredCourses();
	}
	
	public static void viewAllCourses(Staff staff) { 
		System.out.println("All courses:"); 
		staff.viewAllCourses();
	}

	public static void registerInCourse(Staff staff) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter course name:"); 
		String courseName = sc.nextLine(); 
		System.out.println("Enter section:");
		String section = sc.nextLine(); 
		staff.registerTeaching(courseName, section);
		saveCourseDataToFile(courses, coursesFileName);
	}
	
	public static void withdrawFromCourse(Staff staff) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter course ID:");
		String courseID = sc.nextLine(); 
		staff.withdrawFromCourse(courseID); 
		saveCourseDataToFile(courses, coursesFileName);
	}
	
	public static void viewCoursesTeaching(Staff staff) { 
		staff.viewCoursesTeaching();
	}
}
