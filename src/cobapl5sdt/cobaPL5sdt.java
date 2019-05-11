package cobaPL5sdt;

import java.text.DecimalFormat;
import java.util.*;

public class cobaPL5sdt {

    public static void main(String[] args) {
        System.out.print("Masukkan Sudut : ");
        Sudutku sdt = new Sudutku();
        sdt.hitung();
    }

}

class Sudutku {

    Scanner masuk = new Scanner(System.in);

    void hitung(){
        double sudut, sudutDerajat, sudutRadians, hasilSin, hasilCos, hasilTan, hasilAsin, hasilAcos, hasilAtan;
        
        sudut = masuk.nextDouble();

        sudutRadians = Math.toRadians(sudut);
        sudutDerajat = Math.toDegrees(sudutRadians);

        hasilSin = Math.sin(sudutRadians);
        hasilCos = Math.cos(sudutRadians);
        hasilTan = Math.tan(sudutRadians);

        hasilAsin = Math.sin(hasilSin);
        hasilAcos = Math.cos(hasilCos);
        hasilAtan = Math.tan(hasilTan);

        DecimalFormat digitPresisi = new DecimalFormat("0.000");

        System.out.println(
                "Fungsi Trigonometri : \n"
                + "-----------------------------------------\n"
                + "Sinus dari sudut     : " + sudut + "  adalah " + digitPresisi.format(hasilSin) + "\n"
                + "Cosinus dari sudut   : " + sudut + "  adalah " + digitPresisi.format(hasilCos) + "\n"
                + "Tangen dari sudut    : " + sudut + "  adalah " + digitPresisi.format(hasilTan) + "\n"
                + "Arc Sinus dari       : " + digitPresisi.format(hasilSin) + " adalah " + digitPresisi.format(Math.toDegrees(hasilAsin)) + "\n"
                + "Arc Cosinus dari     : " + digitPresisi.format(hasilCos) + " adalah " + digitPresisi.format(Math.toDegrees(hasilAcos)) + "\n"
                + "Arc Tange dari       : " + digitPresisi.format(hasilTan) + " adalah " + digitPresisi.format(Math.toDegrees(hasilAtan))
        );
    }
}
