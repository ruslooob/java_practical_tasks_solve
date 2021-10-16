package tasks_11_20.task_12;

public class RepeatedCharRemover {

    public static String remove(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int strLength = str.length();

        if (strLength == 0 || strLength == 1){
            return str;
        }

        stringBuilder.append(str.charAt(0));

        externalLoop:
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            for (int j = i - 1; j >= 0; j--) {
                if (currentChar == str.charAt(j)) {
                    continue externalLoop;
                }
            }

            stringBuilder.append(currentChar);
        }
        return stringBuilder.toString();
    }

}
