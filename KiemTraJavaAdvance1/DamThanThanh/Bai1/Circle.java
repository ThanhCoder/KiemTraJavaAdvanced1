/*
 * Create at 3/8/2023
 * Author Dam Than Thanh
 * */
package KiemTraJavaAdvance1.DamThanThanh.Bai1;

public class Circle {

    private double radius = 1.0;

    public Circle() {
    }

    /**
     * @param radius
     */
    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    /**
     * Lấy giá trị của radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Truyền vào giá trị radius
     * @param radius
     */
    public void setRadius(double radius) {
        if (radius <= 0)
        {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    /**
     * Get Area
     * @return double
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Get Circumference
     * @return double
     */
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

}
