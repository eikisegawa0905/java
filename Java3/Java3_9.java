
/// リスト3-9　for文のループを2重にして九九の表を出力させる


public class Java3_9{
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++ ){
            for (int j = 1; j <10 ; j++ ){
                System.out.print( i * j );
                System.out.print(" ");              //空白を出力
            }
                System.out.println(" ");              //改行を出力


        }
    }
    
}
