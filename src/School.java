
import java.util.LinkedList;
import java.util.List;

public class School extends User{
    private String schoolName;
    private List<User> schoolMembers = new LinkedList<User>();

    private SchoolSubjects subjects;

    private Classes classes;

    public School(String fullName, String userGmail) {
        super(fullName);

        this.schoolName=schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<User> getSchoolMembers() {
        return schoolMembers;
    }

    public void setSchoolMembers(List<User> schoolMembers) {
        this.schoolMembers = schoolMembers;
    }

    public SchoolSubjects getSubjects() {
        return subjects;
    }

    public void setSubjects(SchoolSubjects subjects) {
        this.subjects = subjects;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
