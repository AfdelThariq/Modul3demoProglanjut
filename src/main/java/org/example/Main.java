import java.util.Scanner;

/**
 * Kelas utama untuk menghitung rasio KDA (Kill/Death/Assist) dari pemain dalam sebuah game.
 * Program ini menerima input jumlah kills, deaths, dan assists, kemudian menghitung
 * dan menampilkan rasio KDA.
 *
 * Formula KDA:
 * KDA = (Kill + Assist) / Death
 *
 * Jika jumlah deaths adalah 0, maka KDA dihitung sebagai (Kill + Assist).
 */
public class Main {

    /**
     * Metode utama (main) yang merupakan entry point dari aplikasi.
     * Menerima input dari pengguna berupa kills, deaths, dan assists,
     * lalu menampilkan rasio KDA.
     *
     * @param args argumen baris perintah (command line arguments) – tidak digunakan dalam program ini.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kills: ");
        int kills = scanner.nextInt();

        System.out.print("Masukkan jumlah deaths: ");
        int deaths = scanner.nextInt();

        System.out.print("Masukkan jumlah assists: ");
        int assists = scanner.nextInt();

        // Hitung KDA
        double kda = calculateKDA(kills, deaths, assists);

        // Tampilkan hasil KDA
        System.out.printf("Kills: %d, Deaths: %d, Assists: %d%n", kills, deaths, assists);
        System.out.printf("KDA Ratio: %.2f%n", kda);

        scanner.close();
    }

    /**
     * Menghitung rasio KDA berdasarkan jumlah kills, deaths, dan assists.
     *
     * @param kills Jumlah kill yang dilakukan pemain.
     * @param deaths Jumlah kematian pemain. Jika 0, rasio KDA dihitung sebagai (kills + assists).
     * @param assists Jumlah assist yang diberikan oleh pemain.
     * @return Rasio KDA dalam bentuk desimal. Jika deaths == 0, maka return (kills + assists).
     */
    private static double calculateKDA(int kills, int deaths, int assists) {
        if (deaths == 0) {
            return kills + assists;  // Menghindari pembagian dengan nol
        }
        return (double) (kills + assists) / deaths;
    }
}
