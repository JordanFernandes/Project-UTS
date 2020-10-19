import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Selamat datang di OJOL JAKARTA");
        System.out.println("Kami siap mengantarkan anda ke Bandung dan Surabaya dan juga Bogor");
        System.out.println("Kami juga siap mengantarkan makanan ke rumah anda");
        System.out.println("Silahkan pilih menu : ");
        System.out.println("1. Ride");
        System.out.println("2. Food");
        System.out.print("Masukkan pilihan anda (1/2) :");
        int pil = in.nextInt();


        switch(pil) {
            case 1:
                System.out.println("Anda memilih menu Ride, Silahkan pilih rute anda : ");
                System.out.println("1. Jakarta - Bandung");
                System.out.println("2. Jakarta - Surabaya");
                System.out.println("3. Jakarta - Bogor");
                System.out.print("Silahkan dipilih(1/2/3) :");
                int pilih1 = in.nextInt();

                switch (pilih1) {
                    case 1:
                        Ride a = new Ride("jakarta", "bandung", 4000, 50, 200000);
                        a.munculRide();
                        break;

                    case 2:
                        Ride b = new Ride("Jakarta", "Surabaya", 4000, 70, 280000);
                        b.munculRide();
                        break;

                    case 3:
                        Ride c = new Ride("Jakarta", "Bogor", 4000, 30, 120000);
                        c.munculRide();
                        break;
                }
        }

                switch(pil){
                    case 2:
                        System.out.println("Anda memilih menu Food, Silahkan pilih menu makan anda : ");
                        System.out.println("1. Soto betawi");
                        System.out.println("2. Gulai Sapi");
                        System.out.println("Masukkan pilihan anda(1/2) : ");
                        int pilih3 = in.nextInt();

                        switch (pilih3) {

                            case 1:
                                Food d = new Food("Soto betawi", 25000);
                                d.munculfood();
                                break;

                            case 2:
                                Food e = new Food("Gulai sapi", 50000);
                                e.munculfood();
                                break;
                        }

                }
        }
    }
