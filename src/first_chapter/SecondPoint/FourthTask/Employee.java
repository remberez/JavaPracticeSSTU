package first_chapter.SecondPoint.FourthTask;

public class Employee {
    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
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
}
