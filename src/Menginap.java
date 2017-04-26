import java.util.ArrayList;

/**
 * Created by user on 26/04/2017.
 */
public class Menginap extends Fasilitas{
    ArrayList<Kamar> arrKamar = new ArrayList<>();
    public int jumlahHari;
    public Kamar kamar;
    public Menginap (Kamar k, int jumlahHari){
        this.kamar = k;
        this.jumlahHari = jumlahHari;
    }
    @Override
    public int hitungBayar() {
        return jumlahHari * kamar.harga;
    }

}
