class GenericNumeric<T extends Number> {
    private T value;

    public GenericNumeric(T value) {
        this.value = value;
    }
    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }
    public double fractionalPart() {
        double v = value.doubleValue();
        return v - (long)v;
    }
    public static <A extends Number, B extends Number>
    boolean absEqual(A a, B b) {
        return Math.abs(a.doubleValue()) ==
               Math.abs(b.doubleValue());
    }
}

public class GenericNum {

    public static void main(String[] args) {
        GenericNumeric<Double> n1 = new GenericNumeric<>(9.76);
        System.out.println(n1.reciprocal());
        System.out.println(n1.fractionalPart());
        System.out.println(
                GenericNumeric.absEqual(-5.0, 5f)
        );
    }
}