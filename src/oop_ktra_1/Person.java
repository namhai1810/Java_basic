package oop_ktra_1;

import java.util.ArrayList;

class Person {
  private Name name;
  private Address address;
  private String id;
  private String phone;
  private ArrayList<Course> courseList;

  public Person(String id, Name name, Address address, String phone) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.courseList = new ArrayList<>();
  }

  public void addCourse(Course course) {
    courseList.add(course);
  }

  public void showCourse() {
    for (Course course : courseList) {
      System.out.println(course);
    }
  }

  public void updatePhone(String newPhone) {
    this.phone = newPhone;
  }

  @Override
  public String toString() {
    return id + "\n" + name + "\n" + address + "\n" + phone;
  }
}