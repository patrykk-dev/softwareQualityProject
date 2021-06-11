package builders;

import enums.Vaccine;
import entities.Patient;

public class PatientBuilder implements Builder {
    private Vaccine vaccine;
    private String firstName;
    private String lastName;
    private String city;
    private String zipCode;
    private String peselNumber;
    private String phoneNumber;

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
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

    public Patient getResult() {
        return new Patient(vaccine, firstName, lastName, city, zipCode, peselNumber, phoneNumber);
    }
}
