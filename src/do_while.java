import java.util.Scanner;
class do_while 
{
public static void main(String[] args)
   {
   Scanner a = new Scanner(System.in);
   int i,num,hasil;
   hasil=0;
   i=1;
   do
   {
       System.out.println("Masukkan Nombor anda mahu:");
       num=a.nextInt();
       System.out.println("NOMBOR "+i+": "+num);
       
       hasil=hasil+num;
       i++;
   }while(i<=5);
   System.out.println("HASIL TAMBAH ADALAH :"+hasil);
   }
}

