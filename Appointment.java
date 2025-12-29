package Workshop7;

public class Appointment {
    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;

    public void rescheduleAppointment() {
        System.out.println("Appointment rescheduled");
    }

    public void cancelAppointment() {
        System.out.println("Appointment cancelled");
    }

    public void viewAppointmentDetails() {
        System.out.println(appointmentDate + " " + appointmentTime);
    }
}
