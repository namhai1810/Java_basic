package oop_ktra_1;

import java.util.ArrayList;

class Course {
private String id;
private String name;
private int credit;
private ArrayList<Student> students;
private ArrayList<Faculty> facultyList;

private ArrayList<Staff> StaffList;

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.students = new ArrayList<>();
        this.facultyList = new ArrayList<>();
        this.StaffList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }
    public void addStaff(Staff Staff) {
        StaffList.add(Staff);
    }


@Override
    public String toString() {
        return id + " " + name;
    }
}
