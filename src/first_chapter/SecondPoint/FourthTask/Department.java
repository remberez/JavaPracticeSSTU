package first_chapter.SecondPoint.FourthTask;

public class Department {
    String name;
    Employee boss;

    Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
