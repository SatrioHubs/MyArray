import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan Nilai Akhir ke-"+i+" : ");
            nilaiAkhir[i] = input.nextInt();

        }
        for (int i = 0; i < 10; i++) {
           if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-"+i+" Lulus");
           } else{
            System.out.println("Mahasiswa ke-"+i+" Tidak Lulus");
           }
            input.close();
        }
    }
}
