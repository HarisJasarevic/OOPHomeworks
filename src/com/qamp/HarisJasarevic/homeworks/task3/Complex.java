package com.qamp.HarisJasarevic.homeworks.task3;

public class Complex {

    private int realPart;
    private int imagPart;

    public Complex(final int r, final int i) {
        this.realPart = r;
        this.imagPart = i;
    }

    public Complex() {
        this.realPart = 0;
        this.imagPart = 0;
    }

    public final int Re () {
        return realPart;
    }

    public final int Im () {
        return imagPart;
    }

    public final Complex addNumbers (Complex z1) {
        int newRealPart = realPart + z1.realPart;
        int newImagPart = imagPart + z1.imagPart;
        Complex result = new Complex(newRealPart, newImagPart);
        return result;
    }

    public final Complex subtractNumbers (Complex z1) {
        int newRealPart = realPart - z1.realPart;
        int newImagPart = imagPart - z1.imagPart;
        Complex result = new Complex(newRealPart, newImagPart);
        return result;
    }

    public final void printComplex () {
        if (realPart != 0 && imagPart == 0) {
            System.out.println(realPart);
        } else if (realPart == 0 && imagPart != 0) {
            System.out.println(imagPart + "i");
        } else if (realPart == 0 && imagPart == 0) {
            System.out.println(0);
        }else
            System.out.println(realPart + " + " + imagPart + "i");
        }
    }

