class Patient {

    int id;
    String name;
    int age;
    String disease;
    String gender;

    Patient(int id, String name,int age,String disease,String gender) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.gender = gender;
    }

    void display() {

        System.out.println("Patient ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
        System.out.println("Gender : " + gender);
    }
}