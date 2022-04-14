package phuongtien;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto> {
    private static Oto[] danhSach = new Oto[3];
    private static int size = 0;

    @Override
    public void them(Oto oto) {
        danhSach[size] = oto;
        size++;
    }

    @Override
    public void sua(String name, Oto oto) {
        danhSach[timKiem(name)] = oto;
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
        return 0;
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
        QuanLyOto quanLyOto = new QuanLyOto();
        Oto ot1=new Oto("toyota","Đen","A",500,7);
        Oto ot2=new Oto("toyota","vàng","B",700,4);
        Oto ot3=new Oto("toyota","xanh","C",800,16);
        quanLyOto.them(ot1);
        quanLyOto.them(ot2);
        quanLyOto.them(ot3);
        quanLyOto.print();
        Oto ot4=new Oto("toyota","đỏ","D",1000,30);
        quanLyOto.sua("C",ot4);
        quanLyOto.print();
        quanLyOto.sapXep();
        quanLyOto.xoa("B");
        quanLyOto.print();
   }
}
