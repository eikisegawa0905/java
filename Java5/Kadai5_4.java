//  練習問題5-4　回答

public class Kadai5_4 {
    public static void main(String[] args) {
        double TriangleArea=calcTrianlgeArea(10.0,5.0);
            System.out.println("三角形の面積は"+TriangleArea+"平方ｃｍ");
        double CircleArea= calcCircleArea(5.0);
            System.out.println("円の面積は"+CircleArea+"平方ｃｍ");
    }
    public static double calcTrianlgeArea(double bottom,double height) {
        double area = (bottom*height)/2;
        return area;
    }
    public static double calcCircleArea(double radius) {
        double area = radius*radius*3.14;
        return area;
        
    }
}
