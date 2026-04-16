package app;

public class Main {
    public static void main(String[] args) {
        // Отримуємо масив даних
        String[] data = getData();

        // Створюємо об'єкт споживача
        Customer customer = getCustomer(data);

        // Формуємо рядок виводу, звертаючись до методів об'єкта customer
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();

        // Виводимо результат
        getOutput(output);
    }

    public static String[] getData() {
        // Повертаємо масив із тестовими даними
        return new String[]{"Tom", "555 123-8596"};
    }

    public static Customer getCustomer(String[] data) {
        // Створюємо об'єкт, використовуючи дані з масиву
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        // Виведення інформації у консоль
        System.out.println(output);

    }
}


