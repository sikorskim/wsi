import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Grade {

    private Float Value;
    private Date DateOfIssue;
    private Student Student;

    public Grade(){}

    public Float getValue() {
        return Value;
    }

    public void setValue(Float value) {
        Value = value;
    }

    public Date getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        DateOfIssue = dateOfIssue;
    }

    public Student getStudent() {
        return Student;
    }

    public void setStudent(Student student) {
        Student = student;
    }
}
