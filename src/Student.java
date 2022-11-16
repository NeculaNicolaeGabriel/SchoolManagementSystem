import exception.IsInvalid;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User {

    private char gender;
    private String dateOfBirth;
    private String address;
    private List<SchoolSubjects> schoolSubjects = new ArrayList<>();
    private int studentClass;
    private boolean scholarship;

    private Map<String, List<Integer>> gradeMap;

    public Map<String, List<Integer>> getGradeMap() {
        if (checkIfPasswordIsValid()) {
            return gradeMap;
        } else {
            throw new RuntimeException("The password is invalid, please contact the admin to set a password");
        }
    }

    public void setGradeMap(Map<String, List<Integer>> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Student(String fullName) {
        super(fullName);
        System.out.println("Student");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        this.dateOfBirth = String.valueOf(date);

        LocalDate now = LocalDate.now();
        Period ageStudent = Period.between(date, now);
        int yearsStudent = ageStudent.getYears();
        System.out.println("Date of birth :" + year + "-" + month + "-" + day);
        System.out.println("Age :" + yearsStudent);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        if (scholarship) {
            this.scholarship = scholarship;
            System.out.println("The student receives the scholarship");
        } else {
            System.out.println("The student does not receive the scholarship");
        }
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        if (studentClass >= 0 && studentClass <= 12) {
            if (studentClass <= 4) {
                System.out.println("The student is in elementary school, class:" + studentClass);
                this.studentClass = studentClass;
            } else if (studentClass <= 8) {
                System.out.println("The student is in middle school, class:" + studentClass);
                this.studentClass = studentClass;
            } else {
                System.out.println("The student is in high school, class:" + studentClass);
                this.studentClass = studentClass;
            }
        } else {
            System.out.println("The class does not exist");
        }
    }


    public List<SchoolSubjects> getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects() {
        List<SchoolSubjects> schoolSubjects1 = new ArrayList<>();
        schoolSubjects1.add(SchoolSubjects.SUBJECT1);
        schoolSubjects1.add(SchoolSubjects.SUBJECT2);
        schoolSubjects1.add(SchoolSubjects.SUBJECT3);
        List<SchoolSubjects> schoolSubjects2 = new ArrayList<>();
        schoolSubjects2.add(SchoolSubjects.SUBJECT5);
        schoolSubjects2.add(SchoolSubjects.SUBJECT6);
        schoolSubjects2.add(SchoolSubjects.SUBJECT7);
        List<SchoolSubjects> schoolSubjects3 = new ArrayList<>();
        schoolSubjects3.add(SchoolSubjects.SUBJECT8);
        schoolSubjects3.add(SchoolSubjects.SUBJECT4);
        schoolSubjects3.add(SchoolSubjects.SUBJECT9);

        if (checkIfPasswordIsValid()) {
            if (getStudentClass() <= 4) {
                for (SchoolSubjects element : schoolSubjects1) {
                    System.out.println("The student has the following subject : " + element.getSchoolSubjects());
                    this.schoolSubjects = schoolSubjects1;
                }
            } else if (getStudentClass() <= 8) {
                for (SchoolSubjects element : schoolSubjects2) {
                    System.out.println("The student has the following subject : " + element.getSchoolSubjects());
                    this.schoolSubjects = schoolSubjects2;
                }
            } else if (getStudentClass() <= 12) {
                for (SchoolSubjects element : schoolSubjects3) {
                    System.out.println("The student has the following subject : " + element.getSchoolSubjects());
                    this.schoolSubjects = schoolSubjects3;
                }
            }
        } else {
            throw new IsInvalid("The password is invalid, please contact the admin to set a password");
        }

    }

    public void studentAverage(Map<String, List<Integer>> grade, SchoolSubjects subjects) {
            for (String element : grade.keySet()) {
                if (element.equals(subjects.getSchoolSubjects())) {
                    List<Integer> value = grade.get(element);
                    double count = 0;
                    double sum = 0;
                    double average = 0;
                    for (Integer element1 : value) {
                        count++;
                        sum += element1;
                        average = sum / count;
                    }
                    System.out.println("The average for " + subjects.getSchoolSubjects() + " is " + average);
                }
                }
            }



    public void studentAverageAnual(Map<String, List<Integer>> grade) throws IsInvalid {
        if(checkIfPasswordIsValid()){
            int count1 = 0;
            double anualAverage = 0;
            double sum2 = 0;
            for (String element : grade.keySet()) {
                count1++;
                List<Integer> value = grade.get(element);
                double count = 0;
                double sum = 0;
                double average = 0;
                for (Integer element1 : value) {
                    count++;
                    sum += element1;
                    average = sum / count;
                }
                sum2 += average;
                anualAverage = sum2 / count1;
            }
            System.out.println("The anual average for "+ this.getFullName() + " is " + anualAverage);
        }else {
            throw new IsInvalid("The password is invalid, please contact the admin to set a password");

        }


    }
    @Override
    public String toString() {
        return "Student{" +
                "name-" + getFullName() + '\'' +
                '}';
    }
}








