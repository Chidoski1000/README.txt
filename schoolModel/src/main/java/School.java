import java.util.ArrayList;
import java.util.List;

//This is for creatng the required fields in the school model
public class School {

    private String schoolName;
    private List<Teacher> teachers;
    private static List<Applicants> students = new ArrayList<>();
    private Principal principal;
    private List<NonAcademicStaff> nonAcademicStaffs;
    private List<Classes> classess;
    private List<Course> courses;
    private List<Applicants> applicants = new ArrayList<>();


    //This is the school constructor for initializing and setting the school name
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // This is getter for returning the teacher list
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // This is for setter for adding teachers to the teacher list
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    //This is an applicant getter for returning the list of the admitted students
    public List<Applicants> getStudents() {
        return this.students;
    }

//    This is a getter for returning the principal value
    public Principal getPrincipal() {
        return principal;
    }

    // This is the principal setter for setting the pricipal value
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    //This is the getter for returning thelist of non-Academic staffs
    public List<NonAcademicStaff> getNonAcademicStaffs() {
        return nonAcademicStaffs;
    }

    //This is the setter for setting the list of non-Academic staff
    public void setNonAcademicStaffs(NonAcademicStaff nonAcademicStaff) {
        nonAcademicStaffs.add(nonAcademicStaff);
    }

    //This is the Class getter for returning the class list
    public List<Classes> getClasses() {
        return classess;
    }

    //This is the setter for setting the Class list
    public void setClasses(Classes classes) {
        classess.add(classes);
    }

    // This is Course getter for returning the course list
    public List<Course> getCourses() {
        return courses;
    }

    //This is for setting the course
    public void setCourses(Course course) {
        courses.add(course);
    }

    //This is the getter for returning the Applicants list
    public List<Applicants> getApplicants() {
        return applicants;
    }


}
