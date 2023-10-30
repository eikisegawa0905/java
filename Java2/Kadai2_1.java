 /*練習問題2-1 

 public class Kadai2_1 {
    public static void main (System [] args){
        int x = 5 ;
        int y = 10 ;
        String ans = "x + y は" + x + y ;
        System.out.println(ans);
    }
 } 

  x+y=15 と表示させたい   正しいコード　↓　*/

  public class Kadai2_1{
    public static void main(String[] args) {
        int x = 5 ,y = 10 ;
        String ans =("x+yは" + (x+y));
        System.out.println(ans);
    }
  }