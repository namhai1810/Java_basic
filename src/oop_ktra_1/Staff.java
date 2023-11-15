package oop_ktra_1;

class Staff extends Person {
  private String staffClass;

  public Staff(String id, Name name, Address address, String phone, String staffClass) {
    super(id, name, address, phone);
    this.staffClass = staffClass;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + staffClass;
  }
}
