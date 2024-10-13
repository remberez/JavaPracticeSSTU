package first_chapter.FifthPoint.SixthTask;

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

    public double avgScore() {
        if (exams.length == 0) return 0;
        return (double) Arrays.stream(exams).sum() / exams.length;
    }

    public boolean amIExcellent() {
        if (exams.length == 0) return false;
        for (var exam: exams) {
            if (exam != 5) return false;
        }
        return true;
    }
}
