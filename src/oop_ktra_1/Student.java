package oop_ktra_1;

class Student extends Person {
  private String studentClass;

  public Student(String id, Name name, Address address, String phone, String studentClass) {
    super(id, name, address, phone);
    this.studentClass = studentClass;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + studentClass;
  }
}
