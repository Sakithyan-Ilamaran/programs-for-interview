package softsuave;

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(2, 0);
        Complex c3 = new Complex(0, 0);
        Complex c4 = new Complex(3, -4);
        Complex c5 = new Complex(-4, -3);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);

        System.out.println();
        System.out.println("Product of "+ c1 + " and " + c4 + " is: " +  c1.product(c4));
        System.out.println("Product of "+ c2 + " and " + c3 + " is: " +  c2.product(c3));
        System.out.println("Product of "+ c2 + " and " + c5 + " is: " +  c2.product(c5));
        System.out.println("Product of "+ c4 + " and " + c5 + " is: " +  c4.product(c5));



    }
}

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(int real) {
        this(real, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public Complex product(Complex other) {
        int newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        int newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);

        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        if (this.imaginary == 0) {
            return real + " ";
        } else if (this.imaginary < 0) {
            return real + " - " + (-1 * imaginary) + "i";
        }
        return real + " + " + imaginary + "i";
    }
}
