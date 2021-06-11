package builders;

import enums.Position;
import entities.MedicalStaff;

public class MedicalStaffBuilder implements Builder {
    private Position position;
    private String firstName;
    private String lastName;
    private String city;
    private String zipCode;
    private String peselNumber;
    private String phoneNumber;

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setCiy(String city) {
        this.city = city;
    }

    @Override
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MedicalStaff getResult() {
        return new MedicalStaff(position, firstName, lastName, city, zipCode, peselNumber, phoneNumber);
    }
}
