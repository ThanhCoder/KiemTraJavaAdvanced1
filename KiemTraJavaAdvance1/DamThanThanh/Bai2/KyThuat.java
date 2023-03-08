/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai2;

public class KyThuat extends NhanVien{
    private String chuyenNghanh;

    /**
     *
     * @param maNhanVien
     * @param hoTen
     */
    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    /**
     *
     * @param maNhanVien
     * @param hoTen
     * @param namSinh
     * @param address
     * @param chuyenNghanh
     */
    public KyThuat(String maNhanVien, String hoTen, String namSinh, String address, String chuyenNghanh) {
        super(maNhanVien, hoTen, namSinh, address);
        this.chuyenNghanh = chuyenNghanh;
    }

    /**
     *
     * @param chuyenNghanh
     */
    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    /**
     *
     * @return chuyenNganh
     */
    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    /**
     *
     * @return text
     */
    public String moTaCongViec() {
        return "Lập trình viên Backend với ngôn ngữ lập trình JAVA";
    }

    @Override
    public String toString() {
        return "Kỹ Thuật[" + super.toString() +
                ", Chuyên ngành='" + chuyenNghanh + '\'' +
                ']';
    }
}
