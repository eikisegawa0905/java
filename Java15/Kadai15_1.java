package Java15;

public class Kadai15_1{
    public static void main(String[] args) {
        try{
        String s=null;
        System.out.println(s.length());
        //  練習問題15-1
        }catch(NullPointerException e){
        System.out.println("NullPointerException例外をcatchしました");
        System.out.println("スタックトレース（ここから）ーー");
        e.printStackTrace();
        System.out.println("スタックトレース（ここまで）ーー");
        }
    }
}