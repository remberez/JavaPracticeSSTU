package first_chapter.FifthPoint.FifthTask;

public class Fraction {
    int numerator;
    int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(
                fraction.numerator * this.denominator + this.numerator * fraction.denominator,
                fraction.denominator * this.denominator
        );
    }

    public Fraction subtraction(Fraction fraction) {
        return new Fraction(
                 this.numerator * fraction.denominator - fraction.numerator * this.denominator,
                fraction.denominator * this.denominator
        );
    }

    public Fraction multiplication(Fraction fraction) {
        return new Fraction(
                fraction.numerator * this.numerator,
                fraction.denominator * this.denominator
        );
    }


    public Fraction division(Fraction fraction) {
        return new Fraction(
                this.numerator * fraction.denominator,
                this.denominator * fraction.numerator
        );
    }
}
