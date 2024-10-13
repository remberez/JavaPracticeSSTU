package first_chapter.ThirdPoint.FourthTask;

import java.util.ArrayList;

public class Employee {
    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;

        this.department.employeesInDepartment.add(this);
    }

    @Override
    public String toString() {
        String fraze;
        if (department.boss == this) {
            fraze = " начальник отдела ";
        }
        else {
            fraze = " работает в отделе ";
        }
        return this.name + fraze + this.department;
    }

    public String getColleagues() {
        return this.department.employeesInDepartment.toString();
    }
}
