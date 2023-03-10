package Laboratory.Lab06.Task05;

import java.util.Scanner;

public class User {
    private Integer age;
    private String name;

    public User() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        this.age = scanner.nextInt();
    }

    public String getInfo() {
        return String.valueOf(age);
    }

    public String getName() {
        return name;
    }
}
