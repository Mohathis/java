import java.util.Scanner;

class Complex {
    double real;
    double img;

    Complex() {
        real = 0;
        img = 0;
    }

    Complex(double r, double i) {
        real = r;
        img = i;
    }

    Complex add(Complex c2) {
        Complex result = new Complex();
        result.real = real + c2.real;
        result.img = img + c2.img;
        return result;
    }

    Complex sub(Complex c2) {
        Complex result = new Complex();
        result.real = real - c2.real;
        result.img = img - c2.img;
        return result;
    }

    Complex mul(Complex c2) {
        Complex result = new Complex();
        result.real = (real * c2.real) - (img * c2.img);
        result.img = (real * c2.img) + (img * c2.real);
        return result;
    }

    void display() {
        System.out.println(real + " + " + img + "i");
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real & imaginary part of first number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter the real & imaginary part of second number:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.println("---- Result ----");

        Complex sum = c1.add(c2);
        Complex diff = c1.sub(c2);
        Complex prod = c1.mul(c2);

        System.out.println("Sum:");
        sum.display();

        System.out.println("Difference:");
        diff.display();

        System.out.println("Product:");
        prod.display();

        sc.close();
    }
}

