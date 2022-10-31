package ss19_regex_and_string.practice.practice_2;

public class AccountExampleTest {
    public static void main(String[] args) {
        AccountExample account = new AccountExample();
        String[] valid = {"123abc_", "_abc123", "______", "123456", "abcdefg"};
        String invalid[] = {".@", "12345", "1234_","abcde" };

        for (String z : valid) {
            System.out.println("Account: " + z + " valid is: " + account.validate(z));
        }
        for (String z : invalid) {
            System.out.println("Account: " + z + " valid is: " + account.validate(z));
        }
    }
}
