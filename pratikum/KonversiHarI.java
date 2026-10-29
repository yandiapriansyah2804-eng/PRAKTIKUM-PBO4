import java.util.Scanner;

public class KonversiHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();
        
        switch (kodeHari) {
            case 1:
                System.out.println("Hari ke-1: Senin");
                break;
            case 2:
                System.out.println("Hari ke-2: Selasa");
                break;
            case 3:
                System.out.println("Hari ke-3: Rabu");
                break;
            case 4:
                System.out.println("Hari ke-4: Kamis");
                break;
            case 5:
                System.out.println("Hari ke-5: Jumat");
                break;
            case 6:
                System.out.println("Hari ke-6: Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-7: Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Masukkan angka 1 sampai 7.");
        }
        
        input.close();
    }
}