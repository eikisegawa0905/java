package Java14;

import java.util.Calendar;
import java.util.Date;
public class Java14_3 {
    public static void main(String[] args) {
        //  現在の年を表示する
        Date now=new Date();
        Calendar c=Calendar.getInstance();
        c.setTime(now);
    int y=c.get(Calendar.YEAR);
    System.out.println("今年は"+y+"年です");
    //  指定した日のDateの値を得る
    c.set(2023,11,24,4,8,50);
    c.set(Calendar.YEAR,2023);
    c.getTime();
    }

}
