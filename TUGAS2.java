import java.util.Scanner;
public class TUGAS2 {
    // menghitung luas dan keliling persegi
    public static  void  hitungPersegi(Scanner scanner){
        System.out.println("menghitung sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Hasil perhiutngan persegi: ");
        System.out.println("Luas: "+ luas);
        System.out.println("keliling:" + keliling);
    }
//menghitung luas dan keliling persegi panjang
public  static void hitungPersegiPanjang(Scanner scanner){
    System.out.println("Masukkan panjang persegi panjang: ");
    double panjang = scanner.nextDouble();
    System.out.println("masukkan lebar persegi panjang: ");
    double lebar = scanner.nextDouble();
    double luas = panjang * lebar;
    double keliling = 2 * ( panjang  + lebar);
    System.out.println("Hasil perhitungan persegi panjang:");
    System.out.println("Luas: "+ luas);
    System.out.println("Keliling: " + keliling);
}
 // menghitung luas dan keliling lingkaran
    public static void hitungLingkaran(Scanner scanner){
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double luas = Math.PI * jariJari * jariJari; // perhitungan luas
        double keliling = 2 * Math. PI * jariJari; // perhiutngan keliling
        System.out.println("Hasil perhitungan lingkaran: ");
        System.out.println("Luas: " + keliling);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang ingin dihitung: ");
        System.out.println("1. persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan pilihan Anda (1/2/3):");

        int pilihan = scanner.nextInt();

        switch (pilihan){
            case 1 :
                hitungPersegi(scanner);
                break;
            case 2:
                hitungPersegiPanjang(scanner);
                break;
            case 3:
                hitungLingkaran(scanner);
                break;
            default:
                System.out.println("Pilihan tidak sesuai. Silahkan coba lagi.");
        }
    }
}





