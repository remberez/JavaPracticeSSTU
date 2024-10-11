package first_chapter.FirstPoint;

class Time {
    static private final int SECONDS_IN_DAY = 86400;

    private final int seconds;
    private final int minutes;
    private final int hours;

    Time(int seconds) {
        seconds = seconds % SECONDS_IN_DAY;
        this.hours = seconds / 60 / 60;
        this.minutes = (seconds - this.hours * 60 * 60) / 60;
        this.seconds = seconds - this.minutes * 60 - this.hours * 60 * 60;
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

public class FourthTask {
    public static void main(String[] args) {
        Time[] times = {
                new Time(10),
                new Time(10000),
                new Time(100000),
        };

        for (var time: times) {
            System.out.println(time);
        }
    }
}
