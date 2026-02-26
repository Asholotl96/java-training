@SuppressWarnings("InitializerMayBeStatic")
class Product{
    String prodName;
    double price;
    static{
        System.out.println("Product class loaded");
    }
    //IIB
    {
        System.out.println("Product object created");
    }
    Product(String prodName, double price) {
        this.prodName = prodName;
        this.price = price;
    }
    double calcDisc(){
        return price;
    }
}
class Electronics extends Product{
    @SuppressWarnings("unused")
    int warr;
    public Electronics(String pname,double price,int warr) {
        super(pname,price);
        this.warr=warr;
    }
    @Override
    double calcDisc(){
        return price-(0.1*price);
    }
}
public class shop {
    public static void main(String[] args) {
        Product p=new Electronics("Laptop",6700,4);
        double sp=p.calcDisc();
        System.out.println("Product: "+p.prodName+"\nOriginal Price: "+p.price+"\nDiscounted price: "+sp);
    }
}
