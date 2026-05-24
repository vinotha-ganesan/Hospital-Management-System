import java.util.*;

class HospitalController {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    void addPatient(Patient p) {
        patients.add(p);
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addAppointment(Appointment a) {
        appointments.add(a);
    }

    void viewPatients() {

        for (Patient p : patients) {
            p.display();
            System.out.println("----------------");
        }
    }

    void viewDoctors() {

        for (Doctor d : doctors) {
            d.display();
            System.out.println("----------------");
        }
    }

    void viewAppointments() {

        for (Appointment a : appointments) {
            a.display();
            System.out.println("----------------");
        }
    }
}