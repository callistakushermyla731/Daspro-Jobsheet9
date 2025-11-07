import java.util.Scanner;
public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        int[] arrNilai = new int[jmlNilai];
        
        for(int i = 0; i < jmlNilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i]=sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for(int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        
        if (hasil !=-1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("\nNilai "+ key + "tidak ditemukan.");
        }
    }
}
