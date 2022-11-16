import java.util.ArrayList;
import java.util.List;

public enum SchoolSubjects {


    SUBJECT1("English"),
    SUBJECT2("History"),
    SUBJECT3("Math"),
    SUBJECT4("Geography"),
    SUBJECT5("Biology"),
    SUBJECT6("German"),
    SUBJECT7("Sport"),
    SUBJECT8("Chemistry"),
    SUBJECT9("Computer science");




    private String schoolSubjects;

    SchoolSubjects(String schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }

    public String getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects(String schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }
}




