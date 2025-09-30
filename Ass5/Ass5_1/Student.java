package advance_dev.Ass5.Ass5_1;

public class Student {
    private String mssv;
    private String hoTen;
    private double diem;

    public Student(String mssv, String hoTen, double diem) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // getter & setter
    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "MSSV: " + mssv + ", Họ tên: " + hoTen + ", Điểm: " + diem;
    }
}
