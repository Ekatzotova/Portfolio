public class Employee {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("тел: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);

    }
}
