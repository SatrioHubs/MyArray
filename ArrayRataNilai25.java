import java.util.Scanner;

public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;   
        int countLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                countLulus++;
            }
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata = "+rata2);
        System.out.println("Mahasiswa yang lulus : "+countLulus);
    }
}
