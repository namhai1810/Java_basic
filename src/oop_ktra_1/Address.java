package oop_ktra_1;
class Address {
    private String homeNo, street, district, city;

    public Address(String homeNo, String street, String city) {
        this.homeNo = homeNo;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return homeNo + " " + street + " " + city;
    }
}
