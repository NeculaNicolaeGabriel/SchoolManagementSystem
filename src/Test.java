import exception.IsInvalid;
import exception.NotAuthorized;

import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {

        Admin admin = new Admin("Popescu Andrei");
        admin.getUserGmail("popescu.andrei@gmail.com");
        admin.setUserName();
        admin.setPassword(admin.generatePassword());

        System.out.println();

        Student student1 = new Student("Ionescu Ioana");
        student1.getUserGmail("ionescu.ioana88@gmail.com");
        student1.setDateOfBirth(2008, 2, 15);
        student1.setUserName();
        student1.setPassword(admin.generatePassword());
        student1.setStudentClass(12);
        student1.setScholarship(true);
        student1.setSchoolSubjects();
        student1.setAddress("Bucuresti");
        student1.setGender('f');

//        admin.generateNewPassword(student1.getUserName(),student1);


        System.out.println();

        Student student2 = new Student("Ionescu Gigel");
        student2.getUserGmail("gigel@gmail.com");
        student2.setDateOfBirth(2004, 8, 15);
        student2.setUserName();
        student2.setPassword(admin.generatePassword());
        student2.setStudentClass(2);
        student2.setScholarship(true);
        student2.setSchoolSubjects();
        student2.setAddress("Bucuresti");
        student2.setGender('m');


        System.out.println();
        Student student3 = new Student("Voinescu Maria");
        student3.getUserGmail("maria.voi@gmail.com");
        student2.setDateOfBirth(2004, 8, 15);
        student3.setUserName();
        student3.setPassword(admin.generatePassword());
        student3.setStudentClass(3);
        student3.setScholarship(true);
        student3.setSchoolSubjects();
        student3.setAddress("Bucuresti");
        student3.setGender('f');

        System.out.println();
        Student student4 = new Student("Mihalache Daiana");
        student4.getUserGmail("daiana88@gmail.com");
        student4.setDateOfBirth(2008, 2, 15);
        student4.setUserName();
        student4.setPassword(admin.generatePassword());
        student4.setStudentClass(6);
        student4.setScholarship(true);
        student4.setSchoolSubjects();
        student4.setAddress("Bucuresti");
        student4.setGender('f');

        System.out.println();
        Student student5 = new Student("Popescu Daniel");
        student5.getUserGmail("daniel@gmail.com");
        student5.setDateOfBirth(2008, 2, 15);
        student5.setUserName();
        student5.setPassword(admin.generatePassword());
        student5.setStudentClass(8);
        student5.setScholarship(true);
        student5.setSchoolSubjects();
        student5.setAddress("Bucuresti");
        student5.setGender('m');

        System.out.println();
        Student student6 = new Student("Telejman Darius");
        student6.getUserGmail("darius@gmail.com");
        student6.setDateOfBirth(2008, 2, 15);
        student6.setUserName();
        student6.setPassword(admin.generatePassword());
        student6.setStudentClass(9);
        student6.setScholarship(true);
        student6.setSchoolSubjects();
        student6.setAddress("Bucuresti");
        student6.setGender('m');

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println();
        //Profesor1
        Professor professor1 = new Professor("Marinica Ionut");
        professor1.setUserName();
        professor1.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT1);
        professor1.setClassesHeTeaches(2);
        professor1.setPassword(admin.generatePassword());
        professor1.getTypeOfTeacher();
        professor1.setTotalNumberOfHoursPerWeek(40);
        professor1.setSalary(4000);
        professor1.setEmploymentDate(2010, 10, 1);
        professor1.setPhoneNumber("0736273928");

        //Profesor2

        System.out.println();
        Professor professor2 = new Professor("Maria Iacob");
        professor2.setUserName();
        professor2.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT2);
        professor2.setClassesHeTeaches(2);
        professor2.getTypeOfTeacher();
        professor2.setTotalNumberOfHoursPerWeek(50);
        professor2.setSalary(5000);
        professor2.setEmploymentDate(2015, 9, 1);
        professor2.setPhoneNumber("0745458566");
        professor2.setPassword(admin.generatePassword());

        System.out.println();

        Professor professor3 = new Professor("Mihai Iacob");
        professor3.setUserName();
        professor3.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT3);
        professor3.setClassesHeTeaches(3);
        professor3.getTypeOfTeacher();
        professor3.setTotalNumberOfHoursPerWeek(45);
        professor3.setSalary(4500);
        professor3.setEmploymentDate(2017, 1, 3);
        professor3.setPhoneNumber("0756458566");
        professor3.setPassword(admin.generatePassword());
        System.out.println();

        System.out.println();

        Professor professor4 = new Professor("Marinica Ionut");
        professor4.setUserName();
        professor4.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT4);
        professor4.setClassesHeTeaches(12);
        professor4.setPassword(admin.generatePassword());
        professor4.getTypeOfTeacher();
        professor4.setTotalNumberOfHoursPerWeek(40);
        professor4.setSalary(4000);
        professor4.setEmploymentDate(2010, 10, 1);
        professor4.setPhoneNumber("0736273928");

        System.out.println();

        Professor professor5 = new Professor("Marinica Ionut");
        professor5.setUserName();
        professor5.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT5);
        professor5.setClassesHeTeaches(8);
        professor5.setPassword(admin.generatePassword());
        professor5.getTypeOfTeacher();
        professor5.setTotalNumberOfHoursPerWeek(40);
        professor5.setSalary(4000);
        professor5.setEmploymentDate(2010, 10, 1);
        professor5.setPhoneNumber("0736273928");

        System.out.println();

        Professor professor6 = new Professor("Marinica Ionut");
        professor6.setUserName();
        professor6.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT6);
        professor6.setClassesHeTeaches(8);
        professor6.setPassword(admin.generatePassword());
        professor6.getTypeOfTeacher();
        professor6.setTotalNumberOfHoursPerWeek(40);
        professor6.setSalary(4000);
        professor6.setEmploymentDate(2010, 10, 1);
        professor6.setPhoneNumber("0736273928");

        System.out.println();

        Professor professor7 = new Professor("Marinica Ionut");
        professor7.setUserName();
        professor7.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT7);
        professor7.setClassesHeTeaches(6);
        professor7.setPassword(admin.generatePassword());
        professor7.getTypeOfTeacher();
        professor7.setTotalNumberOfHoursPerWeek(40);
        professor7.setSalary(4000);
        professor7.setEmploymentDate(2010, 10, 1);
        professor7.setPhoneNumber("0736273928");

        System.out.println();

        Professor professor8 = new Professor("Marinica Ionut");
        professor8.setUserName();
        professor8.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT8);
        professor8.setClassesHeTeaches(9);
        professor8.setPassword(admin.generatePassword());
        professor8.getTypeOfTeacher();
        professor8.setTotalNumberOfHoursPerWeek(40);
        professor8.setSalary(4000);
        professor8.setEmploymentDate(2010, 10, 1);
        professor8.setPhoneNumber("0736273928");

        System.out.println();
        Professor professor9 = new Professor("Marinica Ionut");
        professor9.setUserName();
        professor9.setSubjectThatIsTeaching(SchoolSubjects.SUBJECT9);
        professor9.setClassesHeTeaches(12);
        professor9.setPassword(admin.generatePassword());
        professor9.getTypeOfTeacher();
        professor9.setTotalNumberOfHoursPerWeek(40);
        professor9.setSalary(4000);
        professor9.setEmploymentDate(2010, 10, 1);
        professor9.setPhoneNumber("0736273928");
        //Parent1

        System.out.println();

        List<Professor> professors = new ArrayList<>();
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);
        professors.add(professor4);
        professors.add(professor5);
        professors.add(professor6);
        professors.add(professor7);
        professors.add(professor8);
        professors.add(professor9);

        Parent parent1 = new Parent("Ionescu Nicolae");
        parent1.setUserName();
        parent1.setPhoneNumber("0764294136");
        parent1.setParentCompletAddress("Bucuresti");
        parent1.setParentDateOfBirth(1966, 4, 15);
        parent1.setOccupation("Driver");
        parent1.setPassword(admin.generatePassword());
        parent1.addChildrenList(student1, students);
        parent1.addChildrenList(student2, students);
        System.out.println(parent1.getChildren());


        System.out.println();
        //Parent2
        Parent parent2 = new Parent("Voicu Nicolae");
        parent2.setUserName();
        parent2.setPhoneNumber("0764278613");
        parent2.setParentCompletAddress("Bucuresti");
        parent2.setParentDateOfBirth(1970, 4, 7);
        parent2.setOccupation("Cook");
        parent2.setPassword(admin.generatePassword());
        parent2.addChildrenList(student3, students);

        System.out.println();

        Parent parent3 = new Parent("Mihalache Nicolae");
        parent3.setUserName();
        parent3.setPhoneNumber("0764278613");
        parent3.setParentCompletAddress("Bucuresti");
        parent3.setParentDateOfBirth(1970, 4, 7);
        parent3.setOccupation("Manager");
        parent3.setPassword(admin.generatePassword());
        parent3.addChildrenList(student4, students);

        System.out.println();

        Parent parent4 = new Parent("Popescu Alina");
        parent4.setUserName();
        parent4.setPhoneNumber("0764278613");
        parent4.setParentCompletAddress("Bucuresti");
        parent4.setParentDateOfBirth(1970, 4, 7);
        parent4.setOccupation("Accountant");
        parent4.setPassword(admin.generatePassword());
        parent4.addChildrenList(student5, students);

        System.out.println();

        Parent parent5 = new Parent("Telejman Florin");
        parent5.setUserName();
        parent5.setPhoneNumber("0764278613");
        parent5.setParentCompletAddress("Bucuresti");
        parent5.setParentDateOfBirth(1970, 4, 7);
        parent5.setOccupation("CEO");
        parent5.setPassword(admin.generatePassword());
        parent5.addChildrenList(student6, students);

        System.out.println();

        //Accountant
        Accountant accountant1 = new Accountant("Geoerge Miculescu");
        accountant1.setUserName();
        accountant1.setPassword(admin.generatePassword());
        accountant1.setExpert(true);
        accountant1.setWorksForMoreSchools(true);
        accountant1.setPhoneNumber("0756432578");
        accountant1.setAdditionalEmail("geroge@scoala109.com");


        Accountant accountant2 = new Accountant("Andreea Tanase");
        accountant2.setUserName();
        accountant2.setPassword(admin.generatePassword());
        accountant2.setExpert(false);
        accountant2.setWorksForMoreSchools(false);
        accountant2.setPhoneNumber("0754332578");
        accountant1.setAdditionalEmail("andreea@scoala109.com");

        System.out.println();

        List<User> user = new ArrayList<>();
        user.add(student1);
        user.add(student2);
        user.add(student3);
        user.add(student4);
        user.add(student5);
        user.add(student6);
        user.add(professor1);
        user.add(professor2);
        user.add(professor3);
        user.add(professor4);
        user.add(professor5);
        user.add(professor6);
        user.add(professor7);
        user.add(professor8);
        user.add(professor9);
        user.add(parent1);
        user.add(parent2);
        user.add(parent3);
        user.add(parent4);
        user.add(parent5);
        user.add(accountant1);
        user.add(accountant2);

        System.out.println();

        admin.generateFolder();
        admin.generateFile(user);

        System.out.println();

