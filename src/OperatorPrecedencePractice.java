public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        {
            // - Buat variabel: a = 10, b = 5, c = 2
            int a = 10, b = 5, c = 2;

            // - Hitung hasil dari: a + b * c
            // Prediksi: b * c = 5 * 2 = 10 -> a + 10 = 20
            int result1 = a + b * c;
            System.out.println("a + b * c = " + result1 + " (prediksi: 20)");

            // - Hitung hasil dari: (a + b) * c
            // Prediksi: (10 + 5) * 2 = 30
            int result2 = (a + b) * c;
            System.out.println("(a + b) * c = " + result2 + " (prediksi: 30)");

            // - Hitung hasil dari: a * b + c / 2
            // Penjelasan: a*b = 10*5 = 50; c/2 = 2/2 = 1 (integer division); jadi 50 + 1 = 51
            int result3 = a * b + c / 2;
            System.out.println("a * b + c / 2 = " + result3 + " (50 + 1 = 51)");

            // - Hitung hasil dari: a / b + c * 2
            // Evaluasi step-by-step: a/b = 10/5 = 2; c*2 = 2*2 = 4; 2 + 4 = 6
            int result4 = a / b + c * 2;
            System.out.println("a / b + c * 2 = " + result4 + " (2 + 4 = 6)");
        }

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        {
            // - Buat variabel: x = 15, y = 10, z = 20
            int x = 15, y = 10, z = 20;

            // - Evaluasi: x + y > z - 5
            // Urutan: (x + y) dan (z - 5) dihitung dulu, lalu perbandingan
            // (15 + 10) > (20 - 5) => 25 > 15 => true
            boolean eval1 = x + y > z - 5;
            System.out.println("x + y > z - 5 : " + eval1 + " (25 > 15)");

            // - Evaluasi: x > y + z / 4
            // Operasi: z/4 dihitung dulu -> 20/4 = 5; y + 5 = 15; x > 15 ? => 15 > 15 => false
            boolean eval2 = x > y + z / 4;
            System.out.println("x > y + z / 4 : " + eval2 + " (15 > 15 => false)");

            // - Evaluasi: (x + y) > (z - 5) && x < z
            // Tanda kurung memaksa urutan aritmatika, lalu && di-evaluate
            boolean eval3 = (x + y) > (z - 5) && x < z;
            System.out.println("(x + y) > (z - 5) && x < z : " + eval3);

            // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
            // Prediksi: x*2 + y = 30 + 10 = 40; 40 > 20 => true; y < x + 5 => 10 < 20 => true -> overall true
            boolean eval4 = x * 2 + y > z && y < x + 5;
            System.out.println("x * 2 + y > z && y < x + 5 : " + eval4 + " (prediksi: true)");
        }

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        {
            // - Buat variabel boolean: p = true, q = false, r = true
            boolean p = true, q = false, r = true;

            // - Evaluasi: p && q || r
            // && dievaluasi sebelum ||, jadi (p && q) || r => (true && false) || true => false || true => true
            boolean res1 = p && q || r;
            System.out.println("p && q || r = " + res1 + " (because (p && q) || r)");

            // - Evaluasi: p || q && r
            // q && r dievaluasi dulu => false && true = false; p || false => true
            boolean res2 = p || q && r;
            System.out.println("p || q && r = " + res2);

            // - Evaluasi: !p && q || r
            // !p dihitung dulu -> false; false && q -> false; false || r -> true
            boolean res3 = !p && q || r;
            System.out.println("!p && q || r = " + res3);

            // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
            boolean res4 = p && (q || r); // q || r = true -> p && true = true
            System.out.println("p && (q || r) = " + res4 + " (compared with p && q || r which was " + res1 + ")");
        }

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        {
            // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
            int num1 = 25, num2 = 15, num3 = 30;

            // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
            // Langkah: num2+5=20 -> 25>20 true; num3/2=15 -> 15<25 true; true && true => true
            boolean case1 = num1 > num2 + 5 && num3 / 2 < num1;
            System.out.println("num1 > num2 + 5 && num3 / 2 < num1 : " + case1);

            // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
            // Perlu diingat: && sebelum ||
            // Kalkulasi: num1+num2=40>30 => true; num3-num1=5 <10 => true; num2>10 => 15>10 true; right side true && true = true; overall true || true = true
            boolean case2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
            System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 : " + case2);

            // - Gunakan tanda kurung: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
            boolean case3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
            System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 : " + case3 + " (parentheses change grouping)");
        }

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        {
            // - Buat variabel: value = 8
            int value = 8;

            // - Evaluasi: ++value * 2
            // ++value increments first -> value becomes 9 -> 9 * 2 = 18
            int r1 = ++value * 2;
            System.out.println("++value * 2 = " + r1 + " (value after = " + value + ")");

            // - Reset value ke 8, lalu evaluasi: value++ * 2
            value = 8;
            int r2 = value++ * 2; // uses 8 * 2 = 16, then value becomes 9
            System.out.println("value++ * 2 = " + r2 + " (value after = " + value + ")");

            // - Reset value ke 8, lalu evaluasi: 2 * ++value
            value = 8;
            int r3 = 2 * ++value; // ++value -> 9, 2*9 = 18
            System.out.println("2 * ++value = " + r3 + " (value after = " + value + ")");

            // - Reset value ke 8, lalu evaluasi: -value + 10
            value = 8;
            int r4 = -value + 10; // unary minus applied first -> -8 + 10 = 2
            System.out.println("-value + 10 = " + r4 + " (value unchanged = " + value + ")");
        }

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        {
            // - Buat variabel: a = 5, b = 10
            int a = 5, b = 10;

            // - Evaluasi dan jelaskan: a += b * 2
            // b*2 = 20; then a += 20 -> a = 25
            a += b * 2;
            System.out.println("a += b * 2 -> a = " + a + " (aritmatika terjadi dulu)");

            // - Reset a ke 5, lalu evaluasi: a *= b + 3
            a = 5;
            a *= b + 3; // b+3 = 13; a = 5 * 13 = 65
            System.out.println("a *= b + 3 -> a = " + a + " (b+3 dihitung dulu)");

            // - Evaluasi: a = b > 5 ? b * 2 : b / 2
            // Dengan b = 10, b > 5 true -> a = b * 2 -> 20
            a = (b > 5) ? b * 2 : b / 2;
            System.out.println("a = b > 5 ? b * 2 : b / 2 -> a = " + a);
        }

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        {
            // - Buat variabel: a = 8, b = 4, c = 2, d = 6
            int a = 8, b = 4, c = 2, d = 6;

            // - Bandingkan hasil dari: a + b * c - d
            // langkah: b*c=8 -> a + 8 = 16 -> 16 - d(6) = 10
            int expr1 = a + b * c - d;
            System.out.println("a + b * c - d = " + expr1 + " (8 + 4*2 - 6 => 10)");

            // - dan (a + b) * (c - d)
            // langkah: (a+b)=12; (c-d)= -4; 12 * -4 = -48
            int expr2 = (a + b) * (c - d);
            System.out.println("(a + b) * (c - d) = " + expr2 + " (12 * -4 => -48)");

            // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
            // Using operator precedence: && before ||, parentheses change grouping
            boolean logic1 = a > b && c < d || a == b; // (a > b && c < d) || a == b
            boolean logic2 = a > b && (c < d || a == b);
            System.out.println("a > b && c < d || a == b = " + logic1);
            System.out.println("a > b && (c < d || a == b) = " + logic2);

            // - Buat ekspresi nested kompleks: ((a + b) * c) / (d - 2) > (a - b)
            // langkah: (a+b)=12 -> *c = 24; (d-2)=4 -> 24 / 4 = 6; (a-b)=4 -> 6 > 4 => true
            boolean nested = ((a + b) * c) / (d - 2) > (a - b);
            System.out.println("((a + b) * c) / (d - 2) > (a - b) = " + nested + " (6 > 4 => true)");
        }
    }
}
