import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Parent extends User {

    private String parentPhoneNumber;
    private String parentCompletAddress;
    private int parentDateOfBirth;
    private List<Student> children;
    private String occupation;

    public Parent(String fullName) {
        super(fullName);
        System.out.println("Parent");

    }


    public static boolean checkHasOnlyDigits(String value) {
        boolean check = true;
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                check = false;
            }
        }
        return check;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkHasOnlyDigits(phoneNumber) && phoneNumber.length() == 8) {
            phoneNumber = "07" + phoneNumber.substring(0, 2)
                    + "-"
                    + phoneNumber.substring(2, 5)
                    + "-"
                    + phoneNumber.substring(5);
            this.parentPhoneNumber = phoneNumber;
        } else {
            System.out.println("The number is not valid");

        }
    }

    public String getParentCompletAddress() {
        return parentCompletAddress;
    }

    public void setParentCompletAddress(String parentCompletAddress) {
        this.parentCompletAddress = parentCompletAddress;
        System.out.println("Adress " + parentCompletAddress);
    }



    public void setParentDateOfBirth(int year, int month, int day) {
        this.parentDateOfBirth = parentDateOfBirth;
        System.out.println("Date of birth :" + year + "-" + month + "-" + day);
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Period age = Period.between(date, now);
        int yearsParent = age.getYears();
        System.out.println("Age :" + yearsParent);

    }

    public void addChildrenList(Student user, List<Student> children) {
        List<Student> childrenToAdd;
        for (Student element : children) {
            if (element.getUserName().equals(user.getUserName())) {
                if (getChildren() == null) {
                    childrenToAdd = new ArrayList<>();
                } else {
                    childrenToAdd = getChildren();
                }
                childrenToAdd.add(user);
                this.children = childrenToAdd;

            }
        }
    }


    public List<Student> getChildren() {
        return children;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
        System.out.println("Ocupation : " + occupation);
    }


    public void getGrades() {
        for (Student element : this.children) {
            System.out.println(element.getFullName());
            element.studentAverageAnual(element.getGradeMap());
        }
    }

    public void generateFileWithProfessors(List<Professor> professors, Student user) {
        for (Professor element : professors) {
            if (children.contains(user)) {
                if (user.getSchoolSubjects().contains(element.getSubjectThatIsTeaching())) {
                    System.out.println((element.getFullName() + "-"+element.getSubjectThatIsTeaching()
                            +"-"+ element.getPhoneNumber()));
                }


            }

        }
    }

}
