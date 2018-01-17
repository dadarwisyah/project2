import java.util.Scanner;

public class latihan_w {
        public static void main (String [] hady){
        Scanner in = new Scanner (System.in);
        String nama , notel,alamat ;
        int pilihan;
       
        System.out.print("Menu Pilihan anda : \n 1. Nama dan No k/p \n 2. No Telepon \n 3.Alamat \n\n Masukan pilihan :");
        pilihan = in.nextInt();
        switch (pilihan){
            case 1:{
                System.out.println("\n"+"masukkan nama dan no K/P:");
                nama = in.nextLine();}
            { System.out.println("\n"+" nama dan no K/P anda ialah:"+nama);
            }
                break;
            case 2:{
            System.out.println("\n"+"masukkan no telepon:");
            notel = in.nextLine();   }{     
            System.out.println("\n"+" no telepon anda ialah:"+notel);}
                break;
            case 3:{
               System.out.println("\n"+"masukkan alamat:");
                alamat = in.nextLine();}{
                System.out.println("\n"+" no telepon anda ialah:"+alamat);}
                break;
        }
    }
}


