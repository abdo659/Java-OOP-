package Workshop;

public class main {
    public static void main(String[] args) {

        String password = "Abc12345";

        boolean hasUpper = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                hasUpper = true;
            }

            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
            }
        }

        if (password.length() >= 8 && hasUpper && hasNumber) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}