
import java.util.Scanner;
class loopingg 
{
public static void main(String[] args)
   {
   Scanner a = new Scanner(System.in);
   int i,num,hasil;
   hasil=0;
   
   for(i=1;i<=5;i++)
   {
       System.out.println("Masukkan nilai yang anda mahu:");
       num=a.nextInt();
       System.out.println("NOMBOR "+i+": "+num);
       
       hasil=hasil+num;
   }
   System.out.println("HASIL TAMBAH ADALAH :"+hasil);
   }
}
   

