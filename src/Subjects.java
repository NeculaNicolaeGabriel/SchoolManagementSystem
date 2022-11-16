import exception.IsInvalid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Subjects {
    private SchoolSubjects subjects;
    private int grade;
    private Classes classes;
    private List<SchoolSubjects> homework = new ArrayList<>();


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

    public List<SchoolSubjects> getHomework() {
        return homework;
    }

    public void generateHomeworkFolder(List<SchoolSubjects> homework, Student user) throws IOException {
        if (user.checkIfPasswordIsValid()) {
          // File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\" + user.getFullName());
  File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\" + user.getFullName());
            if (file.mkdir()) {
                System.out.println("Directory is created");

            } else {
                System.out.println("Directory cannot be created");

            }
            for (SchoolSubjects element : homework) {
                Long dateModified = file.lastModified();
              //  File f = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\" + user.getFullName()
               //         + "\\" + user.getUserName() + element.getSchoolSubjects() + dateModified);
                        File f = new File("D:\\it\\Project\\src\\SchoolApplication2\\" + user.getFullName()
                                + "\\" + user.getUserName() + element.getSchoolSubjects() + dateModified);
                if (f.createNewFile()) {
                    System.out.println("The file was created");
                } else {
                    System.out.println("The file was not created");
                }

            }
            this.homework = homework;
        }else {
            throw new IsInvalid("The password is invalid, please contact the admin to set a password");
        }
    }
}




