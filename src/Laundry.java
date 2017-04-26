/**
 * Created by Anyaman Benang on 26/04/2017.
 */
public class Laundry extends Fasilitas{
    public int berat; //pergram
    public String jenis;


    public Laundry (int berat, String jenis){
        this.berat=berat;
        this.jenis=jenis;
        this.namaFasilitas = "Laundry";
    }
    @Override
    public int hitungBayar(){
        return (berat/1000)*10000;
    }
}
