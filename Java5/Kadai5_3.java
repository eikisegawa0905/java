// 練習問題5-3　回答

public class Kadai5_3 {
        public static void main(String[] args) {
            String address ="aaa@.com";
            String text ="○日に予定していた食事会についてですが、○日に延期できますでしょうか？";
            email(address,text);
        }
        public static void email(String address,String text){
    
            System.out.println(address+"に、以下のメールを送信しました。");
            System.out.println("件名：無題");
            System.out.println("本文："+text);
        }
        public static void email(String title,String address,String text) {
            System.out.println(address+"に、以下のメールを送信しました。");
            System.out.println("件名："+title);
            System.out.println("本文："+text);
        }
    }
    
    

