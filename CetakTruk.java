public class CetakTruk {

    public static void main(String agr []){
        Truk truk = new Truk(1000);
        System.out.println("Muatan maksimal : "+truk.getMuatanmaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah Muatan : 500");
        truk.tambahMuatan (350.0);
        System.out.println("Tambah Muatan : 350");
        truk.tambahMuatan (100.0);
        System.out.println("Tambah Muatan : 100");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah Muatan : 150");
        System.out.println("Muatan Sekarang  = "+truk.getMuatan());
                        
    }
}