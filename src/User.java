import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User {

    private String fullName;
    private String userGmail;
    public String userName;
    private String password;

    public User(String fullName) {
        this.fullName = fullName;
        System.out.println("Name is :" + fullName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        String numbers = "0123456789";
        String userNameGenerated = letters + numbers;
        Random random = new Random();
        int lengthForUserName = random.nextInt(4) + 6;
        char[] randomUserName = new char[lengthForUserName];

        for (int i = 0; i < lengthForUserName; i++) {
            randomUserName[i] = userNameGenerated.charAt(random.nextInt(userNameGenerated.length()));
        }
        this.userName = String.valueOf(randomUserName);
        System.out.println("UserName is : "+String.valueOf(randomUserName) );
    }

    public void getUserGmail(String userGmail) {
        String email_pattern = "[\\w]*@*[a-z]*\\.*[\\w]{5,}(\\.)*(com)*(@gmail\\.com)";
        Pattern pat = Pattern.compile(email_pattern);
        Matcher mat = pat.matcher(userGmail);

        if (mat.matches()) {
            System.out.println("The gmail address is valid");
            this.userGmail = userGmail;
        } else if (!mat.matches()) {
            System.out.println("The address is not valid because it is not gmail");
        }

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public boolean checkIfPasswordIsValid(){
        return this.password != null;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

