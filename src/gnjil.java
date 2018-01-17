
 import java.util.Scanner;
public class gnjil {
    public static void main (String args[])
    {
  
        Scanner input=new Scanner(System.in);
     
         System.out.println ("Masukkan sifir yang dikehendaki:" );
   int sifir=input.nextInt();

        int a=1;
        for(a=1;a<=12;a++)
         
         {
           int jumlah =a*sifir
            
          System.out.println ( a + "x" +sifir+"="+jumlah);

         }
}
}