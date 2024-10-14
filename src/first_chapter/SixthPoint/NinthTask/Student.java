package first_chapter.SixthPoint.NinthTask;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] exams;

    Student(String name, int ... exams) {
        this.name = name;
        setExams(exams);
    }

    public void setExams(int ... exams) {
        for (var exam: exams) {
            if (exam < 2 || exam > 5) {
                throw new IllegalArgumentException("Ожидалось значение от 2 до 5");
            }
        }
        this.exams = exams;
    }

    public int[] getExams() {
        return exams;
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
