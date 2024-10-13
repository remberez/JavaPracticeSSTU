package first_chapter.SecondPoint.FourthTask;

public class Main {
    public static void main(String[] args) {
        var department = new Department("IT", null);
        var employee1 = new Employee("Петров", department);
        var employee2 = new Employee("Козлов", department);
        var employee3 = new Employee("Сидоров", department);

        department.boss = employee2;

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
