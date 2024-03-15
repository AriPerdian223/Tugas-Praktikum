// NAMA  : ARI PERDIAN
// NIM   : 20220040072
// KELAS : TI22J
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar(int s){
        super(s);
    }
    
    int hitungLuas(){
        int s = super.getS();
        return s * s;
    }
    
    int hitungKeliling(){
        int s = super.getS();
        return 4 * s;
    }
    
    @Override
    public String toString(){
        return "Luas Bujur sangkar:" + hitungLuas()+ "\n" +
               "Luas Bujur sangkar:" + hitungKeliling()+ "\n";
    }
     
    
}
