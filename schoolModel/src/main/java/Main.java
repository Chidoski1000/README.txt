import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        School school = new School("Great Value");

        Course mathematics = new Course(001,"Maths");
        Course english = new Course(002,"English");
   //     Teacher.courseList.add(mathematics);
//        courseLists.add(english);
//
//        Teacher John = new Teacher(1,"John",courseLists);
//        Teacher Emmanuel = new Teacher(2,"Emmanuel",courseLists);
//        List<Teacher> teacherList = new ArrayList<>();
//        teacherList.add(John);
//        teacherList.add(Emmanuel);


        Applicants Johnson = new Applicants(1,"Johnson","JSS1",14);
        Applicants Grace = new Applicants(2,"Grace","SS1", 13);
        Applicants JohnMary = new Applicants(1,"JohnMary","ttfdggshs",  14);
        Applicants  EmmanuelPaul = new Applicants(5,"EmmanuelPaul","ggfghjjh", 12);
        Applicants Okon = new Applicants(3,"Okon","ffghfdfghj", 19);

        school.getApplicants().add(Johnson);
        school.getApplicants().add(JohnMary);
        System.out.println(school.getApplicants());

        Principal principal = new Principal(1,"Okorie");
        school.setPrincipal(principal);

        school.getPrincipal().admit(Johnson);
        school.getPrincipal().admit(Grace);
        school.getPrincipal().admit(JohnMary);
        school.getPrincipal().admit(EmmanuelPaul);
        school.getPrincipal().admit(Okon);
        System.out.println(school.getStudents());
        school.getPrincipal().expel(Grace);
        System.out.println(school.getStudents());

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(JohnMary);
//        studentList.add(EmmanuelPaul);
//        studentList.add(Okon);


        NonAcademicStaff Obi = new NonAcademicStaff(1,"Obi");
        NonAcademicStaff  Chika = new NonAcademicStaff(2,"Chika");
        List<NonAcademicStaff> nonAcademicStaffsList = new ArrayList<>();
        nonAcademicStaffsList.add(Obi);
        nonAcademicStaffsList.add(Chika);

//        Classes JSS1 = new Classes(1,"JSS1");
//        Classes JSS2 = new Classes(2,"JSS2");
//        List<Classes> classesList = new ArrayList<>();
//        classesList.add(JSS1);
//        classesList.add(JSS2);



    }
}
