import java.util.Scanner;
public class ArrIndex{
    static void fetchElem(int[] arr,int ind) throws ArrayIndexOutOfBoundsException{
        if(ind<0 || ind>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        else{
            System.out.println(arr[ind]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int ind=sc.nextInt();
        try{
            fetchElem(arr,ind);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}