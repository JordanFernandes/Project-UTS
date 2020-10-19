public class Ride {
    String lokasi;
    String tujuan;
    int biaya;
    int total;
    int jarak;

    public Ride(String lokasi, String tujuan, int biaya, int jarak, int total) {
        this.lokasi = lokasi;
        this.tujuan = tujuan;
        this.biaya = biaya;
        this.jarak = jarak;
        this.total = total;
        total = biaya * jarak;
    }

    void munculRide(){
        System.out.println("Lokasi anda       : " +lokasi);
        System.out.println("Tujuan anda       : " +tujuan);
        System.out.println("total biaya anda  : " +total);
    }
}
