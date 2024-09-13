import java.util.Scanner;

public class Siakad11 {
    public static void main(String[] args) {
        // Deklarasi Input
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        String nama,nim;
        String kelas;
        byte absen;
        double nilaiKuis,nilaiTugas,nilaiUts,nilaiUas,nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama=sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas=sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen=sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis=sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts=sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas=sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUts * 30/100) + (nilaiUas * 35/100);

        System.out.println("Nama: "+nama+" NIM: "+nim);
        System.out.println("Kelas: "+kelas+" Absen: "+absen);
        System.out.println("Nilai Akhir: "+nilaiAkhir);

        sc.close();
    }
}
