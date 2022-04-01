package complex;
Public class COMPLEX {

    double real;
    double imag;

    public COMPLEX(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        COMPLEX  n1 = new COMPLEX (2.3, 4.5),
                n2 = new COMPLEX (3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static COMPLEX add(COMPLEX n1, COMPLEX  n2)
    {
        COMPLEX temp = new COMPLEX (0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}