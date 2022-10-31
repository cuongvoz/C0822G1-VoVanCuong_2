package ss19_regex_and_string.practice.practice_1;

public class EmailExampleTest {
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        String[] valid = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalid = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
        for (String z : valid) {
            System.out.println("email is :" + z + " is valid: " + emailExample.validate(z));
        }
        int i = 0;
        for (String z : invalid) {
            System.out.println("email is :" + z + " is valid: " + emailExample.validate(z));
        }

    }

}
