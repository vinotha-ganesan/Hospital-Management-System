import java.util.Scanner;

class HospitalView {

    Scanner sc = new Scanner(System.in);

    void menu() {

        System.out.println("\n--- Hospital Management ---");

        System.out.println("1. Add Patient");
        System.out.println("2. View Patients");
        System.out.println("3. Add Doctor");
        System.out.println("4. View Doctors");
        System.out.println("5. Book Appointment");
        System.out.println("6. View Appointments");
        System.out.println("7. Exit");
    }
}