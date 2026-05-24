import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalController hc =
                new HospitalController();

        HospitalView hv =
                new HospitalView();

        while (true) {

            hv.menu();

            System.out.print("Enter choice : ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter Patient ID : ");
                    int pid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Disease : ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Gender : ");
                    String gender = sc.nextLine();

                    Patient p = new Patient(pid,pname,age,disease,gender);

                    hc.addPatient(p);

                    System.out.println("Patient Added!");
                    break;

                case 2:

                    hc.viewPatients();
                    break;

                case 3:

                    System.out.print("Enter Doctor ID : ");
                    int did = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Doctor Name : ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization : ");
                    String spec = sc.nextLine();

                    System.out.print("Enter Experience : ");
                    int exp = sc.nextInt();

                    Doctor d = new Doctor(
                            did,
                            dname,
                            spec,
                            exp
                    );

                    hc.addDoctor(d);

                    System.out.println("Doctor Added!");
                    break;

                case 4:

                    hc.viewDoctors();
                    break;

                case 5:

                    System.out.print("Enter Patient ID : ");
                    int pId = sc.nextInt();

                    System.out.print("Enter Doctor ID : ");
                    int dId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Date : ");
                    String date = sc.nextLine();

                    Appointment a =
                            new Appointment(
                                    pId,
                                    dId,
                                    date
                            );

                    hc.addAppointment(a);

                    System.out.println(
                            "Appointment Booked!"
                    );

                    break;

                case 6:

                    hc.viewAppointments();
                    break;

                case 7:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}