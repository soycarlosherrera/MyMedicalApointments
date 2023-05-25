import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Carlos Herrera","Pediatria");

        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+" --- "+aA.getTime());
        }

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        System.out.println(patient);

    }
}