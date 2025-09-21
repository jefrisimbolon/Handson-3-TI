public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum = 25;
        int secondNum = 18;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum > secondNum: " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum < secondNum: " + (firstNum < secondNum));

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum >= secondNum: " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum <= secondNum: " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum == secondNum: " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum != secondNum: " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        System.out.println("price1 < price2: " + (price1 < price2));

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        System.out.println("Selisih harga < 1.0: " + (Math.abs(price1 - price2) < 1.0));

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        double sum = 0.1 + 0.2;
        double expected = 0.3;
        System.out.println("0.1 + 0.2 == 0.3 ? " + (sum == expected));
        System.out.println("Nilai sum sebenarnya: " + sum);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A';
        char letter2 = 'B';

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("A < B ? " + (letter1 < letter2)); // Benar karena 'A' (65) lebih kecil dari 'B' (66)

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        System.out.println("a > A ? " + ('a' > 'A')); // 'a' (97) lebih besar dari 'A' (65)

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char digit = '7';
        System.out.println("Apakah '7' digit? " + (digit >= '0' && digit <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("name1 == name2: " + (name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("name1 == name3: " + (name1 == name3)); // False karena objek berbeda

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("name1.equals(name3): " + name1.equals(name3));

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        System.out.println("\"Java\".equals(\"java\"): " + "Java".equals("java"));

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + "Java".equalsIgnoreCase("java"));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85, passingGrade = 60, honorRoll = 90;

        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        System.out.println("Siswa lulus? " + (grade >= passingGrade));

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        System.out.println("Siswa honor roll? " + (grade >= honorRoll));

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum alkohol? " + (age >= drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60
        int originalPrice = 100, discountThreshold = 50;
        int customerAge = 65, seniorAge = 60;

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        boolean bulkDiscount = originalPrice > discountThreshold;

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        boolean seniorDiscount = customerAge >= seniorAge;

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        boolean eligibleForDiscount = bulkDiscount || seniorDiscount;
        System.out.println("Diskon bulk? " + bulkDiscount);
        System.out.println("Diskon senior? " + seniorDiscount);
        System.out.println("Kelayakan akhir diskon: " + eligibleForDiscount);

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        System.out.println("Score valid (0-100)? " + (score >= 0 && score <= 100));

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int temperature = 25;
        System.out.println("Suhu valid (-10 sampai 40)? " + (temperature >= -10 && temperature <= 40));

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175, minHeight = 160, maxHeight = 200;

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        System.out.println("Tinggi valid (160-200)? " + (height >= minHeight && height <= maxHeight));

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        int testScore = 73;
        String gradeResult;
        if (testScore >= 90) gradeResult = "A";
        else if (testScore >= 80) gradeResult = "B";
        else if (testScore >= 70) gradeResult = "C";
        else if (testScore >= 60) gradeResult = "D";
        else gradeResult = "F";

        System.out.println("Nilai akhir untuk " + testScore + " adalah: " + gradeResult);
    }
}
