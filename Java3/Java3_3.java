 // リスト3-3　 {}　を省略した記述

public class Java3_3 {
    public static void main(String[] args) {
        boolean tenki = true ;
        if(tenki ==  true){                            //内容が2行なので{}省略不可
            System.out.println("洗濯します");
            System.out.println("散歩に行きます");
        } else                                         //内容が1行しかないので{}省略可
            System.out.println("DVDを見ます");

        
    }    
}
