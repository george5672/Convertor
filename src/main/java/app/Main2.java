public class Main2 {
    public static void main(String[] args) {
        System.out.println("Проект: Converter (Версія 2.0)");
        System.out.println("Автор: george5672");

        double miles = 5.0;
        System.out.println(miles + " миль = " + milesTOKm(miles) + " км");
    }

    // Додаємо сам метод конвертації (Пункт 8)
    public static double milesTOKm(double miles) {
        return miles * 1.60934;
    }
}