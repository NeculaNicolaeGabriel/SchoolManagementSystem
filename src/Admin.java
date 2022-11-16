import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Admin extends User {

  //  public static final String PASSWORDS_FOLDER_PATH = "C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\passwords\\";
    public static final String PASSWORDS_FOLDER_PATH ="D:\\it\\Project\\src\\SchoolApplication2\\password\\";
    private String password;
    private String fullName;


    public Admin(String fullName) {
        super(fullName);
        this.fullName = fullName;

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String generatePassword() {

        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvxyz";
        String digits = "0123456789";
        String specialChar = "!@#$%^&*?+";
        String allChars = upperLetters + lowerLetters + digits + specialChar;

        Random random = new Random();
        int length = random.nextInt(6) + 6;
        char[] password = new char[length];

        password[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
        password[1] = upperLetters.charAt(random.nextInt(upperLetters.length()));
        password[2] = specialChar.charAt(random.nextInt(specialChar.length()));
        password[3] = digits.charAt(random.nextInt(digits.length()));

        for (int i = 4; i < length; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }


        this.password = String.valueOf(password);
        System.out.println("Password is : " + String.valueOf(password));
        return this.password;
    }

    public void generateFolder() {
      //  File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\passwords");
  File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\password\\");
        if (file.mkdir()) {
            System.out.println("Directory is created");

        } else {
            System.out.println("Directory cannot be created");

        }
    }

    public void generate(User user) throws IOException {
        File f = new File(PASSWORDS_FOLDER_PATH + user.getUserName());
        if (f.createNewFile()) {
            System.out.println("The file was created");
        } else {
            System.out.println("The file was not created");
        }
        FileWriter fw = new FileWriter(f.getAbsoluteFile());
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("The username: " + user.getUserName() + " has the password " + user.getPassword());
        bf.close();
    }

    public void generateFile(List<User> users) {
        try {
            System.out.println("Files are:");
            for (User element : users) {
                generate(element);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public void generateFileWithAllSchoolMembers(List<User> users) throws IOException {
        try {
          //  File file = new File("C:\\Users\\v-ftotovina\\IdeaProjects\\SchoolApplication2\\SchoolMembers.txt");
         File file = new File("D:\\it\\Project\\src\\SchoolApplication2\\SchoolMembers.txt");
            if (file.createNewFile()) {
                System.out.println("The file was created");
            } else {
                System.out.println("The file was not created");
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int count = 1;
            for (User element : users) {
                fileWriter.write(("Nr" + count++) + ", " + element.getFullName() + ", " +
                        element.getClass().getSimpleName() + System.lineSeparator());
            }
            bufferedWriter.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public void eraseUser(String userName, List<User> users) {
        for (User element : users) {
            if (userName.equals(element.getUserName())) {
                users.remove(element);
                File f = new File(PASSWORDS_FOLDER_PATH + element.getUserName());
                if (f.exists()) {
                    f.deleteOnExit();
                }
            }
        }
        System.out.println(users);
    }



    public boolean checkIfUserName(String userName) {
        return userName != null;
    }

    public String generateNewPassword(String userName, User user) {
        if (checkIfUserName(userName)) {
            String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerLetters = "abcdefghijklmnopqrstuvxyz";
            String digits = "0123456789";
            String specialChar = "!@#$%^&*?+";
            String allChars = upperLetters + lowerLetters + digits + specialChar;

            Random random = new Random();
            int length = random.nextInt(6) + 6;
            char[] newPassword = new char[length];

            newPassword[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
            newPassword[1] = upperLetters.charAt(random.nextInt(upperLetters.length()));
            newPassword[2] = specialChar.charAt(random.nextInt(specialChar.length()));
            newPassword[3] = digits.charAt(random.nextInt(digits.length()));

            for (int i = 4; i < length; i++) {
                newPassword[i] = allChars.charAt(random.nextInt(allChars.length()));
            }

            System.out.println("The old password before it was changed is : " + password +
                    " . And the new Password is : " + String.valueOf(newPassword));

            this.password = String.valueOf(newPassword);
            //System.out.println(this.password);
            return "";
        }
        return "The password cannot be reset";


    }
}

