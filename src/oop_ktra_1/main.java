package oop_ktra_1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Faculty> faculties = new ArrayList<>();
    static ArrayList<Staff> Staffs = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1. Enter new student");
        System.out.println("2. Enter new faculty");
        System.out.println("3. Enter new course");
        System.out.println("4. Enter new staff");

        System.out.println("5. Add new student to course");
        System.out.println("6. Add new faculty to course");
        System.out.println("7. Add new staff to course");
        System.out.println("8. Exit");
    }

    public static void inputStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.next();
        System.out.println("Enter student's full name");
        System.out.print("Enter first name: ");
        String fn = scanner.next();
        System.out.print("Enter middle name: ");
        String mn = scanner.next();
        System.out.print("Enter last name: ");
        String ln = scanner.next();
        Name name = new Name(fn, mn, ln);
        System.out.println("Enter student's address");
        System.out.print("Enter home number:");
        String num = scanner.next();
        System.out.print("Enter street name: ");
        String str = scanner.next();
        System.out.print("Enter district name:");
        String city = scanner.next();
        Address address = new Address(num, str, city);
        System.out.print("Enter student's class: ");
        String studentClass = scanner.next();
        System.out.print("Enter student's phone: ");
        String phone = scanner.next();
        Student student = new Student(id, name, address, phone, studentClass);
        students.add(student);
        System.out.println(student);
    }

    public static void inputFaculty() {
        System.out.print("Enter faculty ID: ");
        String id = scanner.next();
        System.out.println("Enter faculty's full name");
        System.out.print("Enter first name: ");
        String fn = scanner.next();
        System.out.print("Enter middle name: ");
        String mn = scanner.next();
        System.out.print("Enter last name: ");
        String ln = scanner.next();
        Name name = new Name(fn, mn, ln);
        System.out.println("Enter faculty's address");
        System.out.print("Enter home number:");
        String num = scanner.next();
        System.out.print("Enter street name: ");
        String str = scanner.next();
        System.out.print("Enter city name: ");
        String city = scanner.next();
        Address address = new Address(num, str, city);
        System.out.print("Enter faculty's job: ");
        String job = scanner.next();
        System.out.print("Enter faculty's phone: ");
        String phone = scanner.next();
        Faculty faculty = new Faculty(id, name, address, phone, job);
        faculties.add(faculty);
        System.out.println(faculty);
    }
    public static void inputStaff() {
        System.out.print("Enter Staff ID: ");
        String id = scanner.next();
        System.out.println("Enter Staff's full name");
        System.out.print("Enter first name: ");
        String fn = scanner.next();
        System.out.print("Enter middle name: ");
        String mn = scanner.next();
        System.out.print("Enter last name: ");
        String ln = scanner.next();
        Name name = new Name(fn, mn, ln);
        System.out.println("Enter Staff's address");
        System.out.print("Enter home number:");
        String num = scanner.next();
        System.out.print("Enter street name: ");
        String str = scanner.next();
        System.out.print("Enter city name: ");
        String city = scanner.next();
        Address address = new Address(num, str, city);
        System.out.print("Enter Staff's job: ");
        String job = scanner.next();
        System.out.print("Enter Staff's phone: ");
        String phone = scanner.next();
        Staff staff = new Staff(id, name, address, phone, job);
        Staffs.add(staff);
        System.out.println(staff);
    }
    public static void inputCourse() {
        System.out.print("Enter course ID: ");
        String id = scanner.next();
        System.out.print("Enter course's name: ");
        String name = scanner.next();
        System.out.print("Enter number of credits: ");
        int credits = scanner.nextInt();
        Course course = new Course(id, name, credits);
        courses.add(course);
    }

    public static Student findStudentByID(String id) {
        for (Student student : students) {
            if (student.toString().startsWith(id)) {
                return student;
            }
        }
        return null;
    }

    public static Faculty findFacultyByID(String id) {
        for (Faculty faculty : faculties) {
            if (faculty.toString().startsWith(id)) {
                return faculty;
            }
        }
        return null;
    }
    public static Staff findStaffByID(String id) {
        for (Staff staff : Staffs) {
            if (staff.toString().startsWith(id)) {
                return staff;
            }
        }
        return null;
    }

    public static Course findCourseByID(String id) {
        for (Course course : courses) {
            if (course.toString().startsWith(id)) {
                return course;
            }
        }
        return null;
    }

    public static void addStudentToCourse() {
        System.out.print("Enter student ID: ");
        String studentID = scanner.next();
        System.out.print("Enter course ID: ");
        String courseID = scanner.next();
        Student student = findStudentByID(studentID);
        Course course = findCourseByID(courseID);
        if (student != null && course != null) {
            course.addStudent(student);
            System.out.println("Added student to course successfully.");
        } else {
            System.out.println("Student or course not found.");
        }
    }

    public static void addFacultyToCourse() {
        System.out.print("Enter faculty ID: ");
        String facultyID = scanner.next();
        System.out.print("Enter course ID: ");
        String courseID = scanner.next();
        Faculty faculty = findFacultyByID(facultyID);
        Course course = findCourseByID(courseID);
        if (faculty != null && course != null) {
            course.addFaculty(faculty);
            System.out.println("Added faculty to course successfully.");
        } else {
            System.out.println("Faculty or course not found.");
        }
    }
    public static void addStaffToCourse() {
        System.out.print("Enter Staff ID: ");
        String StaffID = scanner.next();
        System.out.print("Enter course ID: ");
        String courseID = scanner.next();
        Staff staff = findStaffByID(StaffID);
        Course course = findCourseByID(courseID);
        if (staff != null && course != null) {
            course.addStaff(staff);
            System.out.println("Added Staff to course successfully.");
        } else {
            System.out.println("Faculty or course not found.");
        }
    }


    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    inputFaculty();
                    break;
                case 3:
                    inputCourse();
                    break;
                case 4:
                    inputStaff();
                    break;

                case 5:
                    addStudentToCourse();
                    break;

                case 6:
                    addFacultyToCourse();
                    break;
                case 7:
                    addStaffToCourse();
                    break;

                case 8:
                    System.out.println("Exit program!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
