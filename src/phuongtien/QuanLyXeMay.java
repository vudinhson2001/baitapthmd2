package phuongtien;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[3];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        danhSach[timKiem(name)] = null;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(danhSach[i].getTen())) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void sapXep() {
        Arrays.sort(danhSach);

    }
    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Yamaha", "Xanh", "R3", 120, 300);
        XeMay xm2 = new XeMay("Yamaha", "Đỏ", "R15", 70, 150);
        XeMay xm3 = new XeMay("Yamaha", "Trắng", "R6", 220, 600);
        quanLyXeMay.them(xm1);
        quanLyXeMay.them(xm2);
        quanLyXeMay.them(xm3);
        quanLyXeMay.print();
        XeMay xm4    = new XeMay("Yamaha", "Hồng", "R1", 1000, 900);
        quanLyXeMay.sua("R15",xm4);
        quanLyXeMay.print();
        quanLyXeMay.sapXep();
        quanLyXeMay.xoa("R1");
        quanLyXeMay.print();
    }
}
