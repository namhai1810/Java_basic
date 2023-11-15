//import java.util.List;
//
//public class Course {
//
//    private String courseName;
//    private String courseID;
//    private int maxQuantityRegister;
//    private List<String> nameOfStudent;
//    private String courseInstructor;
//    private String courseSection;
//    private String courseLocation;
//
//    public Course(String courseName, String courseID, int maxQuantityRegister, String courseInstructor, String courseSection, String courseLocation) {
//        this.courseName = courseName;
//        this.courseID = courseID;
//        this.maxQuantityRegister = maxQuantityRegister;
//        this.courseInstructor = courseInstructor;
//        this.courseSection = courseSection;
//        this.courseLocation = courseLocation;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public String getCourseID() {
//        return courseID;
//    }
//
//    public int getMaxQuantityRegister() {
//        return maxQuantityRegister;
//    }
//
//    public List<String> getNameOfStudent() {
//        return nameOfStudent;
//    }
//
//    public String getCourseInstructor() {
//        return courseInstructor;
//    }
//
//    public String getCourseSection() {
//        return courseSection;
//    }
//
//    public String getCourseLocation() {
//        return courseLocation;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public void setCourseID(String courseID) {
//        this.courseID = courseID;
//    }
//
//    public void setMaxQuantityRegister(int maxQuantityRegister) {
//        this.maxQuantityRegister = maxQuantityRegister;
//    }
//
//    public void setNameOfStudent(List<String> nameOfStudent) {
//        this.nameOfStudent = nameOfStudent;
//    }
//
//    public void setCourseInstructor(String courseInstructor) {
//        this.courseInstructor = courseInstructor;
//    }
//
//    public void setCourseSection(String courseSection) {
//        this.courseSection = courseSection;
//    }
//
//    public void setCourseLocation(String courseLocation) {
//        this.courseLocation = courseLocation;
//    }
//
//    @Override
//    public String toString() {
//        return "Course{" +
//                "courseName='" + courseName + '\'' +
//                ", courseID='" + courseID + '\'' +
//                ", maxQuantityRegister=" + maxQuantityRegister +
//                ", nameOfStudent=" + nameOfStudent +
//                ", courseInstructor='" + courseInstructor + '\'' +
//                ", courseSection='" + courseSection + '\'' +
//                ", courseLocation='" + courseLocation + '\'' +
//                '}';
//    }
//}
//
//    2. User class :
//public class User {
//
//    private String userName;
//    private String password;
//    private String firstName;
//    private String midName;
//    private String lastName;
//
//    public User(String userName, String password, String firstName, String midName, String lastName) {
//        this.userName = userName;
//        this.password = password;
//        this.firstName = firstName;
//        this.midName = midName;
//        this.lastName = lastName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getMidName() {
//        return midName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//}
//
//    3. Admin class :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Admin extends User {
//
//    public Admin(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//    public static void adminMenu() throws Exception {
//        AdminDaoImp adminDaoImp = new AdminDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Make your choice?");
//        System.out.println("1. Create new course");
//        System.out.println("2. Delete course");
//        System.out.println("3. Edit course");
//        System.out.println("4. Display course");
//        System.out.println("5. Register student");
//        System.out.println("6. Show all course");
//        System.out.println("7. View all full course");
//        System.out.println("8. View name of student");
//        System.out.println("9. View list of course");
//        System.out.println("10. Sort all courses");
//        switch (otp) {
//            case 1 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.createNewCourse(course);
//            }
//            case 2 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.deleteCourse(course);
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.editCourse(course);
//            }
//            case 4 -> {
//                adminDaoImp.displayCourse(scanner.next());
//            }
//            case 5 -> {
//                Student student = new Student(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.registerStudent(student, scanner.next());
//            }
//            case 6 -> {
//                adminDaoImp.viewAllCourse();
//            }
//            case 7 -> {
//                adminDaoImp.viewAllFullCourse();
//            }
//            case 8 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.viewNameOfStudent(course);
//            }
//            case 9 -> {
//                adminDaoImp.viewListOfCourse(scanner.next(), scanner.next());
//            }
//            case 10 -> {
//                adminDaoImp.sortCourse();
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//}
//
//interface AdminDao {
//    public void createNewCourse(Course course) throws Exception;
//    public void deleteCourse(Course course);
//    public void editCourse(Course course);
//    public void displayCourse(String courseID);
//    public void registerStudent(Student student, String courseID);
//    public void viewAllCourse();
//    public void viewAllFullCourse();
//    public void viewNameOfStudent(Course course);
//    public void viewListOfCourse(String firstName, String lastName);
//    public void sortCourse();
//}
//
//class AdminDaoImp implements AdminDao {
//    List<Course> courses;
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("course.csv"));
//
//
//    public AdminDaoImp() throws Exception {
//        courses = new ArrayList<>();
//    }
//
//    public void createNewCourse(Course course) throws Exception {
//        courses.add(course);
//        bufferedWriter.write(course.getCourseName() + course.getCourseID());
//        bufferedWriter.newLine();
//    }
//
//    public void deleteCourse(Course course) {
//        courses.remove(course);
//    }
//
//    public void editCourse(Course course) {
//        for (Course i : courses) {
//            if (i.getCourseID().equals(course.getCourseID())) {
//                courses.remove(i);
//                courses.add(course);
//                break;
//            }
//        }
//    }
//
//    public void displayCourse(String courseID) {
//        for (var i : courses) {
//            if (i.getCourseID().equals(courseID)) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//
//    public void registerStudent(Student student, String courseID) {
//        for (var i : courses) {
//            if (i.getCourseID().equals(courseID)) {
//
//            }
//        }
//    }
//
//    public void viewAllCourse() {
//        for (var i : courses) {
//            System.out.println(i);
//        }
//    }
//
//    public void viewAllFullCourse() {
//        for (var i : courses) {
//            if (i.getMaxQuantityRegister() == i.getNameOfStudent().size()) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public void viewNameOfStudent(Course course) {
//        for (var i : courses) {
//            if (i.equals(course)) {
//                for (var j : i.getNameOfStudent()) {
//                    System.out.println(j);
//                }
//            }
//        }
//    }
//
//    public void viewListOfCourse(String firstName, String lastName) {
//        for (var i : courses) {
//            for (var j : i.getNameOfStudent()) {
//                String words[] = j.split("\\s++");
//                if (words[0].equals(firstName) && words[2].equals(lastName)) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
//    }
//
//    public void sortCourse() {
//        courses.sort(new Comparator<Course>() {
//            @Override
//            public int compare(Course o1, Course o2) {
//                return Integer.compare(o1.getNameOfStudent().size(), o2.getNameOfStudent().size());
//            }
//        });
//    }
//}
//
//    4. Student class :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.List;
//import java.util.Scanner;
//
//public class Student extends User {
//
//    public Student(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//
//    @Override
//    public String getUserName() {
//        return super.getUserName();
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getFirstName() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public String getMidName() {
//        return super.getMidName();
//    }
//
//    @Override
//    public String getLastName() {
//        return super.getLastName();
//    }
//
//    public void studentMenu() throws Exception {
//        StudentDaoImp studentDaoImp = new StudentDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Make your choice?");
//        System.out.println("1. View all course");
//        System.out.println("2. View course that are not full");
//        System.out.println("3. Register course");
//        System.out.println("4. Withdraw course");
//        System.out.println("5. View all course that has register");
//        switch (otp) {
//            case 1 -> {
//                studentDaoImp.viewAllCourse();
//            }
//            case 2 -> {
//                studentDaoImp.coursesNotFull();
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                studentDaoImp.registerCourse(course, scanner.next());
//            }
//            case 4 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                studentDaoImp.withdrawCourse(scanner.next(), course);
//            }
//            case 5 -> {
//                studentDaoImp.viewAllCourseThatRegistered(scanner.next());
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//
//    interface StudentDao {
//        public void viewAllCourse();
//
//        public void coursesNotFull();
//
//        public void registerCourse(Course course, String name) throws Exception;
//
//        public void withdrawCourse(String name, Course course);
//
//        public void viewAllCourseThatRegistered(String name);
//    }
//
//    class StudentDaoImp implements StudentDao {
//
//        List<Course> courseList;
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CourseStudent.csv"));
//
//        StudentDaoImp() throws Exception {
//
//        }
//
//        public void viewAllCourse() {
//            for (var i : courseList) {
//                System.out.println(i);
//            }
//        }
//
//        public void coursesNotFull() {
//            for (var i : courseList) {
//                if (i.getMaxQuantityRegister() > i.getNameOfStudent().size()) {
//                    System.out.println(i);
//                }
//            }
//        }
//
//        public void registerCourse(Course course, String name) throws Exception {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().add(name);
//                    bufferedWriter.write(course.getCourseName() + " " + course.getCourseSection() + " " + name);
//                    bufferedWriter.newLine();
//                }
//            }
//        }
//
//        public void withdrawCourse(String name, Course course) {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().remove(name);
//                }
//            }
//        }
//
//        public void viewAllCourseThatRegistered(String name) {
//            for (var i : courseList) {
//                for (var j : i.getNameOfStudent()) {
//                    if (j.equals(name)) {
//                        System.out.println(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
//
////    5. Class Faculty :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Faculty extends User {
//
//    public Faculty(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//
//    @Override
//    public String getUserName() {
//        return super.getUserName();
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getFirstName() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public String getMidName() {
//        return super.getMidName();
//    }
//
//    @Override
//    public String getLastName() {
//        return super.getLastName();
//    }
//
//    public void facultyMenu() throws Exception {
//        FacultyDaoImp facultyDaoImp = new FacultyDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Make your choice?");
//        System.out.println("1. View all course");
//        System.out.println("2. Register teaching");
//        System.out.println("3. Withdraw course");
//        System.out.println("4. View all course that has register");
//        switch (otp) {
//            case 1 -> {
//                facultyDaoImp.viewAllCourse();
//            }
//            case 2 -> {
//                facultyDaoImp.registerTeaching(scanner.next(), scanner.next(), scanner.next());
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                facultyDaoImp.withdrawCourse(scanner.next(), course);
//            }
//            case 4 -> {
//                facultyDaoImp.viewAllCourseThatRegistered(scanner.next());
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//
//    interface FacultyDao {
//        public void viewAllCourse();
//
//        public void registerTeaching(String courseName, String section, String staffName) throws Exception;
//
//        public void withdrawCourse(String name, Course course);
//
//        public void viewAllCourseThatRegistered(String name);
//    }
//
//    class FacultyDaoImp implements FacultyDao {
//
//        List<Course> courseList;
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CourseStaff.csv"));
//
//        FacultyDaoImp() throws IOException {
//        }
//
//        public void viewAllCourse() {
//            for (var i : courseList) {
//                System.out.println(i);
//            }
//        }
//
//
//        public void registerTeaching(String courseName, String section, String staffName) throws Exception {
//
//            for (var i : courseList) {
//                if (i.getCourseName().equals(courseName) && i.getCourseSection().equals(section)) {
//                    bufferedWriter.write(courseName + " " + section + " " + staffName);
//                    bufferedWriter.newLine();
//                }
//            }
//        }
//
//        public void withdrawCourse(String name, Course course) {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().remove(name);
//                }
//            }
//        }
//
//        public void viewAllCourseThatRegistered(String name) {
//            for (var i : courseList) {
//                for (var j : i.getNameOfStudent()) {
//                    if (j.equals(name)) {
//                        System.out.println(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
//import java.util.List;
//
//public class Course {
//
//    private String courseName;
//    private String courseID;
//    private int maxQuantityRegister;
//    private List<String> nameOfStudent;
//    private String courseInstructor;
//    private String courseSection;
//    private String courseLocation;
//
//    public Course(String courseName, String courseID, int maxQuantityRegister, String courseInstructor, String courseSection, String courseLocation) {
//        this.courseName = courseName;
//        this.courseID = courseID;
//        this.maxQuantityRegister = maxQuantityRegister;
//        this.courseInstructor = courseInstructor;
//        this.courseSection = courseSection;
//        this.courseLocation = courseLocation;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public String getCourseID() {
//        return courseID;
//    }
//
//    public int getMaxQuantityRegister() {
//        return maxQuantityRegister;
//    }
//
//    public List<String> getNameOfStudent() {
//        return nameOfStudent;
//    }
//
//    public String getCourseInstructor() {
//        return courseInstructor;
//    }
//
//    public String getCourseSection() {
//        return courseSection;
//    }
//
//    public String getCourseLocation() {
//        return courseLocation;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public void setCourseID(String courseID) {
//        this.courseID = courseID;
//    }
//
//    public void setMaxQuantityRegister(int maxQuantityRegister) {
//        this.maxQuantityRegister = maxQuantityRegister;
//    }
//
//    public void setNameOfStudent(List<String> nameOfStudent) {
//        this.nameOfStudent = nameOfStudent;
//    }
//
//    public void setCourseInstructor(String courseInstructor) {
//        this.courseInstructor = courseInstructor;
//    }
//
//    public void setCourseSection(String courseSection) {
//        this.courseSection = courseSection;
//    }
//
//    public void setCourseLocation(String courseLocation) {
//        this.courseLocation = courseLocation;
//    }
//
//    @Override
//    public String toString() {
//        return "Course{" +
//                "courseName='" + courseName + '\'' +
//                ", courseID='" + courseID + '\'' +
//                ", maxQuantityRegister=" + maxQuantityRegister +
//                ", nameOfStudent=" + nameOfStudent +
//                ", courseInstructor='" + courseInstructor + '\'' +
//                ", courseSection='" + courseSection + '\'' +
//                ", courseLocation='" + courseLocation + '\'' +
//                '}';
//    }
//}
//
//    2. User class :
//public class User {
//
//    private String userName;
//    private String password;
//    private String firstName;
//    private String midName;
//    private String lastName;
//
//    public User(String userName, String password, String firstName, String midName, String lastName) {
//        this.userName = userName;
//        this.password = password;
//        this.firstName = firstName;
//        this.midName = midName;
//        this.lastName = lastName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getMidName() {
//        return midName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//}
//
//    3. Admin class :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Admin extends User {
//
//    public Admin(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//    public static void adminMenu() throws Exception {
//        AdminDaoImp adminDaoImp = new AdminDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Chọn KHÓA HỌC bạn muốn thực hiện?");
//        System.out.println("1. Tạo Khóa học");
//        System.out.println("2. Xóa khóa học");
//        System.out.println("3. Sửa khóa học");
//        System.out.println("4. Khóa học");
//        System.out.println("5. Đăng ký");
//        System.out.println("6. Xem khóa học");
//        System.out.println("7. Xem tất cả khóa học");
//        System.out.println("8. Xem tên học sinh");
//        System.out.println("9. Xem danh sách học sinh");
//        System.out.println("10. Sap xep khoa hoc");
//        switch (otp) {
//            case 1 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.createNewCourse(course);
//            }
//            case 2 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.deleteCourse(course);
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.editCourse(course);
//            }
//            case 4 -> {
//                adminDaoImp.displayCourse(scanner.next());
//            }
//            case 5 -> {
//                Student student = new Student(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.registerStudent(student, scanner.next());
//            }
//            case 6 -> {
//                adminDaoImp.viewAllCourse();
//            }
//            case 7 -> {
//                adminDaoImp.viewAllFullCourse();
//            }
//            case 8 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                adminDaoImp.viewNameOfStudent(course);
//            }
//            case 9 -> {
//                adminDaoImp.viewListOfCourse(scanner.next(), scanner.next());
//            }
//            case 10 -> {
//                adminDaoImp.sortCourse();
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//}
//
//interface AdminDao {
//    public void createNewCourse(Course course) throws Exception;
//    public void deleteCourse(Course course);
//    public void editCourse(Course course);
//    public void displayCourse(String courseID);
//    public void registerStudent(Student student, String courseID);
//    public void viewAllCourse();
//    public void viewAllFullCourse();
//    public void viewNameOfStudent(Course course);
//    public void viewListOfCourse(String firstName, String lastName);
//    public void sortCourse();
//}
//
//class AdminDaoImp implements AdminDao {
//    List<Course> courses;
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("course.csv"));
//
//
//    public AdminDaoImp() throws Exception {
//        courses = new ArrayList<>();
//    }
//
//    public void createNewCourse(Course course) throws Exception {
//        courses.add(course);
//        bufferedWriter.write(course.getCourseName() + course.getCourseID());
//        bufferedWriter.newLine();
//    }
//
//    public void deleteCourse(Course course) {
//        courses.remove(course);
//    }
//
//    public void editCourse(Course course) {
//        for (Course i : courses) {
//            if (i.getCourseID().equals(course.getCourseID())) {
//                courses.remove(i);
//                courses.add(course);
//                break;
//            }
//        }
//    }
//
//    public void displayCourse(String courseID) {
//        for (var i : courses) {
//            if (i.getCourseID().equals(courseID)) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//
//    public void registerStudent(Student student, String courseID) {
//        for (var i : courses) {
//            if (i.getCourseID().equals(courseID)) {
//
//            }
//        }
//    }
//
//    public void viewAllCourse() {
//        for (var i : courses) {
//            System.out.println(i);
//        }
//    }
//
//    public void viewAllFullCourse() {
//        for (var i : courses) {
//            if (i.getMaxQuantityRegister() == i.getNameOfStudent().size()) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public void viewNameOfStudent(Course course) {
//        for (var i : courses) {
//            if (i.equals(course)) {
//                for (var j : i.getNameOfStudent()) {
//                    System.out.println(j);
//                }
//            }
//        }
//    }
//
//    public void viewListOfCourse(String firstName, String lastName) {
//        for (var i : courses) {
//            for (var j : i.getNameOfStudent()) {
//                String words[] = j.split("\\s++");
//                if (words[0].equals(firstName) && words[2].equals(lastName)) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
//    }
//
//    public void sortCourse() {
//        courses.sort(new Comparator<Course>() {
//            @Override
//            public int compare(Course o1, Course o2) {
//                return Integer.compare(o1.getNameOfStudent().size(), o2.getNameOfStudent().size());
//            }
//        });
//    }
//}
//
//    4. Student class :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.List;
//import java.util.Scanner;
//
//public class Student extends User {
//
//    public Student(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//
//    @Override
//    public String getUserName() {
//        return super.getUserName();
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getFirstName() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public String getMidName() {
//        return super.getMidName();
//    }
//
//    @Override
//    public String getLastName() {
//        return super.getLastName();
//    }
//
//    public void studentMenu() throws Exception {
//        StudentDaoImp studentDaoImp = new StudentDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Make your choice?");
//        System.out.println("1. View all course");
//        System.out.println("2. View course that are not full");
//        System.out.println("3. Register course");
//        System.out.println("4. Withdraw course");
//        System.out.println("5. View all course that has register");
//        switch (otp) {
//            case 1 -> {
//                studentDaoImp.viewAllCourse();
//            }
//            case 2 -> {
//                studentDaoImp.coursesNotFull();
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                studentDaoImp.registerCourse(course, scanner.next());
//            }
//            case 4 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                studentDaoImp.withdrawCourse(scanner.next(), course);
//            }
//            case 5 -> {
//                studentDaoImp.viewAllCourseThatRegistered(scanner.next());
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//
//    interface StudentDao {
//        public void viewAllCourse();
//
//        public void coursesNotFull();
//
//        public void registerCourse(Course course, String name) throws Exception;
//
//        public void withdrawCourse(String name, Course course);
//
//        public void viewAllCourseThatRegistered(String name);
//    }
//
//    class StudentDaoImp implements StudentDao {
//
//        List<Course> courseList;
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CourseStudent.csv"));
//
//        StudentDaoImp() throws Exception {
//
//        }
//
//        public void viewAllCourse() {
//            for (var i : courseList) {
//                System.out.println(i);
//            }
//        }
//
//        public void coursesNotFull() {
//            for (var i : courseList) {
//                if (i.getMaxQuantityRegister() > i.getNameOfStudent().size()) {
//                    System.out.println(i);
//                }
//            }
//        }
//
//        public void registerCourse(Course course, String name) throws Exception {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().add(name);
//                    bufferedWriter.write(course.getCourseName() + " " + course.getCourseSection() + " " + name);
//                    bufferedWriter.newLine();
//                }
//            }
//        }
//
//        public void withdrawCourse(String name, Course course) {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().remove(name);
//                }
//            }
//        }
//
//        public void viewAllCourseThatRegistered(String name) {
//            for (var i : courseList) {
//                for (var j : i.getNameOfStudent()) {
//                    if (j.equals(name)) {
//                        System.out.println(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
//
//    5. Class Faculty :
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Faculty extends User {
//
//    public Faculty(String userName, String password, String firstName, String midName, String lastName) {
//        super(userName, password, firstName, midName, lastName);
//    }
//
//    @Override
//    public String getUserName() {
//        return super.getUserName();
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getFirstName() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public String getMidName() {
//        return super.getMidName();
//    }
//
//    @Override
//    public String getLastName() {
//        return super.getLastName();
//    }
//
//    public void facultyMenu() throws Exception {
//        FacultyDaoImp facultyDaoImp = new FacultyDaoImp();
//        Scanner scanner = new Scanner(System.in);
//        int otp = scanner.nextInt();
//        System.out.println("Make your choice?");
//        System.out.println("1. View all course");
//        System.out.println("2. Register teaching");
//        System.out.println("3. Withdraw course");
//        System.out.println("4. View all course that has register");
//        switch (otp) {
//            case 1 -> {
//                facultyDaoImp.viewAllCourse();
//            }
//            case 2 -> {
//                facultyDaoImp.registerTeaching(scanner.next(), scanner.next(), scanner.next());
//            }
//            case 3 -> {
//                Course course = new Course(scanner.nextLine(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
//                facultyDaoImp.withdrawCourse(scanner.next(), course);
//            }
//            case 4 -> {
//                facultyDaoImp.viewAllCourseThatRegistered(scanner.next());
//            }
//            default -> System.out.println("Invalid option");
//        }
//    }
//
//    interface FacultyDao {
//        public void viewAllCourse();
//
//        public void registerTeaching(String courseName, String section, String staffName) throws Exception;
//
//        public void withdrawCourse(String name, Course course);
//
//        public void viewAllCourseThatRegistered(String name);
//    }
//
//    class FacultyDaoImp implements FacultyDao {
//
//        List<Course> courseList;
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CourseStaff.csv"));
//
//        FacultyDaoImp() throws IOException {
//        }
//
//        public void viewAllCourse() {
//            for (var i : courseList) {
//                System.out.println(i);
//            }
//        }
//
//
//        public void registerTeaching(String courseName, String section, String staffName) throws Exception {
//
//            for (var i : courseList) {
//                if (i.getCourseName().equals(courseName) && i.getCourseSection().equals(section)) {
//                    bufferedWriter.write(courseName + " " + section + " " + staffName);
//                    bufferedWriter.newLine();
//                }
//            }
//        }
//
//        public void withdrawCourse(String name, Course course) {
//            for (var i : courseList) {
//                if (i.equals(course)) {
//                    i.getNameOfStudent().remove(name);
//                }
//            }
//        }
//
//        public void viewAllCourseThatRegistered(String name) {
//            for (var i : courseList) {
//                for (var j : i.getNameOfStudent()) {
//                    if (j.equals(name)) {
//                        System.out.println(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
