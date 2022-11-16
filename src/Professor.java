import exception.IsInvalid;
import exception.NotAuthorized;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Professor extends User {

    private SchoolSubjects subjectThatIsTeaching;
    private String typeOfTeacher;
    private int totalNumberOfHoursPerWeek;
    private double salary;
    private int employmentDate;
    private String phoneNumber;
    private int classesHeTeaches;



    public Professor(String fullName) {
        super(fullName);
        System.out.println("Professor");
    }

    public int getClassesHeTeaches() {
        return classesHeTeaches;
    }

    public void setClassesHeTeaches(int classesHeTeaches) {
        this.classesHeTeaches = classesHeTeaches;
        System.out.println("Teaching in classes : " + this.classesHeTeaches);
    }

    public SchoolSubjects getSubjectThatIsTeaching() {
        return subjectThatIsTeaching;
    }

    public void setSubjectThatIsTeaching(SchoolSubjects subjectThatIsTeaching) {

        this.subjectThatIsTeaching = subjectThatIsTeaching;
        System.out.println("Teach the subject: " + subjectThatIsTeaching.getSchoolSubjects());
    }


    public void getTypeOfTeacher() {
        if (classesHeTeaches >= 0 && classesHeTeaches <= 12) {
            if (classesHeTeaches <= 4) {
                System.out.println("The professor is teaching in elementary school");
            } else if (classesHeTeaches <= 8) {
                System.out.println("The professor is teaching in middle school");
            } else {
                System.out.println("The professor is teaching in high school");
            }
        }
        }


    public int getTotalNumberOfHoursPerWeek() {
        return totalNumberOfHoursPerWeek;
    }

    public void setTotalNumberOfHoursPerWeek(int totalNumberOfHoursPerWeek) {
        this.totalNumberOfHoursPerWeek = totalNumberOfHoursPerWeek;
        System.out.println("Total number of hours per week is : " + totalNumberOfHoursPerWeek);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary : " + salary);
    }

    public int getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        this.employmentDate = employmentDate;
        System.out.println("Employment date : " + year + "-" + month + "-" + day);

    }

    public String getPhoneNumber() {
        return phoneNumber;
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
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("The number is not valid");

        }
    }




    public void addGrades(Student student, SchoolSubjects subject, int grade) throws NotAuthorized,IsInvalid {
        if(checkIfPasswordIsValid()){
            if ((student.getStudentClass() == getClassesHeTeaches()) && subject.equals(getSubjectThatIsTeaching())) {
                Map<String, List<Integer>> mapToSave;
                List<Integer> grades;
                if (student.getGradeMap() == null) {
                    mapToSave = new HashMap<>();
                    grades = new ArrayList<>();
                } else {
                    mapToSave = student.getGradeMap();
                    grades = student.getGradeMap().get(subject.getSchoolSubjects());
                    if (grades == null) {
                        grades = new ArrayList<>();
                    }
                }
                grades.add(grade);
                mapToSave.put(subject.getSchoolSubjects(), grades);
                student.setGradeMap(mapToSave);
            }else {
                throw new NotAuthorized("You are not authorized to add grades to this student");
            }
        }else {
            throw new IsInvalid("The password is invalid, please contact the admin to set a password");
        }

    }

    public void generateFileWithStudents(List<Student> students) throws IOException {
      //  File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\" + getFullName());
        File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\" + getFullName());
        if (file.createNewFile()) {
            System.out.println("The file was created");
        } else {
            System.out.println("The file was not created");
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for (Student element : students) {
            if (element.getSchoolSubjects().contains(getSubjectThatIsTeaching())) {
                bw.write(element.getFullName() + System.lineSeparator());
            }
        }
        bw.close();
    }

}

