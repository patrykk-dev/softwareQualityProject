import enums.Position;
import enums.Vaccine;
import builders.MedicalStaffBuilder;
import builders.PatientBuilder;
import entities.MedicalStaff;
import entities.Patient;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controls controls = new Controls(scanner);

        List<Patient> registeredPatients = new ArrayList<>();
        List<MedicalStaff> registeredMedicalStaff = new ArrayList<>();
        StringBuilder stringToSave = new StringBuilder();
//        RegistrationDirector registrationDirector = new RegistrationDirector();

        if (controls.categoryScreen() == 1) {
            MedicalStaffBuilder medicalStaffBuilder = new MedicalStaffBuilder();
            medicalStaffBuilder.setPosition(Position.values()[controls.medicalStuffScreen() - 1]);
            medicalStaffBuilder.setCiy(controls.cityScreen());
            medicalStaffBuilder.setZipCode(controls.zipCodeScreen());
            List<String> details;

            do {
                details = controls.detailsScreen();
                medicalStaffBuilder.setFirstName(details.get(0));
                medicalStaffBuilder.setLastName(details.get(1));
                medicalStaffBuilder.setPeselNumber(details.get(2));
                medicalStaffBuilder.setPhoneNumber(details.get(3));

                registeredMedicalStaff.add(medicalStaffBuilder.getResult());

            } while (details.get(4).equals("tak"));

            System.out.println("Lista dodanych wpisów dla " + registeredMedicalStaff.get(0).getCity() + " (" + registeredMedicalStaff.get(0).getZipCode() + ")\n");


            for (MedicalStaff medicalStaff : registeredMedicalStaff) {
                System.out.println(medicalStaff.getFirstName());
                System.out.println(medicalStaff.getLastName());
                System.out.println(medicalStaff.getPosition());
                System.out.println(medicalStaff.getPeselNumber());
                System.out.println(medicalStaff.getPhoneNumber());
                System.out.println("-----");
                stringToSave.append(medicalStaff.toString());
            }
            FileManager.saveFile(stringToSave.toString(),"medicalStaff");
        } else {
            PatientBuilder patientBuilder = new PatientBuilder();
            patientBuilder.setVaccine(Vaccine.values()[controls.patientScreen() - 1]);
            patientBuilder.setCiy(controls.cityScreen());
            patientBuilder.setZipCode(controls.zipCodeScreen());
            List<String> details;
            do {
                details = controls.detailsScreen();
                patientBuilder.setFirstName(details.get(0));
                patientBuilder.setLastName(details.get(1));
                patientBuilder.setPeselNumber(details.get(2));
                patientBuilder.setPhoneNumber(details.get(3));

                registeredPatients.add(patientBuilder.getResult());

            } while (details.get(4).equals("tak"));

            System.out.println("Lista dodanych wpisów dla " + registeredPatients.get(0).getCity() + " (" + registeredPatients.get(0).getZipCode() + ")\n");

            for (Patient patient : registeredPatients) {
                System.out.println(patient.getFirstName());
                System.out.println(patient.getLastName());
                System.out.println(patient.getVaccine());
                System.out.println(patient.getPeselNumber());
                System.out.println(patient.getPhoneNumber());
                System.out.println("-----");
                stringToSave.append(patient.toString());
            }
            FileManager.saveFile(stringToSave.toString(),"patient");

        }

    }
}