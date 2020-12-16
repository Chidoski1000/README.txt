public class NonAcademicStaff {
    //this is the field of the NonAcademicStaff class
    private int id;
    private String name;

    //this
    public NonAcademicStaff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
