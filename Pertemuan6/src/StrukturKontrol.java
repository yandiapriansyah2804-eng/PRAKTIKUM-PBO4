import java.util.Scanner;

public class StrukturKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihanMenu;

        do {
            System.out.println("\nS========================================");
            System.out.println("  MENU TUGAS PRAKTIKUM STRUKTUR KONTROL ");
            System.out.println("========================================");
            System.out.println("1. Cek Bilangan Genap / Ganjil[span_2](start_span)[span_2](end_span)");
            System.out.println("2. Menentukan Nama Hari[span_3](start_span)[span_3](end_span)");
            System.out.println("3. Menghitung Gaji Bersih Karyawan[span_4](start_span)[span_4](end_span)");
            System.out.println("4. Menentukan Tahun Kabisat[span_5](start_span)[span_5](end_span)");
            System.out.println("5. Menghitung Pendapatan Salesman[span_6](start_span)[span_6](end_span)");
            System.out.println("6. Program Kasir Sederhana[span_7](start_span)[span_7](end_span)");
            System.out.println("7. Menghitung Luas Bangun Datar[span_8](start_span)[span_8](end_span)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-7): ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihanMenu) {
                case 1:
                    // 1. Menentukan Bilangan Genap atau Ganjil
                    System.out.println("\n--- Soal 1: Genap / Ganjil ---");
                    System.out.print("Masukkan sebuah bilangan bulat: ");
                    int bilangan = scanner.nextInt();
                    if (bilangan % 2 == 0) {
                        System.out.println("Bilangan " + bilangan + " adalah bilangan GENAP[span_9](start_span)[span_9](end_span).");
                    } else {
                        System.out.println("Bilangan " + bilangan + " adalah bilangan GANJIL[span_10](start_span)[span_10](end_span).");
                    }
                    break;

                case 2:
                    // 2. Menentukan Nama Hari Berdasarkan Kode Hari
                    System.out.println("\n--- Soal 2: Penentu Nama Hari ---");
                    System.out.println("1=Senin, 2=Selasa, 3=Rabu, 4=Kamis, 5=Jumat, 6=Sabtu, 7=Minggu[span_11](start_span)[span_11](end_span)");
                    System.out.print("Masukkan kode hari (1-7): ");
                    int kodeHari = scanner.nextInt();
                    switch (kodeHari) {
                        case 1: System.out.println("Hari: Senin[span_12](start_span)[span_12](end_span)"); break;
                        case 2: System.out.println("Hari: Selasa[span_13](start_span)[span_13](end_span)"); break;
                        case 3: System.out.println("Hari: Rabu[span_14](start_span)[span_14](end_span)"); break;
                        case 4: System.out.println("Hari: Kamis[span_15](start_span)[span_15](end_span)"); break;
                        case 5: System.out.println("Hari: Jumat[span_16](start_span)[span_16](end_span)"); break;
                        case 6: System.out.println("Hari: Sabtu[span_17](start_span)[span_17](end_span)"); break;
                        case 7: System.out.println("Hari: Minggu[span_18](start_span)[span_18](end_span)"); break;
                        default: System.out.println("Kode hari tidak valid!");
                    }
                    break;

                case 3:
                    // 3. Menghitung Gaji Bersih Karyawan
                    System.out.println("\n--- Soal 3: Gaji Bersih Karyawan ---");
                    System.out.print("Masukkan NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.println("Golongan: 1. Menikah (Rp1.200.000) | 2. Belum menikah (Rp1.500.000) | 3. Cerai (Rp1.750.000) | 4. Menikah & punya anak (Rp2.000.000)[span_19](start_span)[span_19](end_span)");
                    System.out.print("Masukkan Kode Golongan (1-4): ");
                    int golongan = scanner.nextInt();
                    System.out.print("Masukkan Jumlah Anak: ");
                    int jumlahAnak = scanner.nextInt();

                    double gajiPokok = 0;
                    if (golongan == 1) gajiPokok = 1200000;
                    else if (golongan == 2) gajiPokok = 1500000;
                    else if (golongan == 3) gajiPokok = 1750000;
                    else if (golongan == 4) gajiPokok = 2000000;

                    if (gajiPokok > 0) {
                        double tunjanganPasangan = 0.10 * gajiPokok; // c. 10% dari gaji pokok[span_20](start_span)[span_20](end_span)
                        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak; // d. 5% dari gaji pokok dikali jumlah anak[span_21](start_span)[span_21](end_span)
                        double totalTunjangan = tunjanganPasangan + tunjanganAnak; // b. Jumlah tunjangan pasangan dengan tunjangan anak[span_22](start_span)[span_22](end_span)
                        double gajiBersih = gajiPokok + totalTunjangan; // a. Gaji bersih, jumlah gaji pokok dengan tunjangan[span_23](start_span)[span_23](end_span)

                        System.out.println("\n--- STRUK GAJI KARYAWAN ---");
                        System.out.println("NIK              : " + nik);
                        System.out.println("Nama             : " + nama);
                        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
                        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan);
                        System.out.println("Tunjangan Anak   : Rp " + tunjanganAnak);
                        System.out.println("Total Tunjangan  : Rp " + totalTunjangan);
                        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
                    } else {
                        System.out.println("Kode golongan tidak valid!");
                    }
                    break;

                case 4:
                    // 4. Menentukan Tahun Kabisat
                    System.out.println("\n--- Soal 4: Tahun Kabisat ---");
                    System.out.print("Masukkan tahun: ");
                    int tahun = scanner.nextInt();
                    if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                        System.out.println("Tahun " + tahun + " adalah Tahun Kabisat[span_24](start_span)[span_24](end_span).");
                    } else {
                        System.out.println("Tahun " + tahun + " BUKAN Tahun Kabisat[span_25](start_span)[span_25](end_span).");
                    }
                    break;

                case 5:
                    // 5. Menghitung Pendapatan Salesman
                    System.out.println("\n--- Soal 5: Pendapatan Salesman ---");
                    System.out.print("Masukkan total penjualan hari ini (Rp): ");
                    double penjualan = scanner.nextDouble();
                    double uangJasa = 0, komisi = 0;

                    if (penjualan <= 2000000) {
                        uangJasa = 100000;
                        komisi = 0.10 * penjualan;
                    } else if (penjualan <= 5000000) {
                        uangJasa = 200000;
                        komisi = 0.15 * penjualan;
                    } else {
                        uangJasa = 300000;
                        komisi = 0.20 * penjualan;
                    }
                    double totalPendapatan = uangJasa + komisi;
                    System.out.println("Uang Jasa        : Rp " + uangJasa);
                    System.out.println("Komisi           : Rp " + komisi);
                    System.out.println("Total Pendapatan : Rp " + totalPendapatan);
                    break;

                case 6:
                    // 6. Program Kasir Sederhana
                    System.out.println("\n--- Soal 6: Program Kasir Sederhana ---");
                    System.out.print("Apakah memiliki kartu member? (y/t): ");
                    char member = scanner.next().charAt(0);
                    System.out.print("Masukkan total belanja (Rp): ");
                    double totalBelanja = scanner.nextDouble();
                    double diskon = 0;

                    if (member == 'y' || member == 'Y') {
                        if (totalBelanja > 500000) {
                            diskon = 50000; // b. Belanja > 500rb diskon 50rb[span_26](start_span)[span_26](end_span)
                        } else if (totalBelanja > 100000) {
                            diskon = 15000; // c. Belanja > 100rb diskon 15rb[span_27](start_span)[span_27](end_span)
                        }
                    } else {
                        if (totalBelanja > 100000) {
                            diskon = 10000; // d. Tidak member, belanja > 100rb diskon 10rb[span_28](start_span)[span_28](end_span)
                        }
                    }

                    double harusDibayar = totalBelanja - diskon;
                    System.out.println("Diskon           : Rp " + diskon);
                    System.out.println("Yang Harus Dibayar: Rp " + harusDibayar);

                    System.out.print("Masukkan uang yang diberikan pembeli: ");
                    double uangBayar = scanner.nextDouble();
                    if (uangBayar >= harusDibayar) {
                        double kembalian = uangBayar - harusDibayar;
                        System.out.println("Uang Kembalian   : Rp " + kembalian);
                    } else {
                        System.out.println("Uang pembeli kurang!");
                    }
                    break;

                case 7:
                    // 7. Menghitung Luas Bangun Datar
                    System.out.println("\n--- Soal 7: Menghitung Luas Bangun Datar ---");
                    System.out.println("1. Luas Persegi[span_29](start_span)[span_29](end_span)");
                    System.out.println("2. Luas Segitiga[span_30](start_span)[span_30](end_span)");
                    System.out.println("3. Luas Lingkaran[span_31](start_span)[span_31](end_span)");
                    System.out.println("4. Luas Trapesium[span_32](start_span)[span_32](end_span)");
                    System.out.println("5. Luas Layang-layang[span_33](start_span)[span_33](end_span)");
                    System.out.print("Pilih bangun datar (1-5): ");
                    int pilihBangun = scanner.nextInt();

                    switch (pilihBangun) {
                        case 1:
                            System.out.print("Masukkan sisi persegi: ");
                            double sisi = scanner.nextDouble();
                            System.out.println("Luas Persegi = " + (sisi * sisi));
                            break;
                        case 2:
                            System.out.print("Masukkan alas segitiga: ");
                            double alas = scanner.nextDouble();
                            System.out.print("Masukkan tinggi segitiga: ");
                            double tinggi = scanner.nextDouble();
                            System.out.println("Luas Segitiga = " + (0.5 * alas * tinggi));
                            break;
                        case 3:
                            System.out.print("Masukkan jari-jari lingkaran: ");
                            double r = scanner.nextDouble();
                            System.out.println("Luas Lingkaran = " + (Math.PI * r * r));
                            break;
                        case 4:
                            System.out.print("Masukkan sisi a: ");
                            double a = scanner.nextDouble();
                            System.out.print("Masukkan sisi b: ");
                            double b = scanner.nextDouble();
                            System.out.print("Masukkan tinggi trapesium: ");
                            double t = scanner.nextDouble();
                            System.out.println("Luas Trapesium = " + (0.5 * (a + b) * t));
                            break;
                        case 5:
                            System.out.print("Masukkan diagonal 1: ");
                            double d1 = scanner.nextDouble();
                            System.out.print("Masukkan diagonal 2: ");
                            double d2 = scanner.nextDouble();
                            System.out.println("Luas Layang-layang = " + (0.5 * d1 * d2));
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihanMenu != 0);

        scanner.close();
    }
}