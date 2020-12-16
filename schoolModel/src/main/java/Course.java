public class Course {

    private int id;
    private String name;

    //This is the course constructor
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //This is for returning the id of the course
    public int getId() {
        return id;
    }

    //This is for returning the name of the course
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
