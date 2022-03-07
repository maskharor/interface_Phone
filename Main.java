package latihan_interface;
import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        //membuat objek HP xiaomi
        Phone redmiNote8 = new Xiaomi();
        
         // objek hp iphone 
        Phone iphone11 = new Iphone();
        
        // objek hp samsung 
        Phone samsungS22 = new Samsung();
        
        // objek hp Oppo
        Phone oppoA3 = new Oppo();
        
        
        //input merek 
        String merek;
        System.out.print("merek hp : ");
        merek = input.next();
        
        //membuat objek user xiaomi 
        PhoneUser maska = new PhoneUser(redmiNote8);
        
        //membuat objek user iphone
        PhoneUser maskharor = new PhoneUser(iphone11);
        
        //membuat objek user Samsung
        PhoneUser amnan = new PhoneUser(samsungS22);
        
        //membuat objek user 
        PhoneUser nidhom = new PhoneUser(oppoA3);
        
        int aksi;
       
        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
         
           if (merek.equalsIgnoreCase("xiaomi")){
            switch(aksi){
                case 1:
                    maska.turnOnThePhone();
                    break;
                case 2:
                    maska.turnOffThePhone();
                    break;
                case 3:
                    maska.makePhoneLouder();
                    break;
                case 4:
                    maska.makePhoneSilent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah input!!");
               }
           }
           else if (merek.equalsIgnoreCase("Iphone")){
               switch(aksi){
                case 1:
                    maskharor.turnOnThePhone();
                    break;
                case 2:
                    maskharor.turnOffThePhone();
                    break;
                case 3:
                    maskharor.makePhoneLouder();
                    break;
                case 4:
                    maskharor.makePhoneSilent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah input!!");
               }
           }
           else if (merek.equalsIgnoreCase("Samsung")){
               switch(aksi){
                case 1:
                    amnan.turnOnThePhone();
                    break;
                case 2:
                    amnan.turnOffThePhone();
                    break;
                case 3:
                    amnan.makePhoneLouder();
                    break;
                case 4:
                    amnan.makePhoneSilent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah input!!");
               }
           }
            else if (merek.equalsIgnoreCase("oppo")){
               switch(aksi){
                case 1:
                    nidhom.turnOnThePhone();
                    break;
                case 2:
                    nidhom.turnOffThePhone();
                    break;
                case 3:
                    nidhom.makePhoneLouder();
                    break;
                case 4:
                    nidhom.makePhoneSilent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah input!!");
               }
           }
            else {
                System.out.println("Merek tidak ditemukan");
                System.exit(0);
            }
             
        }
    }
}
