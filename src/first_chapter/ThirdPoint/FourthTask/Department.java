package first_chapter.ThirdPoint.FourthTask;

import java.util.ArrayList;

public class Department {
    String name;
    Employee boss;
    ArrayList<Employee> employeesInDepartment = new ArrayList<>();

    Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
