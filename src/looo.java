import java.util.Scanner;
 public class Looo
public static void main(String[] args)
   {
   Scanner a = new Scanner(System.in);
       
  int nomk,nomb,nombor,jum_ganjil,jum_genap;
   jum_genap = 0;
   jum_ganjil= 0;
           System.out.println("Masukkan Nombor Terkecil");
               nomk=a.nextInt();
       
           System.out.println("Masukkan Nombor Terbesar");
               nomb=a.nextInt();
               
               nombor=nomk;
               while(nombor<nomb)
               {
                   if(nombor%2==0)
                           {
                              jum_genap=jum_genap+nombor; 
                           }
                   else
                   {
                       jum_ganjil=jum_ganjil+nombor;
                   }
                   nombor++;
               }
           System.out.println("Jumlah Nombor Genap = "+jum_genap);
           System.out.println("Jumlah Nombor Ganjil  = "+jum_ganjil);
   }
}

