import java.util.Scanner;

public class siakad18 {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
     //Deklarasi
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("Msukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas; ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujian: ");
    nilaiUjian = sc.nextDouble();
    
    //menghitung nilai akhir
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

    System.out.println("Nilai akhir: " + nilaiAkhir);

    System.out.println("Nama: " +  nama  + "NIM: " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir );

        




    }
}





    
