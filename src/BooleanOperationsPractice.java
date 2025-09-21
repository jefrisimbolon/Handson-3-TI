public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        // - Buat variabel boolean: isLoggedIn = true, hasPermission = false
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)
        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel? " + canAccessAdmin);

        // - Test keempat kombinasi operator AND:
        // true && true, true && false, false && true, false && false
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: Berlatih operator OR (||)
        // - Buat variabel boolean: isWeekend = false, isHoliday = true
        boolean isWeekend = false;
        boolean isHoliday = true;

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)
        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Hari libur? " + isDayOff);

        // - Test keempat kombinasi operator OR:
        // true || true, true || false, false || true, false || false
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: Berlatih operator NOT (!)
        // - Buat variabel boolean: isRaining = true
        boolean isRaining = true;

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'
        boolean isSunny = !isRaining;
        System.out.println("IsSunny: " + isSunny);

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya
        System.out.println("!!isRaining = " + (!!isRaining));

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya
        System.out.println("!(5 > 3) = " + (!(5 > 3))); // false, karena 5 > 3 itu true, lalu dibalik dengan NOT

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        // - Buat variabel untuk evaluasi siswa
        // attendanceGood = true, gradesHigh = false, behaviorGood = true
        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood
        boolean outstanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa outstanding? " + outstanding);

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)
        boolean satisfactory = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("Siswa memuaskan? " + satisfactory);

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood
        boolean needsImprovement = !attendanceGood || !behaviorGood;
        System.out.println("Siswa perlu perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        // - Buat variabel untuk sistem keamanan
        // hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime
        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        System.out.println("Akses normal: " + normalAccess);

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        System.out.println("Akses darurat: " + emergencyAccess);

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)
        boolean accessDenied = !(normalAccess || emergencyAccess);
        System.out.println("Akses ditolak: " + accessDenied);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        // isRaining = false, isSnowing = true, temperature = -5, isCloudy = true
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0
        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        System.out.println("Cuaca bagus untuk outdoor? " + goodWeather);

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        System.out.println("Butuh payung? " + needUmbrella);

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)
        boolean dangerousRoad = isSnowing || (isRaining && temperature < 5);
        System.out.println("Jalan berbahaya? " + dangerousRoad);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        // - Buat variabel: a = 5, b = 0
        int a = 5, b = 0;

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean safeAnd = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2) = " + safeAnd);

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean safeOr = (b == 0) || (a / b > 2);
        System.out.println("(b == 0) || (a / b > 2) = " + safeOr);

        // - Jelaskan dalam komentar mengapa ekspresi ini aman
        // Karena pada short-circuit:
        // - AND berhenti jika kondisi pertama false
        // - OR berhenti jika kondisi pertama true
        // sehingga pembagian a / b tidak pernah dijalankan.

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        // - Buat variabel untuk simulasi operasi mahal
        // expensiveCheck1 = false, expensiveCheck2 = true
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        // - Simulasikan AND short-circuit: expensiveCheck1 && expensiveCheck2
        boolean andSimulation = expensiveCheck1 && expensiveCheck2;
        System.out.println("expensiveCheck1 && expensiveCheck2 = " + andSimulation);
        // Karena expensiveCheck1 = false, maka expensiveCheck2 tidak akan dievaluasi (short-circuit).

        // - Simulasikan OR short-circuit: expensiveCheck2 || expensiveCheck1
        boolean orSimulation = expensiveCheck2 || expensiveCheck1;
        System.out.println("expensiveCheck2 || expensiveCheck1 = " + orSimulation);
        // Karena expensiveCheck2 = true, maka expensiveCheck1 tidak akan dievaluasi (short-circuit).
    }
}
