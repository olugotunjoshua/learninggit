package OPP_LABS;

public class DemoBanks {
    public static void main(String[] arg) {
        Bank bank = new Bank();
        bank.getRateOFInterest();

        BOI boi = new BOI();
        boi.getRateOFInterest();

        SBI sbi = new SBI();
        sbi.getRateOFInterest();

        ICCI icci = new ICCI();
        icci.getRateOFInterest();


        // class vehicle method and class calling

        Car car = new Car();
        car.engine();


        Truck truck = new Truck();
        truck.engine();

        car.drive();

        // implentation with [polygons and shapes

//        Rectangle rectangle = new Rectangle();
//        rectangle.getArea();
//        rectangle.getVolume();

        ArithException a = new ArithException();
//        a.displayError();
        NullpointerException n = new NullpointerException();
//        n.DisplayError();
        NegativeSizeArray n1 = new NegativeSizeArray();
//        n1.DisplayError();
    }

    // exception codes



}
