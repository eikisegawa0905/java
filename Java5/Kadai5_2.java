// 練習問題5-2　回答

public class Kadai5_2 {
    public static void main(String[] args) {
        String title = "食事会の件について";
        String address ="aaa@.com";
        String text ="○日に予定していた食事会についてですが、○日に延期できますでしょうか？";
        email(title,address,text);
    }
    public static void email(String title,String address,String text){

        System.out.println(address+"に、以下のメールを送信しました。");
        System.out.println("件名："+title);
        System.out.println("本文："+text);
    }
}
