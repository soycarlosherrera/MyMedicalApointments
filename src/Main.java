import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Carlos Herrera","Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

    }
}