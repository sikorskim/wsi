import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Subject {

    private String Name;
    private String Teaher;
    private List<Grade> Grades;

    public Subject(){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTeaher() {
        return Teaher;
    }

    public void setTeaher(String teaher) {
        Teaher = teaher;
    }

    public List<Grade> getGrades() {
        return Grades;
    }

    public void setGrades(List<Grade> grades) {
        Grades = grades;
    }
}
