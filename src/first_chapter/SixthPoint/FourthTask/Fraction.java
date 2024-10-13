package first_chapter.SixthPoint.FourthTask;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    private void setDenominator(int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Ожидалось значение >= 0.");
        }
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

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
}
