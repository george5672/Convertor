package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder handlData = new StringBuilder();
        int count = 0;

        for (String str : strs) {

            String updatedStr = str.replace("b", "o");

            count++;


            handlData.append(count)
                    .append(") ")
                    .append(updatedStr)
                    .append("\n");
        }

        return handlData.toString();
    }
}
