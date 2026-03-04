public class Instructor extends Person {
    private String specialization;

    public Instructor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public void displayInfo() {
        System.out.println("--- Instructor Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialization: " + specialization);
    }
}
