package Workshop7;

public class Doctor extends Person {
    private int doctorID;
    private String department;

    public void seePatientDetails() {
        System.out.println("Viewing patient details");
    }

    public void prescribeTreatment() {
        System.out.println("Treatment prescribed");
    }
}
