package Java14;

import java.util.Date;  //  importしておくと便利
public class Java14_2 {
    public static void main(String[] args) {
        Date now=new Date();    //現在日時の取得
        System.out.println(now);
        System.out.println(now.getTime());
        Date past=new Date(1316622225935L);
        System.out.println(past);
    }
}
