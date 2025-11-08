import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
    
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        int jmlNilai = 0;
        for(int i = 0; i < jmlMhs; i++){
            jmlNilai += nilaiMhs[i];
        }
        double rata2 = (double)jmlNilai / jmlMhs;

        int max = nilaiMhs[0];
        int min = nilaiMhs[0];
        for(int i = 1; i < jmlMhs; i++){
            if(nilaiMhs[i] > max){
                max = nilaiMhs[i];
            }
            if(nilaiMhs[i] < min){
                min = nilaiMhs[i];
            }
        }

        System.out.println("\n===== HASIL PENGELOLAAN NILAI =====");

        System.out.println("\nNilai Mahasiswa: ");
        for(int i = 0; i < jmlMhs; i++){
            System.out.println("Nilai mahasiswa ke-"+ (i+1) +": " + nilaiMhs[i]);
        }
        System.out.println("\nRata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}
