package phuongtien;

public class XeMay extends PhuongTien implements Comparable<XeMay>{
    private int dungTich;


    public XeMay() {

    }

    @Override
    public int compareTo(Oto o) {
        return 0;
    }

    public XeMay(String hang, String mau, String ten, int gia, int dungtich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungtich;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{ ten " + getTen() + " , gia = " + getGia() +
                " , Dung Tich = " + dungTich +
                '}';
    }

    @Override
    public int compareTo(XeMay o) {
        return 0;
    }
}