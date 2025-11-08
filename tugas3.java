import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ketemu = false;
        for(int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(cari)) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Makanan " + cari + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + cari + " tidak tersedia di menu.");
        }
    }
}
