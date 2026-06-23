package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();


        String namesOutput = dataHandler.formatItems(provider.getProductNames());
        getOutput("Products: " + namesOutput);


        String salesOutput = dataHandler.formatItems(provider.getFormattedSales());
        getOutput("Sales, EUR: " + salesOutput);
    }


    private static void getOutput(String output) {
        System.out.println(output);
    }
}


