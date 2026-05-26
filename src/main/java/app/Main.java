package app;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        String result = new Corrector().handleData(dataProvider.getElements());
        getOutput(result);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
