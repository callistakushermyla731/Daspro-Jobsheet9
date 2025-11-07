import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[5];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2;
        int jmlLulus = 0, jmlTdkLulus = 0;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
               jmlLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
            
        double rata2Lulus, rata2TdkLulus;
        if (jmlLulus > 0) {
            rata2Lulus = totalLulus / jmlLulus;
        } else {
            rata2Lulus = 0;
        }
        
        if (jmlTdkLulus > 0) {
            rata2TdkLulus = totalTdkLulus / jmlTdkLulus;
        } else {
            rata2TdkLulus = 0;
        }

        System.out.println();
        System.out.println("Rata-rata nilai Lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}
