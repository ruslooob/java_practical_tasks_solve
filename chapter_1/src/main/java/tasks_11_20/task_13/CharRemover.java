package tasks_11_20.task_13;

public class CharRemover {

    public static String removeV1(Character deleted, String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != deleted) {
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }


    public static String removeV2(Character deleted, String str) {
        return str.replaceAll(deleted.toString(), "");
    }

}
