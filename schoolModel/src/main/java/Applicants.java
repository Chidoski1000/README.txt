

public class Applicants {

    private int id;
    private String name;
    private String classApplied;
    private int age;
// Created Applicants constructor
    public Applicants(int id, String name, String classApplied, int age) {
        this.id = id;
        this.name = name;
        this.classApplied = classApplied;
        this.age = age;
    }

//This is a getter for returning the age of applicants
    public int getAge() {
        return age;
    }

    //This is a getter for the id of applicants
    public int getId() {
        return id;
    }

    //created a getter for getting or returning the applicants name
    public String getName() {
        return name;
    }

    //This is a getter for returning the class applied by the applicants
    public String getClassApplied() {
        return classApplied;
    }



    @Override
     public String toString() {
       return name;
  }
}