//        admin.eraseUser(student1.getUserName(), user);

        System.out.println();

        admin.generateFileWithAllSchoolMembers(user);

        System.out.println();

        Subjects subject1 = new Subjects();
        subject1.generateHomeworkFolder(student1.getSchoolSubjects(),student1);
        subject1.generateHomeworkFolder(student2.getSchoolSubjects(),student2);
        subject1.generateHomeworkFolder(student3.getSchoolSubjects(),student3);
        subject1.generateHomeworkFolder(student4.getSchoolSubjects(),student4);
        subject1.generateHomeworkFolder(student5.getSchoolSubjects(),student5);

        System.out.println();

        try {
            professor4.addGrades(student1, SchoolSubjects.SUBJECT4, 9);
            professor4.addGrades(student1, SchoolSubjects.SUBJECT4, 2);
            professor4.addGrades(student1, SchoolSubjects.SUBJECT4, 3);
            professor9.addGrades(student1, SchoolSubjects.SUBJECT9, 4);
            professor9.addGrades(student1, SchoolSubjects.SUBJECT9, 10);
            professor9.addGrades(student1, SchoolSubjects.SUBJECT9, 6);
            professor1.addGrades(student2, SchoolSubjects.SUBJECT1, 9);
            professor1.addGrades(student2, SchoolSubjects.SUBJECT1, 8);
            professor1.addGrades(student2, SchoolSubjects.SUBJECT1, 6);
            professor2.addGrades(student2, SchoolSubjects.SUBJECT2, 10);
            professor2.addGrades(student2, SchoolSubjects.SUBJECT2, 7);
            professor2.addGrades(student2, SchoolSubjects.SUBJECT2, 6);
            professor5.addGrades(student5, SchoolSubjects.SUBJECT5, 9);
            professor5.addGrades(student5, SchoolSubjects.SUBJECT5, 10);
            professor5.addGrades(student5, SchoolSubjects.SUBJECT5, 7);
            professor6.addGrades(student5, SchoolSubjects.SUBJECT6, 8);
            professor6.addGrades(student5, SchoolSubjects.SUBJECT6, 10);
            professor6.addGrades(student5, SchoolSubjects.SUBJECT6, 6);
        }catch (NotAuthorized e){
            System.out.println("You are not authorized");
        }catch (IsInvalid e){
            System.out.println("Your password is invalid");
        }

        System.out.println();
            System.out.println(student1.getGradeMap());
            System.out.println(student2.getGradeMap());
            System.out.println(student5.getGradeMap());


            student1.studentAverage(student1.getGradeMap(), SchoolSubjects.SUBJECT4);
            student1.studentAverage(student1.getGradeMap(), SchoolSubjects.SUBJECT9);
            student5.studentAverage(student5.getGradeMap(), SchoolSubjects.SUBJECT5);

            student1.studentAverageAnual(student1.getGradeMap());

            professor4.generateFileWithStudents(students);

            parent1.getGrades();

            accountant1.generateFileWithSalary(professors);
            accountant1.generateFileWithScholarship(students);

//
//
//        System.out.println(accountant1.SalaryMonth(professors));
//
//        accountant1.generateFileWithSalary(professors);
//
//        System.out.println();
//
//
//        accountant1.generateFileWithScholarship(students);
//
//
//        System.out.println();
//
//
//
//
//
//
//        student1.studentAverage(student1.getGradeMap(), SchoolSubjects.SUBJECT1);
//        student1.studentAverageAnual(student1.getGradeMap());
//
//
//        parent1.getGrades();
//
//        System.out.println();
//
//        parent1.generateFileWithProfessors(professors, student1);
//

//        professor1.addGrades(student1,SchoolSubjects.SUBJECT6,9);
//        professor3.addGrades(student3,SchoolSubjects.SUBJECT3,8);

    }
}
