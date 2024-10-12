import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ArithmeticException{
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("a=");
        a= in.nextInt();
        System.out.println("b=");
        b= in.nextInt();
        try {

            System.out.println(a / b);
        }catch (ArithmeticException e){
             throw new ArithmeticException("wa lkhra 0 la");
        }
    }
}
