package first_chapter.ThirdPoint.FirstTask;

import java.util.Arrays;

public class Student {
    String name;
    int[] exams;

    Student(String name, int ... exams) {
        this.name = name;
        this.exams = exams;
    }

    @Override
    public String toString() {
        return this.name + ": " + Arrays.toString(this.exams);
    }
}
