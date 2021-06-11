import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controls {
    private final Scanner scanner;

    public Controls(Scanner scanner) {
        this.scanner = scanner;
    }

    public int categoryScreen() {
        System.out.println("Jaki typ danych chcesz wprowadzić?\n 1. Pracownicy\n 2. Pacjenci");
        int response;
        do {
            response = scanner.nextInt();
        } while (response != 1 && response != 2);
        return response;
    }

    public int medicalStuffScreen() {
        System.out.println("Jaki typ personelu medycznego chcesz wprowadzić?\n 1. Pielęgniarka\n 2. Ratownik medyczny\n 3. Lekarz");
        int response;
        do {
            response = scanner.nextInt();
        } while (response != 1 && response != 2 && response != 3);
        return response;
    }

    public int patientScreen() {
        System.out.println("Dla jakiego typu szczepionki chcesz wprowadzic pacjenta?\n 1. Astra Zeneca\n 2. Moderna\n 3. J&J");
        int response;
        do {
            response = scanner.nextInt();
        } while (response != 1 && response != 2 && response != 3);
        return response;
    }

    public String cityScreen() {
        System.out.println("Dla jakiego miasta chcesz dodać wpisy?");
        return scanner.next();
    }

    public String zipCodeScreen() {
        System.out.println("Kod pocztowy dla podanego miasta:");
        return scanner.next();
    }

    public List<String> detailsScreen() {
        List<String> details = new ArrayList<>(4);
        System.out.println("Imię:");
        details.add(scanner.next());
        System.out.println("Nazwisko:");
        details.add(scanner.next());
        System.out.println("Numer pesel:");
        details.add(scanner.next());
        System.out.println("Numer telefonu:");
        details.add(scanner.next());
        System.out.println("Chcesz dodać kolejny wpis? tak/nie");
        details.add(scanner.next());
        return details;
    }

}
