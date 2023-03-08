/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai1;

public class Main {
    public static void main(String[] args) {
        // Nếu không truyền dữ liệu thì default r = 1
        Circle circle1 = new Circle();
        System.out.println("Test 1:");
        System.out.println("Chu vi hình tròn là:"+circle1.getArea());
        System.out.println("Diện tích hình tròn là: "+circle1.getCircumference());

        // Truyền vào r = 7
        System.out.println("\nTest 2:");
        Circle circle2 = new Circle(7);
        System.out.println("Chu vi hình tròn là:"+circle2.getArea());
        System.out.println("Diện tích hình tròn là: "+circle2.getCircumference());


        // Kiểm tra với những Circle có r < 0 => exception Error
        System.out.println("\nTest với điều kiện Error:");
        try{
            Circle circle3 = new Circle(-1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
