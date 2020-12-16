import java.util.ArrayList;
import java.util.List;

public class Classes {
    //created fields
    private  int id;
    private  String name;
    private List<Course> courseList = new ArrayList<>();

    //Classes constructor
    public Classes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //This is returning the id of the class
    public int getId() {
        return id;
    }

    //This is returning the name of the class
    public String getName() {
        return name;
    }


}
