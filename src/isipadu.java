
 import java.util.Scanner;
 public class isipadu
 {
   public static void main (String args[])
   {        
Scanner input=new Scanner(System.in);
System.out.println ("Masukkan pilihan diantara kuboid dan silinder " );
 char bentuk =input.next().charAt(0);

switch(bentuk){
    case 'k':
  System.out.println ("Masukkan panjang kuboid" );
  int panjang= input.nextInt();
          
  System.out.println ("Masukkan lebar kuboid" );
  int lebar= input.nextInt();
  
  System.out.println ("Masukkan tinggi kuboid" );
  int tinggi= input.nextInt();
  
int keseluruhan =(panjang*lebar)*tinggi;  

  System.out.println ("hasil isipadu anda ialah"+keseluruhan );

  break;
  case's':

  System.out.println ("Masukkan jejari silinder");
  int jejari= input.nextInt();
  
  System.out.println ("Masukkan tinggi siinder");
  int tinggi1= input.nextInt();
  
 double keseluruhan1=3.142*jejari*jejari*tinggi1;

  System.out.println ("hasil isipadu anda ialah "+keseluruhan1);
}
   }
   }

 
 
