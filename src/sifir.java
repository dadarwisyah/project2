import java.util.Scanner;
class sifir
{
public static void main(String[] args)
   {
       int i,hasil,d3;
       d3=3;
       i=1;
   Scanner a = new Scanner(System.in);     
   System.out.println("Sifir 3\n");  
   do   
   {
       hasil=i*d3;
       System.out.println(i+" x "+d3+"= "+hasil);
           i++;    
   }while(i<=12);
   }
}


