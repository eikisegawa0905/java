// 配列の裏側　実行結果

public class Java4_12{
    public static void main (String [] args){
        int[]a= {1,2,3,};
        int[]b;
        b=a;
        b[0]=100;
        System.out.println(a[0]);     
    }
}