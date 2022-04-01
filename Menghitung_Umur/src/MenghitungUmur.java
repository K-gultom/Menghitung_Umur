import java.util.Scanner;

public class MenghitungUmur {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Menghitung Umur");

        //input nama
        System.out.print("Nama = ");
        String nama = userinput.nextLine();

        //tahun lahir
        System.out.print("tahun lahir= ");
        int tahun_lahir = userinput.nextInt();

        //tahun sekarang
        System.out.print("tahun sekarang= ");
        int tahun_sekarang = userinput.nextInt();

        // artimatika
        int umur = tahun_sekarang - tahun_lahir;

        //hasil umur ditahun sekarang
        System.out.print("Umur Sekarang= " + umur);
    }
}
