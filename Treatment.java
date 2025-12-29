package Workshop7;

public class Treatment {
    private int treatmentID;
    private String type;
    private String description;

    public void updateDescription(String description) {
        this.description = description;
    }

    public void viewTreatmentDetails() {
        System.out.println(type + " " + description);
    }
}
