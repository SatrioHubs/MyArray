import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan Nilai Akhir ke-"+i+" : ");
            nilaiAkhir[i] = input.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah " + nilaiAkhir[i]);
        }
    }
}
