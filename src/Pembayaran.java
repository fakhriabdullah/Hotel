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

    public void print()
    {
        int total=0;
        System.out.println("=======================");
        System.out.println("Id : "+tamu.id);
        System.out.println("Nama : "+tamu.nama);
        System.out.println("-----------------------");
        for (Fasilitas f : arrFasilitas)
        {
            System.out.println("Fasilitas : "+f.namaFasilitas);
            System.out.println("Biaya : "+f.hitungBayar());
            total+=f.hitungBayar();
        }
        System.out.println("Total Pembayaran : Rp "+total);

    }

    public static void main(String[] args){
        Pembayaran p1=new Pembayaran();
        Tamu t;
        Fasilitas f;
        Kamar k1 = new Kamar(1,500000);
        Kamar k2 = new Kamar(2,400000);
        Kamar k3 = new Kamar(3,300000);

        t=new Tamu(1,"Arif");
        p1.setTamu(t);

        f = new Menginap(k1,4);
        p1.addFasilitas(f);
        f = new Pijat(3);
        p1.addFasilitas(f);
        p1.print();

        Pembayaran p2 = new Pembayaran();
        t=new Tamu(2,"Yusup");
        p2.setTamu(t);
        f = new Menginap(k2,1);
        p2.addFasilitas(f);
        p2.print();

        Pembayaran p3 = new Pembayaran();
        t=new Tamu(3,"Ijal");
        p3.setTamu(t);
        f = new Menginap(k3,3);
        p3.addFasilitas(f);
        f = new Laundry(3000,"Biasa");
        p3.addFasilitas(f);
        p3.print();
    }
}
