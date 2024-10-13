package first_chapter.FifthPoint.FifthTask;

public class Main {
    public static void main(String[] args) {
        var frac = new Fraction(1, 2);
        var frac2 = new Fraction(1, 5);
        System.out.println(frac.add(frac2));
        System.out.println(frac.subtraction(frac2));
        System.out.println(frac.division(frac2));
        System.out.println(frac.multiplication(frac2));
    }
}
