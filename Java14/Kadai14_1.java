package Java14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Kadai14_1 {
    public static void main(String[] args) {
        //①現在の日時をDate型で取得
        Date now=new Date();
        Calendar c=Calendar.getInstance();
        //②所得した日時情報をCalendarにセット
        c.setTime(now);
        //③Calendarから「日」の数値を所得
        int day=c.get(Calendar.DAY_OF_MONTH);
        //④所得した値に100足した値をCalendarの「日」にセットする
        day+=100;
        c.set(Calendar.DAY_OF_MONTH,day);
        //⑤Calendarの日付情報をDate型に変換
        Date future=c.getTime();
        //⑥SimpleDateFormatを用いて、Dateインスタンスの内容を表示する
        SimpleDateFormat f=new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}