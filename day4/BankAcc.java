public class BankAcc{
    private String accNum;
    private double bal;
    private int pin;
    private int wrattempt;
    private Boolean locked;
    BankAcc(String accNum,double bal,int pin){
        this.accNum=accNum;
        this.bal=bal;
        this.pin=pin;
        this.wrattempt=0;
        this.locked=false;
    }
    void deposit(double amt){
        if(!locked && amt>0){
            bal+=amt;
            System.out.println("Amount deposited: "+amt);
        }
        else{
            System.out.println("Deposit Failed.");
        }
    }
    void withdraw(double amt, int inpin){
        if(locked){
            System.out.println("Account locked.");
            return;
        }
        if(inpin!=pin){
            wrattempt++;
            if (wrattempt>=3){
                locked=true;
                System.out.println("Too many wrong attempts. Account locked.");
                return;
            }
            System.out.println("Invalid PIN. "+(3-wrattempt)+" attempts left.");
        }
        else if(amt>0 && amt<=25000 && amt<=bal){
            bal-=amt;
            System.out.println("Amount withdrawn: "+amt+"\nBalance: "+bal);
        }
        else{
            System.out.println("Withdrawal failed.");
        }
    }
    void isAccLocked(){
        if (locked){
            System.out.println("Account "+accNum+" locked.");
        }
        else{
            System.out.println("Account "+accNum+" open.");
        }
    }
    public static void main(String[] args){
        BankAcc acc=new BankAcc("5670943",50000,1432);
        acc.deposit(5000);
        acc.isAccLocked();
        acc.withdraw(25000, 1111);
        acc.withdraw(25000, 1111);
        acc.withdraw(25000, 1111);
        acc.isAccLocked();
        acc.withdraw(100,1432);
        BankAcc acc1=new BankAcc("5670944",50000,1342);
        acc1.isAccLocked();
        acc1.deposit(0);
        acc1.withdraw(26000,1342);
        acc1.withdraw(24000,1342);
    }
}