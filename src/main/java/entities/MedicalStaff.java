package entities;

import enums.Position;

public class MedicalStaff {
    private final Position position;
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String zipCode;
    private final String peselNumber;
    private final String phoneNumber;

    public MedicalStaff(Position position, String firstName, String lastName, String city, String zipCode, String peselNumber, String phoneNumber) {
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zipCode = zipCode;
        this.peselNumber = peselNumber;
        this.phoneNumber = phoneNumber;
    }

    public Position getPosition() {
        return position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "MedicalStaff{" +
                "position=" + position +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
