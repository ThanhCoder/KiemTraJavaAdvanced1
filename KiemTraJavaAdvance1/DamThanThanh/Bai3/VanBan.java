/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai3;

public class VanBan {

    private String noiDung;

    public VanBan() {
    }

    /**
     *
     * @param noiDung
     */
    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * Truyền vào thông tin nội dung
     * @param noiDung
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /*
    * Lấy thông tin nội dung truyền vào.
    * return @String
    * */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     *
     * @return temp
     */
    public String vietHoaToanBo(){
        String temp =  noiDung.toUpperCase();
        return temp;
    }

    public String vietThuongToanBo(){
        String temp = noiDung.toLowerCase();
        return temp;
    }

    public String chuanHoaVanBan(){
        String temp = noiDung.trim().replaceAll("\\s+"," ");
        return temp;
    }

    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(noiDung);
        long size = 0;
        for(int i = 0; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                size ++;
            }
        }
        return size;
    }

    /**
     *
     * @return String
     */
    public String vietHoaMoiTuDauTien(){
        noiDung = vietThuongToanBo();
        StringBuffer buffer = new StringBuffer(noiDung);
        buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        for (int i = 1; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                buffer.setCharAt(i+1, Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return noiDung;
    }
}
