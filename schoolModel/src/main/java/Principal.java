

public class Principal {

    private  int id;
    private String name;

    public Principal(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    // This is the getter for principal name
    public String getName() {
        return name;
    }

    School school = new School("HopeBay");


/**
    This method allows the principal to admit an applicant if the person is below 18 yrs
    and update the student list
 */

    public String admit(Applicants applicants){
        if(applicants.getAge()<18){
            school.getStudents().add(applicants);
            return "Passed, You are now a Student";
        }else
            return "Failed";
    }

/**
  This is the expel method that allows the principal to expel nor remove a student
  and the students record is removed from the Student list

 */
    public String expel(Applicants students){
        school.getStudents().remove(students);
         return "You have been expelled";


        }

    }


