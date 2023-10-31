 // トイレの空きを待つ繰り返し処理

public class Java3_2 {
    public static void main (String [] args){
        boolean doorClose = true;
        while  (doorClose == true) {
             System.out.println("ノックする");
             System.out.println("一分待つ");        //3行目がtrueの場合、このプログラムを実行すると無限ループ    
        }
    }
}
