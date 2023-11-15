
package oop_ktra_1;

class Faculty extends Person {
  private String job;

  public Faculty(String id, Name name, Address address, String phone, String job) {
    super(id, name, address, phone);
    this.job = job;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + job;
  }
}

