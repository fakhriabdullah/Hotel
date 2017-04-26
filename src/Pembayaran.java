import java.util.ArrayList;

/**
 * Created by fakhriabdullah on 26/04/2017.
 */
public class Pembayaran {
    Tamu tamu;
    ArrayList<Fasilitas> arrFasilitas = new ArrayList<>();
    int totalBayar;

    public void addFasilitas(Fasilitas f){
        arrFasilitas.add(f);
    }

    public void setTamu(Tamu t)
    {
        this.tamu=t;
    }

    public int hitungBayar()
    {
        int total=0;
        for(Fasilitas f : arrFasilitas)
        {
            total = total+f.hitungBayar();
        }
        return total;
    }

    public static void main(String[] args){
        Pembayaran p1=new Pembayaran();
        Tamu t=new Tamu(1,"Arif");
        Fasilitas f;
        p1.setTamu(t);
    }
}
