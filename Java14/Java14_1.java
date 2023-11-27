package Java14;

public class Java14_1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        //ここで何らかの時間かかる処理
        long end=System.currentTimeMillis();
        System.out.println("処理にかかった時間は・・・"+(end-start)+"ミリ秒でした");
    }
}
