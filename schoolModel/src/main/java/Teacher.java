import java.util.List;

public class Teacher {
    // This is the field of the teacher including id, teacher name and the list of courses
    private int id;
    private String name;
    private List<Course> courses;

    //This is the constructor of the Teacher class
    public Teacher(int id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    //this is the setter and getter of the various fields.
    public void setId(int id) {
        this.id = id;
    }


    //this is for setting the teacher name
    public void setName(String name) {
        this.name = name;
    }

    //This is a getter for getting the teacher id
    public int getId() {
        return id;
    }

    //This is the getter for returning the teacher name
    public String getName() {
        return name;
    }

    //This method "teaches" allows the teacher to teach a course
    public String teaches(int id, String name){
       Course teacherCourse = new Course(id,name);
       courses.add(teacherCourse);
       return  "You teach the course with id: " +id;
    }



    @Override
    public String toString() {
        return name;
    }
}
