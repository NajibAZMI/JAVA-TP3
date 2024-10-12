import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
public class EXERCICE2 {

        public static void main(String[] args) throws NumberFormatException{
            Scanner in = new Scanner(System.in);
            System.out.println("Entrez une liste de nombres séparés par des espaces :");
            String input = in.nextLine();
            String[] numbers = input.split(" ");
            int sum = 0;
            try{
                for(String num:numbers){
                   sum+=Integer.parseInt(num);
                }
                System.out.println("sum="+sum);
            }catch(NumberFormatException e){
                throw new NumberFormatException("WA LKHRA DIR GHIR LES Nombres Entiers");
            }

        }


}
