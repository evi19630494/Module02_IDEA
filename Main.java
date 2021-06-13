import Modul.Mahasiswa;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Mahasiswa m1 = new Mahasiswa("19630494", "Evi Normulia", "15-12-2000");
        m1.tampilAtribut();
        System.out.println(m1.getNama());


    }
}
