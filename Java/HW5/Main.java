public class Main {
    public static void main(String[] arg) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Zotova Ekaterina Viktorovna", "account",
                "ZotovaEV@mail.ru", "+79998887768", 100000, 45);
        employees[1] = new Employee("Reich Ivan Vladimirovich", "assistant",
                "reichIV@Mail.ru", "+78888997664", 30000, 27);
        employees[2] = new Employee("Myo Yan Yanovich", "engineer",
                "myoYY@mail.ru", "+75557654326", 50000, 37);
        employees[3] = new Employee("Nosov Nikolay Ivanovich", "director",
                "NosovNI@mail.ru",
                "+79555772331", 150000, 42);
        employees[4] = new Employee("Loshkin Sava Vasilievich", "manager",
                "loshkinAV@mail.ru",
                "+79223445753", 34000, 22);

        int years = 40;
        for (Employee employee : employees) {
            if (employee.age > years) {
                employee.print();
                System.out.println();
            }
        }
    }
}

