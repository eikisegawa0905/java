package Java12;

public abstract class Character{    //<抽象メソッドを含むクラス宣言
    String name;
    int hp;
    // 逃げる
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    public abstract void attack(Monster m); //<詳細未定メソッド 12-7

    //戦う リスト12-1
    //public void attack(Monster m){   //<メソッドの中身を空にしておく　リスト12-2
        //System.out.println(this.name+"の攻撃");
        //m.hp-= ??; <ここを記述しようとして手が止まる　まだattack()の内容が確定できないため、書きようがない
        //System.out.println("敵に??ポイントのダメージを与えた");
} 

