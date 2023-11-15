package Java9;

public class Hero5 {
    String name;
    int hp;
    //int money;        <リスト9-17
    static int money;   //<静的フィールド



    static void setRandomMoney(){       //staticを付けたメソッド
        Hero5.money=(int)(Math.random()*1000);
        //  リスト9-23
       // System.out.println(this.name+"たちの所持金を初期化しました");
    }

}
