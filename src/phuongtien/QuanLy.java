package phuongtien;

public interface QuanLy<T> {
    void them(T t);

    void sua(String name , T t);

    void xoa(String name);

    int timKiem(String name);

    void print();
    void sapXep();

}
