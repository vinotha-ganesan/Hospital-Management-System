class Doctor {

    int id;
    String name;
    String specialization;
    int experience;

    Doctor(int id,String name,String specialization,int experience) {

        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    void display() {

        System.out.println("Doctor ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Experience : " + experience + " years");
    }
}