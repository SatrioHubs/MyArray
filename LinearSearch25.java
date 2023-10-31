import java.util.Scanner;

public class LinearSearch25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang Array: ");
        int panjang = input.nextInt();

        int[] arrayInt = new int [panjang];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukan element array ke-"+i+" : ");
            arrayInt[i] = input.nextInt();
        }
        System.out.print("Masukan Key yang di cari: ");
        int key = input.nextInt();
        int hasil = 0;
        boolean keytemu = false;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                keytemu = true;
                break;
            }
        }
        if (keytemu) {
            System.out.println("Key yang anda cari ada pada element ke-"+hasil);
        } else{
            System.out.println("Key tidak di temukan");
        }
        input.close();
    }
}