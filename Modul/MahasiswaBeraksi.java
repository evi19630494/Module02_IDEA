package Modul;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksi {

    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa ();
        mahasiswa.npm = "19630494";
        mahasiswa.setNama("Evi Normulia");
        mahasiswa.tanggalLahir = simpleDateFormat.parse("15-12-2000");

        mahasiswa.tampilAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19630595", "Abizar", "06-06-2002");
        mahasiswa2.tampilAtribut();

    }

}
