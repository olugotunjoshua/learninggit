package OPP_LABS;

public class Bank {
    private double Int_rate;

  void getRateOFInterest(){
        System.out.println("Banks on average give 10%  interest");
    }
}

class BOI extends Bank{

    @Override
    void getRateOFInterest() {
        System.out.println("Bank of India(BOI) gives 9% on interest rate");
    }
}

class SBI extends Bank{
    @Override
    void getRateOFInterest() {
        System.out.println("SBI gives 8% on interest rate");
    }
}


class ICCI extends Bank{
    @Override
    void getRateOFInterest() {
        System.out.println("ICCI gives 7% on interest rate");
    }
}

