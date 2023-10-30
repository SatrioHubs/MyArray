import java.util.Scanner;

public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa: ");
        int jumMhs = input.nextInt();

        int[] nilaiMhs = new int[jumMhs];
        double total = 0;
        double rata2 = 0, rata2_tidakLulus = 0 ;   
        int countLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                countLulus++;
            }else{
                rata2_tidakLulus += nilaiMhs[i];
            }
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        rata2_tidakLulus /= (nilaiMhs.length - countLulus); 
        System.out.println("Rata-rata = "+rata2);
        System.out.println("Rata-rata tidak lulus: "+rata2_tidakLulus);
        input.close();
    }
}
