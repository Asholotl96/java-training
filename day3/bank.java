class Acc{
    int accno;
    double bal;
    static{
        System.out.println("SNP Bank");
    }
    //IIB
    {
        System.out.println("Account instance initializing");
    }
    
    Acc(int accno, double bal) {
        this.accno = accno;
        this.bal = bal;
    }
    
    void withdraw(double amt){
        bal-=amt;
    }
}

class SavingsAcc extends Acc{
    float rate;

    SavingsAcc(float rate, int accno, double bal) {
        super(accno, bal);
        this.rate = rate;
    }
    @Override
    void withdraw(double amt){
        if(bal<1000) System.out.println("Insufficient balance, cannot withdraw anymore");
        else{
            bal-=amt;
            System.out.println("After withdrawal, balance: "+bal);
        }
    }
}

public class bank{
    public static void main(String[] args) {
        Acc a=new SavingsAcc(10.0f,2345, 2300);
        a.withdraw(1500);
        a.withdraw(500);
    }
}
