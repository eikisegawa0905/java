// nullの利用　（エラーコード） 

public class Java4_14 {
    public static void main(String[] args) {
        int [] a ={1,2,3,};
            /// a=null;     コンパイルは成功するが、aを参照しなくなる
            a[0]=10;     

    }
}
