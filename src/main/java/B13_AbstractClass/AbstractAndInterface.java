
package B13_AbstractClass;

interface Bank {

    double  rateOfInt();
}

abstract class Customer {

    abstract void showInfo();
}

class VCB extends Customer implements Bank {

    @Override
    void showInfo() {
        System.out.println("VCB");
    }

    @Override
    public double rateOfInt() {
        return 5.5;
    }

}

class BIDV extends Customer implements Bank {

    @Override
    void showInfo() {
        System.out.println("BIDV");
    }

    @Override
    public double rateOfInt() {
        return 6.2;
    }
}

public class AbstractAndInterface {

    public static void main(String[] args) {

        VCB b = new VCB();

        b.showInfo();
        System.out.println(b.rateOfInt());

        BIDV bidv = new BIDV();

        bidv.showInfo();
        System.out.println(bidv.rateOfInt());
    }

}
