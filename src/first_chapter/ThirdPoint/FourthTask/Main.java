package first_chapter.ThirdPoint.FourthTask;

public class Main {
    public static void main(String[] args) {
        var department = new Department("Depart", null);
        var employees = new Employee[]{
                new Employee("A", department),
                new Employee("B", department),
                new Employee("C", department),
                new Employee("D", department),
        };

        System.out.println(employees[0].getColleagues());
    }
}
