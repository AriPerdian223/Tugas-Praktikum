// NAMA  : ARI PERDIAN
// NIM   : 20220040072
// KELAS : TI22J
public class BangunDatar {
    private int p; //panjang
    private int l; //lebar
    private int s; //sisi
    
    //Konstruktor untuk persegi panjang
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    //Konstruktor untuk BujurSangkar
    BangunDatar(int s){
        this.s = s;
    }
    
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setS(int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL(){
        return l;
    }
    
    int getS(){
        return s;
    }
}
