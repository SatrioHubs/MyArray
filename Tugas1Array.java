import java.util.Scanner;

public class Tugas1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan panjang Array: ");
        int panjang = sc.nextInt();
        int[] blyad = new int[panjang];

        for (int i = 0; i < blyad.length; i++) {
            System.out.print("Masukan Element ke-"+i+": ");
            blyad[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < blyad.length; i++) {
            for (int j = 1; j < blyad.length - i; j++) {
                if (blyad[j - 1] > blyad[j]) {
                    temp = blyad[j];
                    blyad[j] = blyad[j - 1];
                    blyad[j - 1] = temp;    
                }
            }
        }
        int tertinggi = blyad[blyad.length -1];
        int terendah = blyad[0];
        double rata2 = 0;
        for(int i : blyad){
            rata2 += i;
        }
        rata2 /= blyad.length;
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+terendah);
        System.out.println("Nilai Rata: "+rata2);
        sc.close();
    }
}
