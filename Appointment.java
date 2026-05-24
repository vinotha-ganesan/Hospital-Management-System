class Appointment {

    int patientId;
    int doctorId;
    String date;

    Appointment(int patientId,int doctorId,String date) {

        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    void display() {

        System.out.println("Patient ID : " + patientId);
        System.out.println("Doctor ID : " + doctorId);
        System.out.println("Appointment Date : " + date);
    }
}