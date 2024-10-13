package first_chapter.SixthPoint.SecondTask;

public class Time {
    static private final int SECONDS_IN_DAY = 86400;

    private final int seconds;
    private final int minutes;
    private final int hours;

    Time(int seconds) {
        if (seconds > SECONDS_IN_DAY | seconds < 1) {
            throw new IllegalArgumentException("Ождиалось значение от 0 до " + SECONDS_IN_DAY);
        }
        this.hours = seconds / 60 / 60;
        this.minutes = (seconds - this.hours * 60 * 60) / 60;
        this.seconds = seconds - this.minutes * 60 - this.hours * 60 * 60;
    }

    Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    static String numberFormat(int time) {
        String repSeconds = String.valueOf(time);
        return repSeconds.length() == 2 ? repSeconds : "0" + repSeconds;
    }

    String getSeconds() {
        return numberFormat(seconds);
    }

    String getMinutes() {
        return numberFormat(minutes);
    }

    String getHours() {
        return numberFormat(hours);
    }

    String getTime() {
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }

    @Override
    public String toString() {
        return getTime();
    }
}