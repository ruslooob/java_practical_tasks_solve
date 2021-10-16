package tasks_11_20.task_11;

public class PalindromeChecker {

    public static boolean checkV1(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
