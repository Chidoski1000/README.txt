import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class TeacherTest {
    Course course = new Course(1,"Mathematics");
    List<Course> courseList = new ArrayList<>();
    Teacher teacher = new Teacher(1,"Christian",courseList);



    @Test
    void getId() {
    }



    @Test
    void teaches() {
        assertEquals("You teach the course with id: " +course.getId(),teacher.teaches(1,"Mathematics"));
    }


}