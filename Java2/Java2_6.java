 /*リスト2-6 (エラーコード)

 public class Java2_6{
    public static void main (String [] args){
        int i = 3.2 ;   
    }
 }*/

 // リスト2＿6を正しくした場合

public class Java2_6{
    public static void main (String [] args){
        double i = 3.2 ;
        System.out.println(i);

    }
}