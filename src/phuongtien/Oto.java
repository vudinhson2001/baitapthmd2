package phuongtien;

public class Oto extends PhuongTien implements Comparable<Oto>{
    private int soCho;

    public Oto(int socho) {
        this.soCho = socho;
    }

    public Oto(String hang, String mau, String ten, int gia, int socho) {
        super(hang, mau, ten, gia);
        this.soCho = socho;
    }

    public double getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "Oto{ ten " + getTen() + ", gia = " + getGia() + " , Hang: "+getHang()+
                " ,socho=" + soCho +
                '}';
    }
    @Override
    public int compareTo(Oto o) {
        return (int) (this.getGia()-o.getGia());
    }
}
