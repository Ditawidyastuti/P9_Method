public class Truk{

    double muatan;
    double muatanmaks;

    public Truk(double beratmaks){
      muatanmaks=beratmaks;
    }

    public double getMuatan(){

        return muatan;
    }

    public double getMuatanmaks(){

        return muatanmaks;
    }
    public void tambahMuatan(double berat){
        muatan += berat; //muatan = muatan+berat

        if(muatan >= muatanmaks){ //1100>=1000
            muatan -=berat;//muatan = muatan - berat
        }
    }

}