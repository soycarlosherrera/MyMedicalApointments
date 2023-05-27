import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Carlos Herrera","carlos@gmail.com");

        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Carlos","carlos@gmail.com");
        user.showDataUser();

        User userPa = new Patient("Carlos","carlos@gmail.com");
        userPa.showDataUser();

        Nurse userNu = new Nurse("Carlos","carlos@gmail.com");
        userNu.showDataUser();

        User user1 = new User("Carlos","carlos@carlos.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor \n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("departamento: Geriatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+" --- "+aA.getTime());
        }
*/
        /*System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        System.out.println(patient);
*/
    }
}