//  リスト5-10　オーバーロード（引数の型が異なる場合）

public class Java5_10{
    public static int add(int x,int y){
        return x+y;
    }
public static double add(double x,double y){
        return x+y;
    }
public static String add(String x,String y){
        return x+y;
    }
public static void main(String[] args) {
    System.out.println(add(10,20));     //< 一つ目のメソッド
    System.out.println(add(3.5,2.7));   //<　二つ目のメソッド
    System.out.println(add("Hello","World"));   //<　三つ目のメソッド
    }
}
