/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai2;

public abstract class NhanVien {

    private String maNhanVien;
    private String hoTen;
    private String namSinh;

    private String address;

    /**
     *
     * @param maNhanVien
     * @param hoTen
     */
    public NhanVien(String maNhanVien, String hoTen) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
    }

    /**
     *
     * @param maNhanVien
     * @param hoTen
     * @param namSinh
     * @param address
     */
    public NhanVien(String maNhanVien, String hoTen, String namSinh, String address) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.address = address;
    }

    /**
     *
     * @return maNhanVien
     */
    public String getMaNhanVien() {
        return maNhanVien;
    }

    /**
     *
     * @return hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    /**
     *
     * @param namSinh
     */
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nhân Viên[" +
                "Mã nhân viên='" + maNhanVien + '\'' +
                ", Họ Tên='" + hoTen + '\'' +
                ", Năm Sinh='" + namSinh + '\'' +
                ", Địa chỉ='" + address + '\'' +
                ']';
    }

    public abstract String moTaCongViec();


}
