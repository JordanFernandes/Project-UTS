public class Food {
    String nama;
    int harga;


    public Food(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
        void munculfood(){
            System.out.println("Anda memilih makanan : " +nama);
            System.out.println("Total order anda     : " +harga);
        }

    }
