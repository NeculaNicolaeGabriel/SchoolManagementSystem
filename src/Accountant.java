import exception.IsInvalid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Accountant extends User {

    private boolean isExpert;
    private String phoneNumber;
    private String additionalEmail;
    private boolean worksForMoreSchools;

    public Accountant(String fullName) {

        super(fullName);
        System.out.println("Accountant");
    }

    public boolean isExpert() {
        return isExpert;
    }

    public void setExpert(boolean expert) {
        isExpert = expert;
        if (expert) {
            System.out.println("The accountant is an expert");
        } else {
            System.out.println("The accountant is not an expert");
        }
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdditionalEmail() {
        return additionalEmail;
    }

    public void setAdditionalEmail(String additionalEmail) {
            String[] email = additionalEmail.split("@");
            if (email.length == 2 && additionalEmail.contains(".com") || additionalEmail.contains(".ro")) {
                this.additionalEmail = additionalEmail;
            } else {
                System.out.println("Invalid email address");
            }
        }


    public boolean isWorksForMoreSchools() {
        return worksForMoreSchools;
    }

    public void setWorksForMoreSchools(boolean worksForMoreSchools) {
        this.worksForMoreSchools = worksForMoreSchools;
        if (worksForMoreSchools) {
            System.out.println("The accountant works at several schools");
        } else {
            System.out.println("The accountant only works at this school");
        }
    }

    public String SalaryMonth(List<Professor> user) throws IsInvalid {
        if (!checkIfPasswordIsValid()) {
            throw new IsInvalid("The password is not valid");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            int anualSalary = 0;
            for (String month : months) {
                int totalSalary = 0;
                stringBuilder.append('\n');
                stringBuilder.append(month);
                stringBuilder.append('\n');
                for (Professor element : user) {
                    stringBuilder.append(element.getSubjectThatIsTeaching().getSchoolSubjects()).append("-").
                            append(element.getFullName()).append("-").append(element.getSalary());
                    stringBuilder.append('\n');
                    totalSalary += element.getSalary();
                }
                stringBuilder.append("Total ").append(month).append("-").append(totalSalary);
                stringBuilder.append('\n');
                anualSalary = totalSalary * 12;
            }
            stringBuilder.append('\n');
            stringBuilder.append("Total anual- ").append(anualSalary);
            return stringBuilder.toString();
        }

    }

    public void generateFileWithSalary(List<Professor> user) throws IOException {
  //     File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\Salary.txt");
        File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\Salary.txt");
        if (file.createNewFile()) {
            System.out.println("The file was created");
        } else {
            System.out.println("The file was not created");
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(SalaryMonth(user));
        bw.close();
    }

    public String ScholarshipReport(List<Student> user) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Student> elementary = new ArrayList<>();
        List<Student> middle = new ArrayList<>();
        List<Student> highSchool = new ArrayList<>();
        for (Student element : user) {
            if (element.isScholarship()) {
                if (element.getStudentClass() <= 4) {
                    elementary.add(element);
                } else if (element.getStudentClass() <= 8) {
                    middle.add(element);
                } else if (element.getStudentClass() <= 12) {
                    highSchool.add(element);
                }
            }
        }
        stringBuilder.append("Elementary school");
        int elementaryScholarship = 300;
        for (Student element : elementary) {
            stringBuilder.append('\n');
            stringBuilder.append(element.getFullName());
        }
        stringBuilder.append('\n');
        stringBuilder.append("Total scholarship -").append(elementary.size()).append(" x ").append(elementaryScholarship).
                append(" = ").append(elementary.size() * elementaryScholarship);
        stringBuilder.append('\n');
        stringBuilder.append("Middle school");
        int middleScholarship = 500;
        for (Student element : middle) {
            stringBuilder.append('\n');
            stringBuilder.append(element.getFullName());
        }
        stringBuilder.append('\n');
        stringBuilder.append("Total scholarship -").append(middle.size()).append(" x ").append(middleScholarship).
                append(" = ").append(middle.size() * middleScholarship);
        stringBuilder.append('\n');
        stringBuilder.append("High school");
        int highSchoolScholarship = 800;
        for (Student element : highSchool) {
            stringBuilder.append('\n');
            stringBuilder.append(element.getFullName());
        }
        stringBuilder.append('\n');
        stringBuilder.append("Total scholarship -").append(highSchool.size()).append(" x ").append(highSchoolScholarship).
                append(" = ").append(highSchool.size() * highSchoolScholarship);

        return stringBuilder.toString();
    }

    public void generateFileWithScholarship(List<Student> user) throws IOException {
       // File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\Scholarship.txt");
        File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\Scholarship.txt");
        if (file.createNewFile()) {
            System.out.println("The file was created");
        } else {
            System.out.println("The file was not created");
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(ScholarshipReport(user));
        bw.close();
    }
}
