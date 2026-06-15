package app;

public class Project {
    public static void main(String[] args) {

        System.out.println("Проект: Converter (Версія 2.0)");
        System.out.println("Автор: george5672\n");


        double miles = 5.0;
        System.out.println(miles + " миль = " + milesTOKm(miles) + " км");


        double kilometers = 10.0;
        System.out.println(kilometers + " км = " + kmTOMiles(kilometers) + " миль");
    }


    public static double milesTOKm(double miles) {
        return miles * 1.60934;
    }

    // Метод для конвертації кілометрів в милі
    public static double kmTOMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}