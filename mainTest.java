package Inheritance;

public class mainTest {
    public static void main(String[] args) {
        
        manusia a = new manusia("A", "111", true, true);
        System.out.println(a);
        System.out.println();

        mahasiswaFILKOM b = new mahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        System.out.println(b);
        System.out.println();

        pekerja c = new pekerja(1000, 2016, 3, 2, 4, "C", "111", true, true);
        System.out.println(c + "\n");

        manager d = new manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);
        System.out.println(d);
    }
}
