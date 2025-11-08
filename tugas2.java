import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];

        for(int i = 0; i < jmlPesanan; i++){
            System.out.println("Pesanan ke-" + (i+1));

            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i]=sc.nextLine();

            System.out.print("Harga: ");
            hargaPesanan[i]=sc.nextInt();
            sc.nextLine();
        }

        int total = 0;
        for(int i = 0; i < jmlPesanan; i++){
            total+= hargaPesanan[i];
        }

        System.out.println("\n ===== DAFTAR PESANAN =====");
        for(int i = 0; i < jmlPesanan; i++){
            System.out.println((i+1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("\nTotal Bayar: Rp." + total);
    }
}
