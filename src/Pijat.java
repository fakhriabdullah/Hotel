/**
 * Created by Anyaman Benang on 26/04/2017.
 */
public class Pijat extends Fasilitas {
    public int jumlahjam;

    public Pijat(int jumlahjam){
        this.jumlahjam=jumlahjam;
    }

    @Override
    public int hitungBayar() {
        return jumlahjam*20000;
    }
}
