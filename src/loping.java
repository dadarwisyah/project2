
import java.util.Scanner;
class loping 
{
    public static void main(String[] args)
    

    {
        
    
         Scanner input=new Scanner(System.in);
    
  System.out.println("Masukkan Nombor anda:");
  int num,nombor;
   nombor=input.nextInt();
   
while(nombor>=1)
{
    for(num=nombor;num>=1;num--)
    {
          System.out.print(nombor+"  ");

    }
    
           System.out.println("  ");
nombor--;

}}}