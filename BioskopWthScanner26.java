import java.util.Scanner;

public class BioskopWthScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        boolean menu=true;
        while (menu!=false) {
            System.out.println("Pilih menu");
            System.out.println("1. input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
            while (true) {
            System.out.print("Masukan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukan baris: ");
            baris = sc.nextInt();
            System.out.print("Masikan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if(baris==5||kolom==3){
                System.out.println("Baris atau kolom tidak tersedia");
                continue;
            }

            if(penonton[baris-1][kolom-1]!=null){
                System.out.println("tempat sudah terisi pilih tempat lain!");
                continue;
            }else{
            penonton[baris-1][kolom-1] = nama;
            }

            penonton[baris -1][kolom -1] = nama;

            System.out.print("Input Penonton Lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }      
              break;

            case 2:
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    if (penonton[i][j]==null) {
                        penonton[i][j]="***";
                    }
                }
            }

            for (int i = 0; i < penonton.length; i++) {
                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
            }
            break;

            case 3:
            System.out.println("Exit");
            menu = false;
            break;
                default:
                System.out.println("Wrong input");    
        }
        
        }
    }
}
